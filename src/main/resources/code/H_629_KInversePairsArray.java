/**
 * [629] K Inverse Pairs Array
 * 
 * difficulty: Hard
 * 
 * TestCase Example: 3 0
 * 
 * https://leetcode-cn.com/problems/k-inverse-pairs-array/
 * 
 * 
 * 
 * Given two integers n and k, find how many different arrays consist of numbers from 1 to n such that there are exactly k inverse pairs. 
 * 
 * 
 * We define an inverse pair as following:
 * For ith and jth element in the array, if i < j and a[i] > a[j] then it's an inverse pair; Otherwise, it's not.
 * 
 * 
 * 
 * Since the answer may be very large, the answer should be modulo 109 + 7.
 * 
 * 
 * Example 1:
 * 
 * Input: n = 3, k = 0
 * Output: 1
 * Explanation: 
 * Only the array [1,2,3] which consists of numbers from 1 to 3 has exactly 0 inverse pair.
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: n = 3, k = 1
 * Output: 2
 * Explanation: 
 * The array [1,3,2] and [2,1,3] have exactly 1 inverse pair.
 * 
 * 
 * 
 * Note:
 * 
 * The integer n is in the range [1, 1000] and k is in the range [0, 1000].
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [629] K个逆序对数组
 * 
 * 
 * 给出两个整数 n 和 k，找出所有包含从 1 到 n 的数字，且恰好拥有 k 个逆序对的不同的数组的个数。
 * 
 * 逆序对的定义如下：对于数组的第i个和第 j个元素，如果满i < j且 a[i] > a[j]，则其为一个逆序对；否则不是。
 * 
 * 由于答案可能很大，只需要返回 答案 mod 109 + 7 的值。
 * 
 * 示例 1:
 * 
 * 输入: n = 3, k = 0
 * 输出: 1
 * 解释: 
 * 只有数组 [1,2,3] 包含了从1到3的整数并且正好拥有 0 个逆序对。
 * 
 * 
 * 示例 2:
 * 
 * 输入: n = 3, k = 1
 * 输出: 2
 * 解释: 
 * 数组 [1,3,2] 和 [2,1,3] 都有 1 个逆序对。
 * 
 * 
 * 说明:
 * 
 * 
 * 	 n 的范围是 [1, 1000] 并且 k 的范围是 [0, 1000]。
 * 
 */
public class H_629_KInversePairsArray {
    public int kInversePairs(int n, int k) {
        
    }
}