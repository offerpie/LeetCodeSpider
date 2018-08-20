/**
 * [874] Walking Robot Simulation
 * 
 * difficulty: Easy
 * 
 * TestCase Example: [4,-1,3] []
 * 
 * https://leetcode-cn.com/problems/walking-robot-simulation/
 * 
 * 
 * A robot on an infinite grid starts at point (0, 0) and faces north.  The robot can receive one of three possible types of commands:
 * 
 * 
 * 	-2: turn left 90 degrees
 * 	-1: turn right 90 degrees
 * 	1 <= x <= 9: move forward x units
 * 
 * 
 * Some of the grid squares are obstacles. 
 * 
 * The i-th obstacle is at grid point (obstacles[i][0], obstacles[i][1])
 * 
 * If the robot would try to move onto them, the robot stays on the previous grid square instead (but still continues following the rest of the route.)
 * 
 * Return the square of the maximum Euclidean distance that the robot will be from the origin.
 * 
 *  
 * 
 * Example 1:
 * 
 * 
 * Input: commands = [4,-1,3], obstacles = []
 * Output: 25
 * Explanation: robot will go to (3, 4)
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
 * Output: 65
 * Explanation: robot will be stuck at (1, 4) before turning left and going to (1, 8)
 * 
 * 
 * 
 *  
 * 
 * Note:
 * 
 * 
 * 	0 <= commands.length <= 10000
 * 	0 <= obstacles.length <= 10000
 * 	-30000 <= obstacle[i][0] <= 30000
 * 	-30000 <= obstacle[i][1] <= 30000
 * 	The answer is guaranteed to be less than 2 ^ 31.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [874] 模拟行走机器人
 * 
 * 
 * 机器人在一个无限大小的网格上行走，从点 (0, 0) 处开始出发，面向北方。该机器人可以接收以下三种类型的命令：
 * 
 * 
 * 	-2：向左转 90 度
 * 	-1：向右转 90 度
 * 	1 <= x <= 9：向前移动 x 个单位长度
 * 
 * 
 * 在网格上有一些格子被视为障碍物。
 * 
 * 第 i 个障碍物位于网格点  (obstacles[i][0], obstacles[i][1])
 * 
 * 如果机器人试图走到障碍物上方，那么它将停留在障碍物的前一个网格方块上，但仍然可以继续该路线的其余部分。
 * 
 * 返回从原点到机器人的最大欧式距离的平方。
 * 
 *  
 * 
 * 示例 1：
 * 
 * 输入: commands = [4,-1,3], obstacles = []
 * 输出: 25
 * 解释: 机器人将会到达 (3, 4)
 * 
 * 
 * 示例 2：
 * 
 * 输入: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
 * 输出: 65
 * 解释: 机器人在左转走到 (1, 8) 之前将被困在 (1, 4) 处
 * 
 * 
 *  
 * 
 * 提示：
 * 
 * 
 * 	0 <= commands.length <= 10000
 * 	0 <= obstacles.length <= 10000
 * 	-30000 <= obstacle[i][0] <= 30000
 * 	-30000 <= obstacle[i][1] <= 30000
 * 	答案保证小于 2 ^ 31
 * 
 */
public class E_874_WalkingRobotSimulation {
    public int robotSim(int[] commands, int[][] obstacles) {
        
    }
}