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

import java.util.List;


/**
 * 源码生成工具
 */
public class SourceCodeUtil {

    /**
     * 生成默认源码
     *
     * @param question 问题
     */
    public static void generateSourceCode(GetQuestionDetailResponse.DataBean.QuestionBean question) {
        if (question == null) {
            return;
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
        Code code = getCode();
        String defaultCode = code.formatDefaultCode(question.getQuestionFrontendId(),
                question.getQuestionTitleSlug(),
                question.getDifficulty(),
                originDefaultCode);
        // 拼接注释和原始代码
        StringBuilder contentBuilder = new StringBuilder();
        contentBuilder.append(annotationStr).append("\n").append(defaultCode);
        // 文件名称
        String fileName = code.getFileName(question.getQuestionFrontendId(),
                question.getQuestionTitleSlug(),
                question.getDifficulty());
        // 写入文件
        FileUtil.saveSourceFile(fileName + code.getFileNameSuffix(), contentBuilder.toString());
        System.out.println("保存文件成功：" + fileName + code.getFileNameSuffix());
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
            if (codeDefinition != null && Config.SOURCE_CODE_TYPE.equals(codeDefinition.getText())) {
                return codeDefinition.getDefaultCode();
            }
        }
        return null;
    }

    /**
     * 获取{@link Code}实现类
     */
    private static Code getCode() {
        if (Config.SOURCE_CODE_TYPE.equals("Java")) {
            return new JavaCode();
        }
        // 其他类型语言暂未实现
        return new JavaCode();
    }

    /**
     * 获取{@link Annotation}实现类
     */
    private static Annotation getAnnotation() {
        if (Config.SOURCE_CODE_TYPE.equals("Java")) {
            return new JavaDoc();
        }
        // 其他类型语言暂未实现
        return new JavaDoc();
    }
}
