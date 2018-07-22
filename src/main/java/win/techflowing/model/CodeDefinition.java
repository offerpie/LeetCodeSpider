package win.techflowing.model;


/**
 * 默认代码定义
 */
public class CodeDefinition {

    /**
     * value : cpp
     * text : C++
     * defaultCode : class Solution {
     public:
     vector<int> twoSum(vector<int>& nums, int target) {

     }
     };
     */

    private String value;
    private String text;
    private String defaultCode;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDefaultCode() {
        return defaultCode;
    }

    public void setDefaultCode(String defaultCode) {
        this.defaultCode = defaultCode;
    }
}
