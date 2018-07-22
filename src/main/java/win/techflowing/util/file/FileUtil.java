package win.techflowing.util.file;

import win.techflowing.Config;

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
     * @param fileName 文件名称
     * @param content  文件内容
     */
    public static void saveSourceFile(String fileName, String content) {
        File dir = new File(Config.SOURCE_FILE_DIR);
        if (!dir.exists()) {
            if (!dir.mkdirs()) {
                System.out.println("源码文件夹创建失败");
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
            System.out.println("存储源码文件出错：" + fileName);
        }
    }
}
