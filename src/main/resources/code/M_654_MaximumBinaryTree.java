/**
 * [654] Maximum Binary Tree
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [3,2,1,6,0,5]
 * 
 * https://leetcode-cn.com/problems/maximum-binary-tree/
 * 
 * 
 * 
 * Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:
 * 
 * The root is the maximum number in the array. 
 * The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
 * The right subtree is the maximum tree constructed from right part subarray divided by the maximum number. 
 * 
 * 
 * 
 * 
 * Construct the maximum tree by the given array and output the root node of this tree.
 * 
 * 
 * Example 1:
 * 
 * Input: [3,2,1,6,0,5]
 * Output: return the tree root node representing the following tree:
 * 
 *       6
 *     /   \
 *    3     5
 *     \    / 
 *      2  0   
 *        \
 *         1
 * 
 * 
 * 
 * Note:
 * 
 * The size of the given array will be in the range [1,1000].
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [654] 最大二叉树
 * 
 * 
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
 * 
 * 
 * 	二叉树的根是数组中的最大元素。
 * 	左子树是通过数组中最大值左边部分构造出的最大二叉树。
 * 	右子树是通过数组中最大值右边部分构造出的最大二叉树。
 * 
 * 
 * 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
 * 
 * Example 1:
 * 
 * 输入: [3,2,1,6,0,5]
 * 输入: 返回下面这棵树的根节点：
 * 
 *       6
 *     /   \
 *    3     5
 *     \    / 
 *      2  0   
 *        \
 *         1
 * 
 * 
 * 注意:
 * 
 * 
 * 	给定的数组的大小在 [1, 1000] 之间。
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
public class M_654_MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
    }
}