package win.techflowing.util.annotation;

/**
 * Java文件类注释生成工具
 */
public class JavaDoc implements Annotation {

    /**
     * 生成Java注释
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
    public String generatorAnnotation(String number,
                                      String url,
                                      String chineseTitle,
                                      String chineseDesc,
                                      String englishTitle,
                                      String englishDesc,
                                      String difficulty,
                                      String sampleTestCase) {
        StringBuilder resultBuild = new StringBuilder();
        resultBuild.append("/**").append("\n");
        resultBuild.append(" * ").append("[").append(number).append("] ").append(englishTitle).append("\n * \n");
        resultBuild.append(" * difficulty: ").append(difficulty).append("\n * \n");
        sampleTestCase = sampleTestCase.replace("\n", " ");
        resultBuild.append(" * TestCase Example: ").append(sampleTestCase).append("\n * \n");
        resultBuild.append(" * ").append(url).append("\n * \n * \n");
        if (englishDesc != null) {
            String[] engDescLineArray = englishDesc.split("\\n");
            for (String line : engDescLineArray) {
                resultBuild.append(" * ").append(line).append("\n");
            }
        }
        resultBuild.append(" * \n * \n * \n");
        resultBuild.append(" * >>>>>>中文描述<<<<<<").append("\n * \n * \n");
        resultBuild.append(" * ").append("[").append(number).append("] ").append(chineseTitle).append("\n * \n * \n");
        if (chineseDesc != null) {
            String[] chineseDescLineArray = chineseDesc.split("\\n");
            for (String line : chineseDescLineArray) {
                resultBuild.append(" * ").append(line).append("\n");
            }
        }
        resultBuild.append(" * \n");
        resultBuild.append(" */");
        return resultBuild.toString();
    }
}
