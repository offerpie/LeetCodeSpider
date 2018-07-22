/**
 * [662] Maximum Width of Binary Tree
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [1,3,2,5,3,null,9]
 * 
 * https://leetcode-cn.com/problems/maximum-width-of-binary-tree/
 * 
 * 
 * Given a binary tree, write a function to get the maximum width of the given tree. The width of a tree is the maximum width among all levels. The binary tree has the same structure as a full binary tree, but some nodes are null. 
 * 
 * The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in the level, where the null nodes between the end-nodes are also counted into the length calculation.
 * 
 * Example 1:
 * 
 * Input: 
 * 
 *            1
 *          /   \
 *         3     2
 *        / \     \  
 *       5   3     9 
 * 
 * Output: 4
 * Explanation: The maximum width existing in the third level with the length 4 (5,3,null,9).
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: 
 * 
 *           1
 *          /  
 *         3    
 *        / \       
 *       5   3     
 * 
 * Output: 2
 * Explanation: The maximum width existing in the third level with the length 2 (5,3).
 * 
 * 
 * 
 * Example 3:
 * 
 * Input: 
 * 
 *           1
 *          / \
 *         3   2 
 *        /        
 *       5      
 * 
 * Output: 2
 * Explanation: The maximum width existing in the second level with the length 2 (3,2).
 * 
 * 
 * Example 4:
 * 
 * Input: 
 * 
 *           1
 *          / \
 *         3   2
 *        /     \  
 *       5       9 
 *      /         \
 *     6           7
 * Output: 8
 * Explanation:The maximum width existing in the fourth level with the length 8 (6,null,null,null,null,null,null,7).
 * 
 * 
 * 
 * 
 * Note:
 * Answer will in the range of 32-bit signed integer.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [662] 二叉树最大宽度
 * 
 * 
 * 给定一个二叉树，编写一个函数来获取这个树的最大宽度。树的宽度是所有层中的最大宽度。这个二叉树与满二叉树（full binary tree）结构相同，但一些节点为空。
 * 
 * 每一层的宽度被定义为两个端点（该层最左和最右的非空节点，两端点间的null节点也计入长度）之间的长度。
 * 
 * 示例 1:
 * 
 * 输入: 
 * 
 *            1
 *          /   \
 *         3     2
 *        / \     \  
 *       5   3     9 
 * 
 * 输出: 4
 * 解释: 最大值出现在树的第 3 层，宽度为 4 (5,3,null,9)。
 * 
 * 
 * 示例 2:
 * 
 * 输入: 
 * 
 *           1
 *          /  
 *         3    
 *        / \       
 *       5   3     
 * 
 * 输出: 2
 * 解释: 最大值出现在树的第 3 层，宽度为 2 (5,3)。
 * 
 * 
 * 示例 3:
 * 
 * 输入: 
 * 
 *           1
 *          / \
 *         3   2 
 *        /        
 *       5      
 * 
 * 输出: 2
 * 解释: 最大值出现在树的第 2 层，宽度为 2 (3,2)。
 * 
 * 
 * 示例 4:
 * 
 * 输入: 
 * 
 *           1
 *          / \
 *         3   2
 *        /     \  
 *       5       9 
 *      /         \
 *     6           7
 * 输出: 8
 * 解释: 最大值出现在树的第 4 层，宽度为 8 (6,null,null,null,null,null,null,7)。
 * 
 * 
 * 注意: 答案在32位有符号整数的表示范围内。
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
public class M_662_MaximumWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        
    }
}