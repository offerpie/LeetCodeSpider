/**
 * [553] Optimal Division
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [1000,100,10,2]
 * 
 * https://leetcode-cn.com/problems/optimal-division/
 * 
 * 
 * Given a list of positive integers, the adjacent integers will perform the float division. For example, [2,3,4] -> 2 / 3 / 4.
 * 
 * However, you can add any number of parenthesis at any position to change the priority of operations. You should find out how to add parenthesis to get the maximum result, and return the corresponding expression in string format. Your expression should NOT contain redundant parenthesis.
 * 
 * Example:
 * 
 * Input: [1000,100,10,2]
 * Output: "1000/(100/10/2)"
 * Explanation:
 * 1000/(100/10/2) = 1000/((100/10)/2) = 200
 * However, the bold parenthesis in "1000/((100/10)/2)" are redundant, since they don't influence the operation priority. So you should return "1000/(100/10/2)". 
 * 
 * Other cases:
 * 1000/(100/10)/2 = 50
 * 1000/(100/(10/2)) = 50
 * 1000/100/10/2 = 0.5
 * 1000/100/(10/2) = 2
 * 
 * 
 * 
 * Note:
 * 
 * The length of the input array is [1, 10].
 * Elements in the given array will be in range [2, 1000].
 * There is only one optimal division for each test case.
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [553] 最优除法
 * 
 * 
 * 给定一组正整数，相邻的整数之间将会进行浮点除法操作。例如， [2,3,4] -> 2 / 3 / 4 。
 * 
 * 但是，你可以在任意位置添加任意数目的括号，来改变算数的优先级。你需要找出怎么添加括号，才能得到最大的结果，并且返回相应的字符串格式的表达式。你的表达式不应该含有冗余的括号。
 * 
 * 示例：
 * 
 * 输入: [1000,100,10,2]
 * 输出: "1000/(100/10/2)"
 * 解释:
 * 1000/(100/10/2) = 1000/((100/10)/2) = 200
 * 但是，以下加粗的括号 "1000/((100/10)/2)" 是冗余的，
 * 因为他们并不影响操作的优先级，所以你需要返回 "1000/(100/10/2)"。
 * 
 * 其他用例:
 * 1000/(100/10)/2 = 50
 * 1000/(100/(10/2)) = 50
 * 1000/100/10/2 = 0.5
 * 1000/100/(10/2) = 2
 * 
 * 
 * 说明:
 * 
 * 
 * 	输入数组的长度在 [1, 10] 之间。
 * 	数组中每个元素的大小都在 [2, 1000] 之间。
 * 	每个测试用例只有一个最优除法解。
 * 
 */
public class M_553_OptimalDivision {
    public String optimalDivision(int[] nums) {
        
    }
}