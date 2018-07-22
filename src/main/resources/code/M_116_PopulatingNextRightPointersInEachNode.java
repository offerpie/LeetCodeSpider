/**
 * [116] Populating Next Right Pointers in Each Node
 * 
 * difficulty: Medium
 * 
 * TestCase Example: {}
 * 
 * https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/
 * 
 * 
 * Given a binary tree
 * 
 * 
 * struct TreeLinkNode {
 *   TreeLinkNode *left;
 *   TreeLinkNode *right;
 *   TreeLinkNode *next;
 * }
 * 
 * 
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * 
 * Initially, all next pointers are set to NULL.
 * 
 * Note:
 * 
 * 
 * 	You may only use constant extra space.
 * 	Recursive approach is fine, implicit stack space does not count as extra space for this problem.
 * 	You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
 * 
 * 
 * Example:
 * 
 * Given the following perfect binary tree,
 * 
 * 
 *      1
 *    /  \
 *   2    3
 *  / \  / \
 * 4  5  6  7
 * 
 * 
 * After calling your function, the tree should look like:
 * 
 * 
 *      1 -> NULL
 *    /  \
 *   2 -> 3 -> NULL
 *  / \  / \
 * 4->5->6->7 -> NULL
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [116] 填充同一层的兄弟节点
 * 
 * 
 * 给定一个二叉树
 * 
 * struct TreeLinkNode {
 *   TreeLinkNode *left;
 *   TreeLinkNode *right;
 *   TreeLinkNode *next;
 * }
 * 
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * 
 * 初始状态下，所有 next 指针都被设置为 NULL。
 * 
 * 说明:
 * 
 * 
 * 	你只能使用额外常数空间。
 * 	使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。
 * 	你可以假设它是一个完美二叉树（即所有叶子节点都在同一层，每个父节点都有两个子节点）。
 * 
 * 
 * 示例:
 * 
 * 给定完美二叉树，
 * 
 *      1
 *    /  \
 *   2    3
 *  / \  / \
 * 4  5  6  7
 * 
 * 调用你的函数后，该完美二叉树变为：
 * 
 *      1 -> NULL
 *    /  \
 *   2 -> 3 -> NULL
 *  / \  / \
 * 4->5->6->7 -> NULL
 * 
 */
/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public public class M_116_PopulatingNextRightPointersInEachNode {
    public void connect(TreeLinkNode root) {
        
    }
}