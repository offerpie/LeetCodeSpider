/**
 * [787] Cheapest Flights Within K Stops
 * 
 * difficulty: Medium
 * 
 * TestCase Example: 3 [[0,1,100],[1,2,100],[0,2,500]] 0 2 1
 * 
 * https://leetcode-cn.com/problems/cheapest-flights-within-k-stops/
 * 
 * 
 * There are n cities connected by m flights. Each fight starts from city u and arrives at v with a price w.
 * 
 * Now given all the cities and fights, together with starting city src and the destination dst, your task is to find the cheapest price from src to dst with up to k stops. If there is no such route, output -1.
 * 
 * 
 * Example 1:
 * Input: 
 * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
 * src = 0, dst = 2, k = 1
 * Output: 200
 * Explanation: 
 * The graph looks like this:
 * 
 * 
 * The cheapest price from city 0 to city 2 with at most 1 stop costs 200, as marked red in the picture.
 * 
 * 
 * Example 2:
 * Input: 
 * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
 * src = 0, dst = 2, k = 0
 * Output: 500
 * Explanation: 
 * The graph looks like this:
 * 
 * 
 * The cheapest price from city 0 to city 2 with at most 0 stop costs 500, as marked blue in the picture.
 * 
 * Note:
 * 
 * 
 * 	The number of nodes n will be in range [1, 100], with nodes labeled from 0 to n - 1.
 * 	The size of flights will be in range [0, n * (n - 1) / 2].
 * 	The format of each flight will be (src, dst, price).
 * 	The price of each flight will be in the range [1, 10000].
 * 	k is in the range of [0, n - 1].
 * 	There will not be any duplicated flights or self cycles.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [787] K 站中转内最便宜的航班
 * 
 * 
 * 有 n 个城市通过 m 个航班连接。每个航班都从城市 u 开始，以价格 w 抵达 v。
 * 
 * 现在给定所有的城市和航班，以及出发城市 src 和目的地 dst，你的任务是找到从 src 到 dst 最多经过 k 站中转的最便宜的价格。 如果没有这样的路线，则输出 -1。
 * 
 * 示例 1:
 * 输入: 
 * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
 * src = 0, dst = 2, k = 1
 * 输出: 200
 * 解释: 
 * 城市航班图如下
 * 
 * 
 * 从城市 0 到城市 2 在 1 站中转以内的最便宜价格是 200，如图中红色所示。
 * 
 * 示例 2:
 * 输入: 
 * n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
 * src = 0, dst = 2, k = 0
 * 输出: 500
 * 解释: 
 * 城市航班图如下
 * 
 * 
 * 从城市 0 到城市 2 在 0 站中转以内的最便宜价格是 500，如图中蓝色所示。
 * 
 * 提示：
 * 
 * 
 * 	n 范围是 [1, 100]，城市标签从 0 到 n - 1.
 * 	航班数量范围是 [0, n * (n - 1) / 2].
 * 	每个航班的格式 (src, dst, price).
 * 	每个航班的价格范围是 [1, 10000].
 * 	k 范围是 [0, n - 1].
 * 	航班没有重复，且不存在环路
 * 
 */
public class M_787_CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        
    }
}