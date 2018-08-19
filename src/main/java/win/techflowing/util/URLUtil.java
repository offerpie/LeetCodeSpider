package win.techflowing.util;

import com.sun.javafx.binding.StringFormatter;

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

    /**
     * 获取题目的地址
     *
     * @param questionSlug 题目名称
     */
    public static String getQuestionDescUrl(String questionSlug) {
        if (questionSlug == null) {
            return ROOT_URL;
        }
        return String.format(ROOT_URL + "/problems/%s/description/", questionSlug);
    }
}
