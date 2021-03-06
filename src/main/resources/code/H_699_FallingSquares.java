/**
 * [699] Falling Squares
 * 
 * difficulty: Hard
 * 
 * TestCase Example: [[1,2],[2,3],[6,1]]
 * 
 * https://leetcode-cn.com/problems/falling-squares/
 * 
 * 
 * On an infinite number line (x-axis), we drop given squares in the order they are given.
 * The i-th square dropped (positions[i] = (left, side_length)) is a square with the left-most point being positions[i][0] and sidelength positions[i][1].
 * The square is dropped with the bottom edge parallel to the number line, and from a higher height than all currently landed squares.  We wait for each square to stick before dropping the next.
 * The squares are infinitely sticky on their bottom edge, and will remain fixed to any positive length surface they touch (either the number line or another square).  Squares dropped adjacent to each other will not stick together prematurely.
 * 
 * 
 * Return a list ans of heights.  Each height ans[i] represents the current highest height of any square we have dropped, after dropping squares represented by positions[0], positions[1], ..., positions[i].
 * 
 * 
 * Example 1:
 * 
 * Input: [[1, 2], [2, 3], [6, 1]]
 * Output: [2, 5, 5]
 * Explanation:
 * 
 * After the first drop of positions[0] = [1, 2]:
 * _aa
 * _aa
 * -------
 * The maximum height of any square is 2.
 * 
 * After the second drop of positions[1] = [2, 3]:
 * __aaa
 * __aaa
 * __aaa
 * _aa__
 * _aa__
 * --------------
 * The maximum height of any square is 5.  
 * The larger square stays on top of the smaller square despite where its center
 * of gravity is, because squares are infinitely sticky on their bottom edge.
 * 
 * After the third drop of positions[1] = [6, 1]:
 * __aaa
 * __aaa
 * __aaa
 * _aa
 * _aa___a
 * --------------
 * The maximum height of any square is still 5.
 * 
 * Thus, we return an answer of [2, 5, 5].
 * 
 * 
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: [[100, 100], [200, 100]]
 * Output: [100, 100]
 * Explanation: Adjacent squares don't get stuck prematurely - only their bottom edge can stick to surfaces.
 * 
 * 
 * 
 * Note:
 * 1 <= positions.length <= 1000.
 * 1 <= positions[i][0] <= 10^8.
 * 1 <= positions[i][1] <= 10^6.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [699] 掉落的方块
 * 
 * 
 * 在无限长的数轴（即 x 轴）上，我们根据给定的顺序放置对应的正方形方块。
 * 
 * 第 i 个掉落的方块（positions[i] = (left, side_length)）是正方形，其中 left 表示该方块最左边的点位置(positions[i][0])，side_length 表示该方块的边长(positions[i][1])。
 * 
 * 每个方块的底部边缘平行于数轴（即 x 轴），并且从一个比目前所有的落地方块更高的高度掉落而下。在上一个方块结束掉落，并保持静止后，才开始掉落新方块。
 * 
 * 方块的底边具有非常大的粘性，并将保持固定在它们所接触的任何长度表面上（无论是数轴还是其他方块）。邻接掉落的边不会过早地粘合在一起，因为只有底边才具有粘性。
 * 
 *  
 * 
 * 返回一个堆叠高度列表 ans 。每一个堆叠高度 ans[i] 表示在通过 positions[0], positions[1], ..., positions[i] 表示的方块掉落结束后，目前所有已经落稳的方块堆叠的最高高度。
 * 
 *  
 * 
 *  
 * 
 * 示例 1:
 * 
 * 输入: [[1, 2], [2, 3], [6, 1]]
 * 输出: [2, 5, 5]
 * 解释:
 * 
 * 第一个方块 positions[0] = [1, 2] 掉落：
 * _aa
 * _aa
 * -------
 * 方块最大高度为 2 。
 * 
 * 第二个方块 positions[1] = [2, 3] 掉落：
 * __aaa
 * __aaa
 * __aaa
 * _aa__
 * _aa__
 * --------------
 * 方块最大高度为5。
 * 大的方块保持在较小的方块的顶部，不论它的重心在哪里，因为方块的底部边缘有非常大的粘性。
 * 
 * 第三个方块 positions[1] = [6, 1] 掉落：
 * __aaa
 * __aaa
 * __aaa
 * _aa
 * _aa___a
 * -------------- 
 * 方块最大高度为5。
 * 
 * 因此，我们返回结果[2, 5, 5]。
 * 
 * 
 *  
 * 
 * 示例 2:
 * 
 * 输入: [[100, 100], [200, 100]]
 * 输出: [100, 100]
 * 解释: 相邻的方块不会过早地卡住，只有它们的底部边缘才能粘在表面上。
 * 
 * 
 *  
 * 
 * 注意:
 * 
 * 
 * 	1 <= positions.length <= 1000.
 * 	1 <= positions[i][0] <= 10^8.
 * 	1 <= positions[i][1] <= 10^6.
 * 
 * 
 *  
 * 
 */
public class H_699_FallingSquares {
    public List<Integer> fallingSquares(int[][] positions) {
        
    }
}