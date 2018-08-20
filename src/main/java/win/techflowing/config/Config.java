package win.techflowing.config;

import win.techflowing.util.code.CodeType;

/**
 * 配置文件
 *
 * @author techflowing
 * @version v1.0
 * @since 2018/7/21
 */
public class Config {

    /** Https证书地址 */
    public static final String CERTIFICATE = PrivateConfig.CERTIFICATE;
    /** UA */
    public static final String USER_AGENT = PrivateConfig.USER_AGENT;
    /** referer */
    public static final String REFERER = "https://leetcode-cn.com/problemset/algorithms/";
    /** cookie */
    public static final String COOKIE = PrivateConfig.COOKIE;
    /** x-csrfToken */
    public static final String X_CSRF_TOKEN = PrivateConfig.X_CSRF_TOKEN;
    /** 源码类型：Java，当前仅支持Java源码添加注释，其他类型可能出现注释格式问题 */
    public static final CodeType SOURCE_CODE_TYPE = CodeType.JAVA;
    /** 源文件保存目录 */
    public static final String SOURCE_FILE_DIR = PrivateConfig.SOURCE_FILE_DIR;
    /** 题解保存目录 */
    public static final String SOLUTION_DIR = PrivateConfig.SOLUTION_DIR;
    /** 题目抓取间隔，单位：ms */
    public static final int SPIDER_INTERNAL = 5 * 1000;
    /** 是否保存题解文件，保存问markdown文件 */
    public static final boolean GET_SOLUTION = true;
    /** 题目或者题解存在时，是否覆盖旧的 */
    public static final boolean COVER_OLD = false;
}
