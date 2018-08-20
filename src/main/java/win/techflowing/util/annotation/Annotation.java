package win.techflowing.util.annotation;

import win.techflowing.config.Config;

/**
 * 注释生成抽象
 */
public interface Annotation {

    /**
     * 生成注释
     *
     * @param number         题目序号
     * @param url            题目链接
     * @param chineseTitle   中文标题
     * @param chineseDesc    中文描述
     * @param englishDesc    英文标题
     * @param englishTitle   英文描述
     * @param difficulty     题目难度
     * @param sampleTestCase 测试数据
     * @return JavaDoc
     */
    String generatorAnnotation(String number,
                               String url,
                               String chineseTitle,
                               String chineseDesc,
                               String englishTitle,
                               String englishDesc,
                               String difficulty,
                               String sampleTestCase);

    /**
     * 获取Annotation
     */
    static Annotation getInstance() {
        switch (Config.SOURCE_CODE_TYPE) {
            case JAVA:
                return new JavaDoc();
            // 其他类型语言暂未实现
            default:
                return new JavaDoc();
        }
    }
}
