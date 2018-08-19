package win.techflowing.model;

/**
 * 获取AC代码返回体
 *
 * @author techflowing
 * @version v1.0
 * @since 2018/8/19
 */
public class GetAnswerResponse {

    /**
     * code : class Solution {
     public int[] twoSum(int[] numbers, int target) {
     HashMap<Integer, Integer> map = new HashMap<>();

     for (int i = 0; i < numbers.length; i++) {
     if (map.get(numbers[i]) != null) {
     int[] result = {map.get(numbers[i]), i};
     return result;
     }
     map.put(target - numbers[i], i);
     }

     int[] result = {};
     return result;
     }
     }
     */

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
