/**
 * [675] Cut Off Trees for Golf Event
 * 
 * difficulty: Hard
 * 
 * TestCase Example: [[1,2,3],[0,0,4],[7,6,5]]
 * 
 * https://leetcode-cn.com/problems/cut-off-trees-for-golf-event/
 * 
 * 
 * 
 * You are asked to cut off trees in a forest for a golf event. The forest is represented as a non-negative 2D map, in this map:
 * 
 * 0 represents the obstacle can't be reached.
 * 1 represents the ground can be walked through.
 * The place with number bigger than 1 represents a tree can be walked through, and this positive number represents the tree's height.
 * 
 * 
 * 
 * 
 * You are asked to cut off all the trees in this forest in the order of tree's height - always cut off the tree with lowest height first. And after cutting, the original place has the tree will become a grass (value 1). 
 * 
 * 
 * 
 * You will start from the point (0, 0) and you should output the minimum steps you need to walk to cut off all the trees. If you can't cut off all the trees, output -1 in that situation.
 * 
 * 
 * 
 * You are guaranteed that no two trees have the same height and there is at least one tree needs to be cut off.
 * 
 * 
 * Example 1:
 * 
 * Input: 
 * [
 *  [1,2,3],
 *  [0,0,4],
 *  [7,6,5]
 * ]
 * Output: 6
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: 
 * [
 *  [1,2,3],
 *  [0,0,0],
 *  [7,6,5]
 * ]
 * Output: -1
 * 
 * 
 * 
 * Example 3:
 * 
 * Input: 
 * [
 *  [2,3,4],
 *  [0,0,5],
 *  [8,7,6]
 * ]
 * Output: 6
 * Explanation: You started from the point (0,0) and you can cut off the tree in (0,0) directly without walking.
 * 
 * 
 * 
 * 
 * Hint: size of the given matrix will not exceed 50x50.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [675] 为高尔夫比赛砍树
 * 
 * 
 * 你被请来给一个要举办高尔夫比赛的树林砍树. 树林由一个非负的二维数组表示， 在这个数组中：
 * 
 * 
 * 	0 表示障碍，无法触碰到.
 * 	1 表示可以行走的地面.
 * 	比1大的数 表示一颗允许走过的树的高度.
 * 
 * 
 * 你被要求按照树的高度从低向高砍掉所有的树，每砍过一颗树，树的高度变为1。
 * 
 * 你将从（0，0）点开始工作，你应该返回你砍完所有树需要走的最小步数。 如果你无法砍完所有的树，返回 -1 。
 * 
 * 可以保证的是，没有两棵树的高度是相同的，并且至少有一颗树需要你砍。
 * 
 * 示例 1:
 * 
 * 输入: 
 * [
 *  [1,2,3],
 *  [0,0,4],
 *  [7,6,5]
 * ]
 * 输出: 6
 * 
 * 
 *  
 * 
 * 示例 2:
 * 
 * 输入: 
 * [
 *  [1,2,3],
 *  [0,0,0],
 *  [7,6,5]
 * ]
 * 输出: -1
 * 
 * 
 *  
 * 
 * 示例 3:
 * 
 * 输入: 
 * [
 *  [2,3,4],
 *  [0,0,5],
 *  [8,7,6]
 * ]
 * 输出: 6
 * 
 * 解释: (0,0) 位置的树，你可以直接砍去，不用算步数
 * 
 * 
 *  
 * 
 * 提示: 矩阵大小不会超过 50x50 。
 * 
 */
public class H_675_CutOffTreesForGolfEvent {
    public int cutOffTree(List<List<Integer>> forest) {
        
    }
}