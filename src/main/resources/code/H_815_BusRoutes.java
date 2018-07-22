/**
 * [815] Bus Routes
 * 
 * difficulty: Hard
 * 
 * TestCase Example: [[1,2,7],[3,6,7]] 1 6
 * 
 * https://leetcode-cn.com/problems/bus-routes/
 * 
 * 
 * We have a list of bus routes. Each routes[i] is a bus route that the i-th bus repeats forever. For example if routes[0] = [1, 5, 7], this means that the first bus (0-th indexed) travels in the sequence 1->5->7->1->5->7->1->... forever.
 * 
 * We start at bus stop S (initially not on a bus), and we want to go to bus stop T. Travelling by buses only, what is the least number of buses we must take to reach our destination? Return -1 if it is not possible.
 * 
 * 
 * Example:
 * Input: 
 * routes = [[1, 2, 7], [3, 6, 7]]
 * S = 1
 * T = 6
 * Output: 2
 * Explanation: 
 * The best strategy is take the first bus to the bus stop 7, then take the second bus to the bus stop 6.
 * 
 * 
 * Note: 
 * 
 * 
 * 	1 <= routes.length <= 500.
 * 	1 <= routes[i].length <= 500.
 * 	0 <= routes[i][j] < 10 ^ 6.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [815] 公交路线
 * 
 * 
 * 我们有一系列公交路线。每一条路线 routes[i] 上都有一辆公交车在上面循环行驶。例如，有一条路线 routes[0] = [1, 5, 7]，表示第一辆 (下标为0) 公交车会一直按照 1->5->7->1->5->7->1->... 的车站路线行驶。
 * 
 * 假设我们从 S 车站开始（初始时不在公交车上），要去往 T 站。 期间仅可乘坐公交车，求出最少乘坐的公交车数量。返回 -1 表示不可能到达终点车站。
 * 
 * 示例:
 * 输入: 
 * routes = [[1, 2, 7], [3, 6, 7]]
 * S = 1
 * T = 6
 * 输出: 2
 * 解释: 
 * 最优策略是先乘坐第一辆公交车到达车站 7, 然后换乘第二辆公交车到车站 6。
 * 
 * 
 * 说明: 
 * 
 * 
 * 	1 <= routes.length <= 500.
 * 	1 <= routes[i].length <= 500.
 * 	0 <= routes[i][j] < 10 ^ 6.
 * 
 */
public class H_815_BusRoutes {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        
    }
}