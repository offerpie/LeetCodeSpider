package win.techflowing;

/**
 * 配置文件
 *
 * @author techflowing
 * @version v1.0
 * @since 2018/7/21
 */
public class Config {

    /** 源码类型集合 */
    private static final String[] SOURCE_CODE =
            new String[]{"C++", "Java", "Python", "Python3",
                    "C", "C#", "JavaScript", "Ruby", "Swift", "Go", "Scala", "Kotlin"};

    /** Https证书地址 */
    public static final String CERTIFICATE = "/**/**.cer";
    /** UA */
    public static final String USER_AGENT = "**";
    /** referer */
    public static final String REFERER = "https://leetcode-cn.com/problemset/algorithms/";
    /** cookie */
    public static final String COOKIE = "**";
    /** x-csrfToken */
    public static final String X_CSRF_TOKEN = "**";
    /** 源码类型：Java，当前仅支持Java源码添加注释，其他类型可能出现注释格式问题 */
    public static final String SOURCE_CODE_TYPE = SOURCE_CODE[1];
    /** 源文件保存目录 */
    public static final String SOURCE_FILE_DIR = "**";
    /** 题目抓取间隔 */
    public static final int SPIDER_INTERNAL = 10 * 1000;
}
