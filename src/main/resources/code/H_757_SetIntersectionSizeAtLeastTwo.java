/**
 * [757] Set Intersection Size At Least Two
 * 
 * difficulty: Hard
 * 
 * TestCase Example: [[1,3],[1,4],[2,5],[3,5]]
 * 
 * https://leetcode-cn.com/problems/set-intersection-size-at-least-two/
 * 
 * 
 * 
 * An integer interval [a, b] (for integers a < b) is a set of all consecutive integers from a to b, including a and b.
 * 
 * Find the minimum size of a set S such that for every integer interval A in intervals, the intersection of S with A has size at least 2.
 * 
 * 
 * Example 1:
 * 
 * Input: intervals = [[1, 3], [1, 4], [2, 5], [3, 5]]
 * Output: 3
 * Explanation:
 * Consider the set S = {2, 3, 4}.  For each interval, there are at least 2 elements from S in the interval.
 * Also, there isn't a smaller size set that fulfills the above condition.
 * Thus, we output the size of this set, which is 3.
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: intervals = [[1, 2], [2, 3], [2, 4], [4, 5]]
 * Output: 5
 * Explanation:
 * An example of a minimum sized set is {1, 2, 3, 4, 5}.
 * 
 * 
 * 
 * Note:
 * intervals will have length in range [1, 3000].
 * intervals[i] will have length 2, representing some integer interval.
 * intervals[i][j] will be an integer in [0, 10^8].
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [757]  设置交集大小至少为2
 * 
 * 
 * 一个整数区间 [a, b]  ( a < b ) 代表着从 a 到 b 的所有连续整数，包括 a 和 b。
 * 
 * 给你一组整数区间intervals，请找到一个最小的集合 S，使得 S 里的元素与区间intervals中的每一个整数区间都至少有2个元素相交。
 * 
 * 输出这个最小集合S的大小。
 * 
 * 示例 1:
 * 
 * 输入: intervals = [[1, 3], [1, 4], [2, 5], [3, 5]]
 * 输出: 3
 * 解释:
 * 考虑集合 S = {2, 3, 4}. S与intervals中的四个区间都有至少2个相交的元素。
 * 且这是S最小的情况，故我们输出3。
 * 
 * 
 * 示例 2:
 * 
 * 输入: intervals = [[1, 2], [2, 3], [2, 4], [4, 5]]
 * 输出: 5
 * 解释:
 * 最小的集合S = {1, 2, 3, 4, 5}.
 * 
 * 
 * 注意:
 * 
 * 
 * 	intervals 的长度范围为[1, 3000]。
 * 	intervals[i] 长度为 2，分别代表左、右边界。
 * 	intervals[i][j] 的值是 [0, 10^8]范围内的整数。
 * 
 */
public class H_757_SetIntersectionSizeAtLeastTwo {
    public int intersectionSizeTwo(int[][] intervals) {
        
    }
}