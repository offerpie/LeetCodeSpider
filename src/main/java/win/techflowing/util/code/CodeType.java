package win.techflowing.util.code;

/**
 * 语言类型
 *
 * @author techflowing
 * @version v1.0
 * @since 2018/8/19
 */
public enum CodeType {

    CPP("C++", "cpp"),
    JAVA("Java", "java"),
    PYTHON("Python", "python"),
    PYTHON_3("Python3", "python3"),
    C("C", "c"),
    C_SHARP("C#", "csharp"),
    JAVASCRIPT("JavaScript", "javascript"),
    RUBY("Ruby", "ruby"),
    GO("Go", "golang"),
    SCALA("Scala", "scala"),
    KOTLIN("Kotlin", "kotlin");


    /** 用于网站显示 */
    public String mText;
    /** 用于网络请求 */
    public String mValue;

    CodeType(String text, String value) {
        mText = text;
        mValue = value;
    }

}
