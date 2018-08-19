package win.techflowing.util;

import win.techflowing.Config;
import win.techflowing.model.GetQuestionDetailResponse;
import win.techflowing.util.code.Code;
import win.techflowing.util.code.JavaCode;

import java.io.File;

/**
 * 题解相关工具
 *
 * @author techflowing
 * @version v1.0
 * @since 2018/8/19
 */
public class SolutionUtil {

    /**
     * 保存题解
     *
     * @param question 题目详情
     * @param acCode   AC代码
     */
    public static void saveSolution(GetQuestionDetailResponse.DataBean.QuestionBean question, String acCode) {
        if (question == null || acCode == null) {
            System.out.println("保存题解失败");
            return;
        }
        Code code = getCode();
        // 文件名称
        String fileName = code.getFileName(question.getQuestionFrontendId(),
                question.getQuestionTitleSlug(),
                question.getDifficulty());

        if (new File(Config.SOLUTION_DIR, fileName).exists() && !Config.COVER_OLD) {
            System.out.println("题解：" + question.getQuestionTitle() + " 已存在，不重复保存");
            return;
        }

    }

    /**
     * 生成题解文件内容
     *
     * @param question 题目详情
     * @param acCode   AC代码
     * @return 文件内容
     */
    private static String generateSolutionContent(GetQuestionDetailResponse.DataBean.QuestionBean question, String acCode) {
        if (question == null) {
            return null;
        }
        return null;
    }


    /**
     * 获取Hexo博客文章头部
     */
    private static String getHexoHeaderContent(String number, String title) {
        return null;
    }

    /**
     * 获取{@link Code}实现类
     */
    private static Code getCode() {
        switch (Config.SOURCE_CODE_TYPE) {
            case JAVA:
                return new JavaCode();
            // 其他类型语言暂未实现
            default:
                return new JavaCode();
        }
    }
}
