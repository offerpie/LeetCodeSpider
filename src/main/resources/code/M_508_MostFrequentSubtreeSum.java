/**
 * [508] Most Frequent Subtree Sum
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [5,2,-3]
 * 
 * https://leetcode-cn.com/problems/most-frequent-subtree-sum/
 * 
 * 
 * 
 * Given the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.
 * 
 * 
 * Examples 1
 * Input:
 * 
 *   5
 *  /  \
 * 2   -3
 * 
 * return [2, -3, 4], since all the values happen only once, return all of them in any order.
 * 
 * 
 * Examples 2
 * Input:
 * 
 *   5
 *  /  \
 * 2   -5
 * 
 * return [2], since 2 happens twice, however -5 only occur once.
 * 
 * 
 * Note:
 * You may assume the sum of values in any subtree is in the range of 32-bit signed integer.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [508] 出现次数最多的子树元素和
 * 
 * 
 * 给出二叉树的根，找出出现次数最多的子树元素和。一个结点的子树元素和定义为以该结点为根的二叉树上所有结点的元素之和（包括结点本身）。然后求出出现次数最多的子树元素和。如果有多个元素出现的次数相同，返回所有出现次数最多的元素（不限顺序）。
 * 
 *  
 * 
 * 示例 1
 * 输入:
 * 
 *   5
 *  /  \
 * 2   -3
 * 
 * 
 * 返回 [2, -3, 4]，所有的值均只出现一次，以任意顺序返回所有值。
 * 
 * 示例 2
 * 输入:
 * 
 *   5
 *  /  \
 * 2   -5
 * 
 * 
 * 返回 [2]，只有 2 出现两次，-5 只出现 1 次。
 * 
 *  
 * 
 * 提示： 假设任意子树元素和均可以用 32 位有符号整数表示。
 * 
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class M_508_MostFrequentSubtreeSum {
    public int[] findFrequentTreeSum(TreeNode root) {
        
    }
}