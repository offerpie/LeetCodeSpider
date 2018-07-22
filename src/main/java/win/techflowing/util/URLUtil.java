package win.techflowing.util;

/**
 * URL工具类
 */
public class URLUtil {
    /** 跟路径 */
    private static final String ROOT_URL = "https://leetcode-cn.com";

    /**
     * 获取绝对URL
     *
     * @param relativeUrl 相对URL
     */
    public static String getAbsoluteUrl(String relativeUrl) {
        if (relativeUrl == null) {
            return ROOT_URL;
        }
        if (!relativeUrl.startsWith("/")) {
            relativeUrl = "/" + relativeUrl;
        }
        return ROOT_URL + relativeUrl;
    }
}
