/**
 * [740] Delete and Earn
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [3,4,2]
 * 
 * https://leetcode-cn.com/problems/delete-and-earn/
 * 
 * 
 * 
 * Given an array nums of integers, you can perform operations on the array.
 * 
 * In each operation, you pick any nums[i] and delete it to earn nums[i] points.  After, you must delete every element equal to nums[i] - 1 or nums[i] + 1.
 * 
 * You start with 0 points.  Return the maximum number of points you can earn by applying such operations.
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [3, 4, 2]
 * Output: 6
 * Explanation: 
 * Delete 4 to earn 4 points, consequently 3 is also deleted.
 * Then, delete 2 to earn 2 points. 6 total points are earned.
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [2, 2, 3, 3, 3, 4]
 * Output: 9
 * Explanation: 
 * Delete 3 to earn 3 points, deleting both 2's and the 4.
 * Then, delete 3 again to earn 3 points, and 3 again to earn 3 points.
 * 9 total points are earned.
 * 
 * 
 * 
 * Note:
 * The length of nums is at most 20000.
 * Each element nums[i] is an integer in the range [1, 10000].
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [740] 删除与获得点数
 * 
 * 
 * 给定一个整数数组 nums ，你可以对它进行一些操作。
 * 
 * 每次操作中，选择任意一个 nums[i] ，删除它并获得 nums[i] 的点数。之后，你必须删除每个等于 nums[i] - 1 或 nums[i] + 1 的元素。
 * 
 * 开始你拥有 0 个点数。返回你能通过这些操作获得的最大点数。
 * 
 * 示例 1:
 * 
 * 输入: nums = [3, 4, 2]
 * 输出: 6
 * 解释: 
 * 删除 4 来获得 4 个点数，因此 3 也被删除。
 * 之后，删除 2 来获得 2 个点数。总共获得 6 个点数。
 * 
 * 
 * 示例 2:
 * 
 * 输入: nums = [2, 2, 3, 3, 3, 4]
 * 输出: 9
 * 解释: 
 * 删除 3 来获得 3 个点数，接着要删除两个 2 和 4 。
 * 之后，再次删除 3 获得 3 个点数，再次删除 3 获得 3 个点数。
 * 总共获得 9 个点数。
 * 
 * 
 * 注意:
 * 
 * 
 * 	nums的长度最大为20000。
 * 	每个整数nums[i]的大小都在[1, 10000]范围内。
 * 
 */
public class M_740_DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        
    }
}