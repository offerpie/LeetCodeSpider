/**
 * [863] All Nodes Distance K in Binary Tree
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [3,5,1,6,2,0,8,null,null,7,4] 5 2
 * 
 * https://leetcode-cn.com/problems/all-nodes-distance-k-in-binary-tree/
 * 
 * 
 * We are given a binary tree (with root node root), a target node, and an integer value `K`.
 * 
 * Return a list of the values of all nodes that have a distance K from the target node.  The answer can be returned in any order.
 * 
 *  
 * 
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, K = 2
 * Output: [7,4,1]
 * Explanation: 
 * The nodes that are a distance 2 from the target node (with value 5)
 * have values 7, 4, and 1.
 * 
 * Note that the inputs "root" and "target" are actually TreeNodes.
 * The descriptions of the inputs above are just serializations of these objects.
 * 
 * 
 * 
 * Note:
 * 
 * 
 * 	The given tree is non-empty.
 * 	Each node in the tree has unique values 0 <= node.val <= 500.
 * 	The target node is a node in the tree.
 * 	0 <= K <= 1000.
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [863] 二叉树中所有距离为 K 的结点
 * 
 * 
 * 给定一个二叉树（具有根结点 root）， 一个目标结点 target ，和一个整数值 K 。
 * 
 * 返回到目标结点 target 距离为 K 的所有结点的值的列表。 答案可以以任何顺序返回。
 * 
 *  
 * 
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, K = 2
 * 
 * 输出：[7,4,1]
 * 
 * 解释：
 * 所求结点为与目标结点（值为 5）距离为 2 的结点，
 * 值分别为 7，4，以及 1
 * 
 * 
 * 
 * 注意，输入的 "root" 和 "target" 实际上是树上的结点。
 * 上面的输入仅仅是对这些对象进行了序列化描述。
 * 
 * 
 *  
 * 
 * 提示：
 * 
 * 
 * 	给定的树是非空的，且最多有 K 个结点。
 * 	树上的每个结点都具有唯一的值 0 <= node.val <= 500 。
 * 	目标结点 target 是树上的结点。
 * 	0 <= K <= 1000.
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
public class M_863_AllNodesDistanceKInBinaryTree {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        
    }
}