/**
 * [173] Binary Search Tree Iterator
 * 
 * difficulty: Medium
 * 
 * TestCase Example: []
 * 
 * https://leetcode-cn.com/problems/binary-search-tree-iterator/
 * 
 * 
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * 
 * Calling next() will return the next smallest number in the BST.
 * 
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree. 
 * 
 * Credits:Special thanks to @ts for adding this problem and creating all test cases.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [173] 二叉搜索树迭代器
 * 
 * 
 * 实现一个二叉搜索树迭代器。你将使用二叉搜索树的根节点初始化迭代器。
 * 
 * 调用 next() 将返回二叉搜索树中的下一个最小的数。
 * 
 * 注意: next() 和hasNext() 操作的时间复杂度是O(1)，并使用 O(h) 内存，其中 h 是树的高度。
 * 
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

    public BSTIterator(TreeNode root) {
        
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        
    }

    /** @return the next smallest number */
    public int next() {
        
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */