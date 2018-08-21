package win.techflowing;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import win.techflowing.config.Config;
import win.techflowing.model.GetAllQuestionResponse;
import win.techflowing.model.GetAnswerResponse;
import win.techflowing.model.GetQuestionDetailRequest;
import win.techflowing.model.GetQuestionDetailResponse;
import win.techflowing.network.RestClient;
import win.techflowing.util.SolutionUtil;
import win.techflowing.util.SourceCodeUtil;
import win.techflowing.util.URLUtil;
import win.techflowing.util.file.FileUtil;

import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * LeetCode题目爬虫
 */
public class LeetCodeSpider {

    /** API成功 */
    private static final int SUCCESS = 200;
    /** 题目AC */
    private static final String AC_STATUS = "ac";
    /** Lock 锁 */
    private Lock mLock = new ReentrantLock();
    /** 条件变量 */
    private Condition mCondition = mLock.newCondition();
    /** 获取题目失败的次数 */
    private int mGetQuesionFailedCount = 0;
    /** 获取AC代码失败的次数 */
    private int mGetAnswerFailedCount = 0;

    /**
     * 开始
     */
    public void start() {
        System.out.println("开始抓取LeetCode题目");
        getAllQuestion();
    }

    /**
     * 获取所有题目
     */
    private void getAllQuestion() {
        RestClient.get().getAPIService().getQuestionList().enqueue(new Callback<GetAllQuestionResponse>() {
            public void onResponse(Call<GetAllQuestionResponse> call, Response<GetAllQuestionResponse> response) {
                if (response.code() == SUCCESS && response.body() != null) {
                    getQuestionListSuccess(response.body().getStatStatusPairs());
                } else {
                    System.out.println("获取题目列表失败" + response.code());
                }
            }

            public void onFailure(Call<GetAllQuestionResponse> call, Throwable throwable) {
                System.out.println("获取题目列表失败：" + throwable.getMessage());
            }
        });
    }

    /**
     * 获取题目详情
     *
     * @param question 问题
     */
    private void getQuestionDetail(final GetAllQuestionResponse.StatStatusPairsBean question) {
        GetQuestionDetailRequest request = new GetQuestionDetailRequest(question.getStat().getQuestionTitleSlug());
        RestClient.get().getAPIService().getQuestionDetail(request).enqueue(new Callback<GetQuestionDetailResponse>() {
            public void onResponse(Call<GetQuestionDetailResponse> call, Response<GetQuestionDetailResponse> response) {
                if (response.code() == SUCCESS && response.body() != null) {
                    getQuestionDetailSuccess(question, response.body().getData().getQuestion());
                } else {
                    mGetQuesionFailedCount++;
                    System.out.println("获取题目详情失败" + response.code());
                    notifyWaitLock();
                }
            }

            public void onFailure(Call<GetQuestionDetailResponse> call, Throwable throwable) {
                mGetQuesionFailedCount++;
                System.out.println("获取题目详情失败：" + throwable.getMessage());
                notifyWaitLock();
            }
        });
    }

    /**
     * 获取AC代码
     *
     * @param question       题目概述
     * @param questionDetail 题目详情
     */
    private void getAnswer(GetAllQuestionResponse.StatStatusPairsBean question,
                           final GetQuestionDetailResponse.DataBean.QuestionBean questionDetail) {
        String lang = Config.SOURCE_CODE_TYPE.mValue;
        RestClient.get().getAPIService().getAnswer(question.getStat().getQuestionId(), lang)
                .enqueue(new Callback<GetAnswerResponse>() {
                    public void onResponse(Call<GetAnswerResponse> call, Response<GetAnswerResponse> response) {
                        if (response.code() == SUCCESS && response.body() != null) {
                            SolutionUtil.saveSolution(questionDetail, response.body().getCode());
                        } else {
                            mGetAnswerFailedCount++;
                            System.out.println("获取AC代码失败" + response.code());
                        }
                        notifyWaitLock();
                    }

                    public void onFailure(Call<GetAnswerResponse> call, Throwable throwable) {
                        mGetAnswerFailedCount++;
                        System.out.println("获取AC代码失败：" + throwable.getMessage());
                        notifyWaitLock();
                    }
                });
    }

    /**
     * 获取题目详情成功
     *
     * @param question       题目概述
     * @param questionDetail 题目详情
     */
    private void getQuestionDetailSuccess(GetAllQuestionResponse.StatStatusPairsBean question,
                                          GetQuestionDetailResponse.DataBean.QuestionBean questionDetail) {
        // 保存为源码文件（不包含答案）
        SourceCodeUtil.saveQuestion(questionDetail);
        // 获取题解，保存为markdown
        if (Config.GET_SOLUTION && AC_STATUS.equals(question.getStatus())
                && (Config.COVER_OLD || !FileUtil.isSolutionExist(question))) {
            try {
                String title = question.getStat().getQuestionTitle();
                System.out.println("等待抓取 " + title + " 的题解...");
                Thread.sleep(Config.SPIDER_INTERNAL);
                System.out.println("开始获取 " + title + " 的题解");
                getAnswer(question, questionDetail);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            notifyWaitLock();
        }
    }


    /**
     * 获取题目详情成功
     *
     * @param questionList 题目列表
     */
    private void getQuestionListSuccess(List<GetAllQuestionResponse.StatStatusPairsBean> questionList) {
        if (questionList == null) {
            System.out.println("题目列表为空");
            return;
        }
        System.out.println("题目总数为：" + questionList.size());
        int size = questionList.size();
        for (int i = 0; i < size; i++) {
            GetAllQuestionResponse.StatStatusPairsBean question = questionList.get(i);
            // 判断是否需要抓取
            if (!isNeedSpider(question)) {
                System.out.println("\n不需要抓取：" + question.getStat().getFrontendQuestionId() + "、"
                        + question.getStat().getQuestionTitle() + "\n");
                continue;
            }
            String title = question.getStat().getQuestionTitle();
            System.out.println("开始抓取第 " + (i + 1) + " 项，题目名称：" + title);
            mLock.lock();
            try {
                // 获取题目详情，保存为源码文件（不包含答案）
                getQuestionDetail(question);
                mCondition.await();
                System.out.println("等待抓取下一题...");
                Thread.sleep(Config.SPIDER_INTERNAL);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                mLock.unlock();
            }
            System.out.println();
        }
        System.out.println(">>>>>>全部结束<<<<<<");
        System.out.println("题目总数：" + size);
        System.out.println("题目获取失败数量：" + mGetQuesionFailedCount);
        System.out.println("获取AC代码失败数量：" + mGetAnswerFailedCount);
    }

    /**
     * 是否需要抓取
     * 不需要：
     * 有源码文件，有题解
     * 有源码文件，没AC
     */
    private boolean isNeedSpider(GetAllQuestionResponse.StatStatusPairsBean statStatusPairsBean) {
        if (Config.COVER_OLD) {
            return true;
        }
        if (statStatusPairsBean == null) {
            return true;
        }
        if (FileUtil.isSourceCodeExist(statStatusPairsBean)) {
            if (FileUtil.isSolutionExist(statStatusPairsBean) || !AC_STATUS.equals(statStatusPairsBean.getStatus())) {
                return false;
            }
        }
        return true;
    }

    /**
     * 唤醒等待锁
     */
    private void notifyWaitLock() {
        mLock.lock();
        try {
            mCondition.signal();
        } finally {
            mLock.unlock();
        }
    }
}
