package win.techflowing.util.file;

import win.techflowing.config.Config;
import win.techflowing.model.GetAllQuestionResponse;
import win.techflowing.util.code.Code;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 * File操作相关工具类
 */
public class FileUtil {

    /**
     * 保存源码文件
     *
     * @param dirName  文件夹
     * @param fileName 文件名称
     * @param content  文件内容
     */
    public static void saveFile(String dirName, String fileName, String content) {
        File dir = new File(dirName);
        if (!dir.exists()) {
            if (!dir.mkdirs()) {
                System.out.println("文件夹创建失败");
                return;
            }
        }
        File sourceFile = new File(dir, fileName);
        try {
            FileWriter fileWriter = new FileWriter(sourceFile);
            fileWriter.write(content);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("存储文件出错：" + fileName);
        }
    }

    /**
     * 源码文件是否存在
     */
    public static boolean isSourceCodeExist(GetAllQuestionResponse.StatStatusPairsBean statStatusPairsBean) {
        if (statStatusPairsBean == null) {
            return false;
        }
        Code code = Code.getInstance();
        // 文件名称
        String fileName = code.getFileName(String.valueOf(statStatusPairsBean.getStat().getFrontendQuestionId()),
                statStatusPairsBean.getStat().getQuestionTitleSlug(),
                difficultyConvert(statStatusPairsBean.getDifficulty().getLevel()));
        return new File(Config.SOURCE_FILE_DIR, fileName + code.getFileNameSuffix()).exists();
    }

    /**
     * 题解文件是否存在
     */
    public static boolean isSolutionExist(GetAllQuestionResponse.StatStatusPairsBean statStatusPairsBean) {
        if (statStatusPairsBean == null) {
            return false;
        }
        Code code = Code.getInstance();
        // 文件名称
        String fileName = code.getFileName(String.valueOf(statStatusPairsBean.getStat().getFrontendQuestionId()),
                statStatusPairsBean.getStat().getQuestionTitleSlug(),
                difficultyConvert(statStatusPairsBean.getDifficulty().getLevel()));
        return new File(Config.SOLUTION_DIR, fileName + code.getSolutionFileSuffix()).exists();
    }


    /**
     * 难度转换
     * 1：
     */
    private static String difficultyConvert(int difficulty) {
        switch (difficulty) {
            case 1:
                return "E";
            case 2:
                return "M";
            case 3:
                return "H";
            default:
                return "U";

        }
    }
}
