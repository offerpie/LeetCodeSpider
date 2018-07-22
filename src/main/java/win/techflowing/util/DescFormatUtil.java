package win.techflowing.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;

/**
 * 格式化题目描述
 */
public class DescFormatUtil {

    /**
     * 格式化题目描述Html
     *
     * @param originDesc 原始描述html
     * @return 格式化后的描述
     */
    public static String formatDesc(String originDesc) {
        if (originDesc == null) {
            return null;
        }
        Document document = Jsoup.parse(originDesc);
        document.outputSettings(new Document.OutputSettings().prettyPrint(false));
        String result = Jsoup.clean(document.html(), "", Whitelist.none(),
                new Document.OutputSettings().prettyPrint(false));
        // 去除空格转义
        result = result.replace("&nbsp;", " ");
        // 去除 > 转义
        result = result.replace("&gt;", ">");
        result = result.replace("&lt;", "<");
        return result;
    }
}
