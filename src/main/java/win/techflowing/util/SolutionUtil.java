package win.techflowing.util;

import win.techflowing.config.Config;
import win.techflowing.model.GetQuestionDetailResponse;
import win.techflowing.util.code.Code;
import win.techflowing.util.file.FileUtil;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        Code code = Code.getInstance();
        // 文件名称
        String fileName = code.getFileName(question.getQuestionFrontendId(),
                question.getQuestionTitleSlug(),
                question.getDifficulty());

        if (new File(Config.SOLUTION_DIR, fileName).exists() && !Config.COVER_OLD) {
            System.out.println("题解：" + question.getQuestionTitle() + " 已存在，不重复保存");
            return;
        }

        String solutionContent = generateSolutionContent(question, acCode);
        if (solutionContent == null) {
            System.out.println("保存题解失败，solution content generate failed");
            return;
        }
        // 写入文件
        FileUtil.saveFile(Config.SOLUTION_DIR, fileName + code.getSolutionFileSuffix(), solutionContent);
        System.out.println("保存题解成功：" + fileName + code.getSolutionFileSuffix());
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getHexoHeaderContent(question.getQuestionFrontendId(), question.getQuestionTitle(),
                question.getTranslatedTitle()));
        stringBuilder.append("\n\n");
        stringBuilder.append("## 题目描述").append("\n\n");
        stringBuilder.append(question.getContent()).append("\n\n");
        stringBuilder.append("## 中文翻译").append("\n\n");
        stringBuilder.append(question.getTranslatedContent()).append("\n\n");
        stringBuilder.append("## AC代码").append("\n\n");
        stringBuilder.append("```\n").append(acCode).append("\n```");
        return stringBuilder.toString();
    }


    /**
     * 获取Hexo博客文章头部
     *
     * @param number          题目序号
     * @param title           题目名称
     * @param translatedTitle 中文题目名称
     */
    private static String getHexoHeaderContent(String number, String title, String translatedTitle) {
        String format = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return String.format("---\n" +
                        "title: %s. %s %s\n" +
                        "tags:\n" +
                        "  - LeetCode\n" +
                        "  - 算法\n" +
                        "categories:\n" +
                        "  - LeetCode\n" +
                        "toc: true\n" +
                        "comments: true\n" +
                        "home_visiable: hide\n" +
                        "archive_visiable: hide\n" +
                        "category_index: %s\n" +
                        "date: %s\n" +
                        "description:\n" +
                        "---",
                number, title, translatedTitle, number, sdf.format(new Date()));
    }
}
