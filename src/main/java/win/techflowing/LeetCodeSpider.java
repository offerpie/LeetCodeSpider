package win.techflowing;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import win.techflowing.model.GetAllQuestionResponse;
import win.techflowing.model.GetQuestionDetailRequest;
import win.techflowing.model.GetQuestionDetailResponse;
import win.techflowing.network.RestClient;
import win.techflowing.util.SourceCodeUtil;

import java.util.List;

/**
 * LeetCode题目爬虫
 */
public class LeetCodeSpider {

    /** API成功 */
    private static final int SUCCESS = 200;

    public static void main(String[] args) {
        new LeetCodeSpider().start();
    }

    /**
     * 开始
     */
    private void start() {
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
                    getQuestionDetail(response.body().getStatStatusPairs());
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
     * @param questionList 题目列表
     */
    private void getQuestionDetail(List<GetAllQuestionResponse.StatStatusPairsBean> questionList) {
        if (questionList == null) {
            System.out.println("题目列表为空");
            return;
        }
        int size = questionList.size();
        for (int i = 0; i < size; i++) {
            GetAllQuestionResponse.StatStatusPairsBean question = questionList.get(i);
            GetQuestionDetailRequest request = new GetQuestionDetailRequest(question.getStat().getQuestionTitleSlug());
            RestClient.get().getAPIService().getQuestionDetail(request).enqueue(new Callback<GetQuestionDetailResponse>() {
                public void onResponse(Call<GetQuestionDetailResponse> call, Response<GetQuestionDetailResponse> response) {
                    if (response.code() == SUCCESS && response.body() != null) {
                        saveQuestion(response.body().getData().getQuestion());
                    } else {
                        System.out.println("获取题目详情失败" + response.code());
                    }
                }

                public void onFailure(Call<GetQuestionDetailResponse> call, Throwable throwable) {
                    System.out.println("获取题目详情失败：" + throwable.getMessage());
                }
            });
            try {
                Thread.sleep(Config.SPIDER_INTERNAL);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("抓取题目完成，共计：" + size);
    }

    /**
     * 保存文件
     *
     * @param question 问题详情
     */
    private void saveQuestion(GetQuestionDetailResponse.DataBean.QuestionBean question) {
        SourceCodeUtil.generateSourceCode(question);
    }
}
