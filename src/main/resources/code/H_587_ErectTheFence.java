/**
 * [587] Erect the Fence
 * 
 * difficulty: Hard
 * 
 * TestCase Example: [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
 * 
 * https://leetcode-cn.com/problems/erect-the-fence/
 * 
 * 
 * There are some trees, where each tree is represented by (x,y) coordinate in a two-dimensional garden. Your job is to fence the entire garden using the minimum length of rope as it is expensive. The garden is well fenced only if all the trees are enclosed. Your task is to help find the coordinates of trees which are exactly located on the fence perimeter.
 * 
 * Example 1:
 * 
 * Input: [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
 * Output: [[1,1],[2,0],[4,2],[3,3],[2,4]]
 * Explanation:
 * 
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: [[1,2],[2,2],[4,2]]
 * Output: [[1,2],[2,2],[4,2]]
 * Explanation:
 * 
 * Even you only have trees in a line, you need to use rope to enclose them. 
 * 
 * 
 * 
 *  Note: 
 * 
 * All trees should be enclosed together. You cannot cut the rope to enclose trees that will separate them in more than one group.
 * All input integers will range from 0 to 100. 
 * The garden has at least one tree. 
 * All coordinates are distinct. 
 * Input points have NO order. No order required for output.
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [587] 安装栅栏
 * 
 * 
 * 在一个二维的花园中，有一些用 (x,y) 坐标表示的树。由于安装费用十分昂贵，你的任务是先用最短的绳子围起所有的树。只有当所有的树都被绳子包围时，花园才能围好栅栏。你需要找到正好位于栅栏边界上的树的坐标。
 * 
 * 示例 1:
 * 
 * 输入: [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
 * 输出: [[1,1],[2,0],[4,2],[3,3],[2,4]]
 * 解释:
 * 
 * 
 * 
 * 示例 2:
 * 
 * 输入: [[1,2],[2,2],[4,2]]
 * 输出: [[1,2],[2,2],[4,2]]
 * 解释:
 * 
 * 即使树都在一条直线上，你也需要先用绳子包围它们。
 * 
 * 
 * 注意:
 * 
 * 
 * 	所有的树应当被围在一起。你不能剪断绳子来包围树或者把树分成一组以上。
 * 	输入的整数在 0 到 100 之间。
 * 	花园至少有一棵树。
 * 	所有树的坐标都是不同的。
 * 	输入的点没有顺序。输出顺序也没有要求。
 * 
 */
/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class H_587_ErectTheFence {
    public List<Point> outerTrees(Point[] points) {
        
    }
}