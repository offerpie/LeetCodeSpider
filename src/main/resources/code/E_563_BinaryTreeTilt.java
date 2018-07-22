/**
 * [563] Binary Tree Tilt
 * 
 * difficulty: Easy
 * 
 * TestCase Example: [1,2,3]
 * 
 * https://leetcode-cn.com/problems/binary-tree-tilt/
 * 
 * 
 * Given a binary tree, return the tilt of the whole tree.
 * 
 * The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.
 * 
 * The tilt of the whole tree is defined as the sum of all nodes' tilt.
 * 
 * Example:
 * 
 * Input: 
 *          1
 *        /   \
 *       2     3
 * Output: 1
 * Explanation: 
 * Tilt of node 2 : 0
 * Tilt of node 3 : 0
 * Tilt of node 1 : |2-3| = 1
 * Tilt of binary tree : 0 + 0 + 1 = 1
 * 
 * 
 * 
 * Note:
 * 
 * The sum of node values in any subtree won't exceed the range of 32-bit integer. 
 * All the tilt values won't exceed the range of 32-bit integer.
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [563] 二叉树的坡度
 * 
 * 
 * 给定一个二叉树，计算整个树的坡度。
 * 
 * 一个树的节点的坡度定义即为，该节点左子树的结点之和和右子树结点之和的差的绝对值。空结点的的坡度是0。
 * 
 * 整个树的坡度就是其所有节点的坡度之和。
 * 
 * 示例:
 * 
 * 输入: 
 *          1
 *        /   \
 *       2     3
 * 输出: 1
 * 解释: 
 * 结点的坡度 2 : 0
 * 结点的坡度 3 : 0
 * 结点的坡度 1 : |2-3| = 1
 * 树的坡度 : 0 + 0 + 1 = 1
 * 
 * 
 * 注意:
 * 
 * 
 * 	任何子树的结点的和不会超过32位整数的范围。
 * 	坡度的值不会超过32位整数的范围。
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
public class E_563_BinaryTreeTilt {
    public int findTilt(TreeNode root) {
        
    }
}