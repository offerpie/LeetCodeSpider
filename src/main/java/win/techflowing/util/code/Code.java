package win.techflowing.util.code;

import win.techflowing.config.Config;

/**
 * 默认代码处理
 */
public interface Code {

    /**
     * 默认代码格式处理
     *
     * @param number            题目序号
     * @param titleSlug         英文标题，"-"分割单词
     * @param difficulty        难易程度
     * @param originDefaultCode 原始的默认代码
     */
    String formatDefaultCode(String number, String titleSlug, String difficulty, String originDefaultCode);

    /**
     * 获取源码文件名称
     */
    String getFileName(String number, String titleSlug, String difficulty);

    /**
     * 文件后缀
     */
    String getFileNameSuffix();

    /**
     * 题解文件后缀
     */
    String getSolutionFileSuffix();

    /**
     * 获取Code
     */
    static Code getInstance() {
        switch (Config.SOURCE_CODE_TYPE) {
            case JAVA:
                return new JavaCode();
            // 其他类型语言暂未实现
            default:
                return new JavaCode();
        }
    }
}
