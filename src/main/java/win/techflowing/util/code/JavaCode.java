package win.techflowing.util.code;

/**
 * Java默认代码处理
 */
public class JavaCode implements Code {

    /**
     * 默认代码格式处理
     *
     * @param number            题目序号
     * @param titleSlug         英文标题，"-"分割单词
     * @param difficulty        难易程度
     * @param originDefaultCode 原始的默认代码
     */
    public String formatDefaultCode(String number, String titleSlug, String difficulty, String originDefaultCode) {
        if (originDefaultCode == null) {
            return null;
        }
        String fileName = getFileName(number, titleSlug, difficulty);
        return originDefaultCode.replace("class Solution", "public class " + fileName);
    }

    /**
     * 获取源码文件名称
     *
     * @param number     题目编号
     * @param titleSlug  题目Slug，"-"分割单词
     * @param difficulty 题目难度
     */
    public String getFileName(String number, String titleSlug, String difficulty) {
        String difficultyPrefix = difficulty.substring(0, 1);
        String numberFormat = String.format("%03d", Integer.valueOf(number));
        String[] title = titleSlug.split("-");
        StringBuilder fileNameBuilder = new StringBuilder();
        fileNameBuilder.append(difficultyPrefix).append("_").append(numberFormat).append("_");
        for (String word : title) {
            fileNameBuilder.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
        }
        return fileNameBuilder.toString();
    }

    /**
     * 文件后缀
     */
    public String getFileNameSuffix() {
        return ".java";
    }
}
