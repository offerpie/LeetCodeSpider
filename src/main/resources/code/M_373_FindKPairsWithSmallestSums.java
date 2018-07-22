/**
 * [373] Find K Pairs with Smallest Sums
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [1,7,11] [2,4,6] 3
 * 
 * https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/
 * 
 * 
 * 
 * You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k. 
 * 
 * 
 * Define a pair (u,v) which consists of one element from the first array and one element from the second array.
 * 
 * Find the k pairs (u1,v1),(u2,v2) ...(uk,vk) with the smallest sums.
 * 
 * 
 * Example 1:
 * 
 * Given nums1 = [1,7,11], nums2 = [2,4,6],  k = 3
 * 
 * Return: [1,2],[1,4],[1,6]
 * 
 * The first 3 pairs are returned from the sequence:
 * [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
 * 
 * 
 * 
 * Example 2:
 * 
 * Given nums1 = [1,1,2], nums2 = [1,2,3],  k = 2
 * 
 * Return: [1,1],[1,1]
 * 
 * The first 2 pairs are returned from the sequence:
 * [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
 * 
 * 
 * 
 * Example 3:
 * 
 * Given nums1 = [1,2], nums2 = [3],  k = 3 
 * 
 * Return: [1,3],[2,3]
 * 
 * All possible pairs are returned from the sequence:
 * [1,3],[2,3]
 * 
 * 
 * 
 * Credits:Special thanks to @elmirap and @StefanPochmann for adding this problem and creating all test cases.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [373] 查找和最小的K对数字
 * 
 * 
 * 给定两个以升序排列的整形数组 nums1 和 nums2, 以及一个整数 k。
 * 
 * 定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2。
 * 
 * 找到和最小的 k 对数字 (u1,v1), (u2,v2) ... (uk,vk)。
 * 
 * 示例 1:
 * 
 * 给出： nums1 = [1,7,11], nums2 = [2,4,6],  k = 3
 * 
 * 返回： [1,2],[1,4],[1,6]
 * 
 * 返回序列中的前 3 对数：
 * [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
 * 
 * 
 * 示例 2:
 * 
 * 给出：nums1 = [1,1,2], nums2 = [1,2,3],  k = 2
 * 
 * 返回： [1,1],[1,1]
 * 
 * 返回序列中的前 2 对数：
 * [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
 * 
 * 
 * 示例 3:
 * 
 * 给出：nums1 = [1,2], nums2 = [3],  k = 3 
 * 
 * 返回： [1,3],[2,3]
 * 
 * 也可能序列中所有的数对都被返回:
 * [1,3],[2,3]
 * 
 * 
 * 致谢:
 * 特别感谢 @elmirap 和 @StefanPochmann 添加这个问题并创建所有的测试用例。
 * 
 */
public class M_373_FindKPairsWithSmallestSums {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
    }
}