/**
 * [572] Subtree of Another Tree
 * 
 * difficulty: Easy
 * 
 * TestCase Example: [3,4,5,1,2] [4,1,2]
 * 
 * https://leetcode-cn.com/problems/subtree-of-another-tree/
 * 
 * 
 * 
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.
 * 
 * 
 * Example 1:
 * 
 * Given tree s:
 * 
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 
 * Given tree t:
 * 
 *    4 
 *   / \
 *  1   2
 * 
 * Return true, because t has the same structure and node values with a subtree of s.
 * 
 * 
 * Example 2:
 * 
 * Given tree s:
 * 
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 *     /
 *    0
 * 
 * Given tree t:
 * 
 *    4
 *   / \
 *  1   2
 * 
 * Return false.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [572] 另一个树的子树
 * 
 * 
 * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
 * 
 * 示例 1:
 * 给定的树 s:
 * 
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 
 * 
 * 给定的树 t：
 * 
 *    4 
 *   / \
 *  1   2
 * 
 * 
 * 返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
 * 
 * 示例 2:
 * 给定的树 s：
 * 
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 *     /
 *    0
 * 
 * 
 * 给定的树 t：
 * 
 *    4
 *   / \
 *  1   2
 * 
 * 
 * 返回 false。
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
public class E_572_SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        
    }
}