/**
 * [554] Brick Wall
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
 * 
 * https://leetcode-cn.com/problems/brick-wall/
 * 
 * 
 * There is a brick wall in front of you. The wall is rectangular and has several rows of bricks. The bricks have the same height but different width. You want to draw a vertical line from the top to the bottom and cross the least bricks. 
 * 
 * 
 * The brick wall is represented by a list of rows. Each row is a list of integers representing the width of each brick in this row from left to right. 
 * 
 * 
 * If your line go through the edge of a brick, then the brick is not considered as crossed. You need to find out how to draw the line to cross the least bricks and return the number of crossed bricks. 
 * 
 * You cannot draw a line just along one of the two vertical edges of the wall, in which case the line will obviously cross no bricks. 
 * 
 * Example:
 * 
 * Input: 
 * [[1,2,2,1],
 *  [3,1,2],
 *  [1,3,2],
 *  [2,4],
 *  [3,1,2],
 *  [1,3,1,1]]
 * Output: 2
 * Explanation: 
 * 
 * 
 * 
 * 
 * Note:
 * 
 * The width sum of bricks in different rows are the same and won't exceed INT_MAX.
 * The number of bricks in each row is in range [1,10,000]. The height of wall is in range [1,10,000]. Total number of bricks of the wall won't exceed 20,000. 
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [554] 砖墙
 * 
 * 
 * 你的面前有一堵方形的、由多行砖块组成的砖墙。 这些砖块高度相同但是宽度不同。你现在要画一条自顶向下的、穿过最少砖块的垂线。
 * 
 * 砖墙由行的列表表示。 每一行都是一个代表从左至右每块砖的宽度的整数列表。
 * 
 * 如果你画的线只是从砖块的边缘经过，就不算穿过这块砖。你需要找出怎样画才能使这条线穿过的砖块数量最少，并且返回穿过的砖块数量。
 * 
 * 你不能沿着墙的两个垂直边缘之一画线，这样显然是没有穿过一块砖的。
 * 
 *  
 * 
 * 示例：
 * 
 * 输入: 
 * [[1,2,2,1],
 *  [3,1,2],
 *  [1,3,2],
 *  [2,4],
 *  [3,1,2],
 *  [1,3,1,1]]
 * 输出: 2
 * 解释: 
 * 
 * 
 * 
 *  
 * 
 * 提示：
 * 
 * 
 * 	每一行砖块的宽度之和应该相等，并且不能超过 INT_MAX。
 * 	每一行砖块的数量在 [1,10,000] 范围内， 墙的高度在 [1,10,000] 范围内， 总的砖块数量不超过 20,000。
 * 
 * 
 *  
 * 
 */
public class M_554_BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        
    }
}