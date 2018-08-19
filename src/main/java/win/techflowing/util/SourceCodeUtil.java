package win.techflowing.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import win.techflowing.Config;
import win.techflowing.model.CodeDefinition;
import win.techflowing.model.GetQuestionDetailResponse;
import win.techflowing.util.annotation.Annotation;
import win.techflowing.util.annotation.JavaDoc;
import win.techflowing.util.code.JavaCode;
import win.techflowing.util.code.Code;
import win.techflowing.util.file.FileUtil;

import java.io.File;
import java.util.List;


/**
 * 源码生成工具
 */
public class SourceCodeUtil {

    /**
     * 保存题目源文件
     *
     * @param question 问题详情
     */
    public static void saveQuestion(GetQuestionDetailResponse.DataBean.QuestionBean question) {
        Code code = getCode();
        // 文件名称
        String fileName = code.getFileName(question.getQuestionFrontendId(),
                question.getQuestionTitleSlug(),
                question.getDifficulty());

        if (new File(Config.SOURCE_FILE_DIR, fileName + code.getFileNameSuffix()).exists() && !Config.COVER_OLD) {
            System.out.println("题目：" + question.getQuestionTitle() + " 已存在，不重复保存");
            return;
        }

        String sourceCode = generateSourceCode(question, code);
        if (sourceCode == null) {
            System.out.println("保存题目失败，source code generate failed");
            return;
        }
        // 写入文件
        FileUtil.saveSourceFile(fileName + code.getFileNameSuffix(), sourceCode);
        System.out.println("保存题目成功：" + fileName + code.getFileNameSuffix());
    }

    /**
     * 生成默认源码
     *
     * @param question 问题
     * @param code     Code
     */
    private static String generateSourceCode(GetQuestionDetailResponse.DataBean.QuestionBean question, Code code) {
        if (question == null) {
            return null;
        }
        // 注释
        Annotation annotation = getAnnotation();
        String annotationStr = annotation.generatorAnnotation(question.getQuestionFrontendId(),
                URLUtil.getAbsoluteUrl(question.getQuestionDetailUrl()),
                question.getTranslatedTitle(),
                DescFormatUtil.formatDesc(question.getTranslatedContent()),
                question.getQuestionTitle(),
                DescFormatUtil.formatDesc(question.getContent()),
                question.getDifficulty(),
                question.getSampleTestCase());
        // 默认初始代码
        String originDefaultCode = getOriginDefaultCode(question.getCodeDefinition());
        String defaultCode = code.formatDefaultCode(question.getQuestionFrontendId(),
                question.getQuestionTitleSlug(),
                question.getDifficulty(),
                originDefaultCode);
        // 拼接注释和原始代码
        StringBuilder contentBuilder = new StringBuilder();
        contentBuilder.append(annotationStr).append("\n").append(defaultCode);
        return contentBuilder.toString();
    }

    /**
     * 根据语言类型配置获取默认代码
     *
     * @param multiDefaultCode 默认代码集合
     * @return 默认代码
     */
    private static String getOriginDefaultCode(String multiDefaultCode) {
        if (multiDefaultCode == null) {
            return null;
        }
        Gson gson = new Gson();
        List<CodeDefinition> codeDefinitionList = gson.fromJson(multiDefaultCode,
                new TypeToken<List<CodeDefinition>>() {
                }.getType());
        if (codeDefinitionList == null) {
            return null;
        }
        for (CodeDefinition codeDefinition : codeDefinitionList) {
            if (codeDefinition != null && Config.SOURCE_CODE_TYPE.mText.equals(codeDefinition.getText())) {
                return codeDefinition.getDefaultCode();
            }
        }
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

    /**
     * 获取{@link Annotation}实现类
     */
    private static Annotation getAnnotation() {
        switch (Config.SOURCE_CODE_TYPE) {
            case JAVA:
                return new JavaDoc();
            // 其他类型语言暂未实现
            default:
                return new JavaDoc();
        }
    }
}
