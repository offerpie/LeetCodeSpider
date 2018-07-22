/**
 * [826] Most Profit Assigning Work
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [2,4,6,8,10] [10,20,30,40,50] [4,5,6,7]
 * 
 * https://leetcode-cn.com/problems/most-profit-assigning-work/
 * 
 * 
 * We have jobs: difficulty[i] is the difficulty of the ith job, and profit[i] is the profit of the ith job. 
 * 
 * Now we have some workers. worker[i] is the ability of the ith worker, which means that this worker can only complete a job with difficulty at most worker[i]. 
 * 
 * Every worker can be assigned at most one job, but one job can be completed multiple times.
 * 
 * For example, if 3 people attempt the same job that pays $1, then the total profit will be $3.  If a worker cannot complete any job, his profit is $0.
 * 
 * What is the most profit we can make?
 * 
 * Example 1:
 * 
 * 
 * Input: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
 * Output: 100 
 * Explanation: Workers are assigned jobs of difficulty [4,4,6,6] and they get profit of [20,20,30,30] seperately.
 * 
 * Notes:
 * 
 * 
 * 	1 <= difficulty.length = profit.length <= 10000
 * 	1 <= worker.length <= 10000
 * 	difficulty[i], profit[i], worker[i]  are in range [1, 10^5]
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [826] 安排工作以达到最大收益
 * 
 * 
 * 有一些工作：difficulty[i] 表示第i个工作的难度，profit[i]表示第i个工作的收益。
 * 
 * 现在我们有一些工人。worker[i]是第i个工人的能力，即该工人只能完成难度小于等于worker[i]的工作。
 * 
 * 每一个工人都最多只能安排一个工作，但是一个工作可以完成多次。
 * 
 * 举个例子，如果3个工人都尝试完成一份报酬为1的同样工作，那么总收益为 $3。如果一个工人不能完成任何工作，他的收益为 $0 。
 * 
 * 我们能得到的最大收益是多少？
 * 
 * 示例：
 * 
 * 输入: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
 * 输出: 100 
 * 解释: 工人被分配的工作难度是 [4,4,6,6] ，分别获得 [20,20,30,30] 的收益。
 * 
 * 提示:
 * 
 * 
 * 	1 <= difficulty.length = profit.length <= 10000
 * 	1 <= worker.length <= 10000
 * 	difficulty[i], profit[i], worker[i]  的范围是 [1, 10^5]
 * 
 */
public class M_826_MostProfitAssigningWork {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
    }
}