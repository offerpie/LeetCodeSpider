/**
 * [789] Escape The Ghosts
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [[1,0],[0,3]] [0,1]
 * 
 * https://leetcode-cn.com/problems/escape-the-ghosts/
 * 
 * 
 * You are playing a simplified Pacman game. You start at the point (0, 0), and your destination is (target[0], target[1]). There are several ghosts on the map, the i-th ghost starts at (ghosts[i][0], ghosts[i][1]).
 * 
 * Each turn, you and all ghosts simultaneously *may* move in one of 4 cardinal directions: north, east, west, or south, going from the previous point to a new point 1 unit of distance away.
 * 
 * You escape if and only if you can reach the target before any ghost reaches you (for any given moves the ghosts may take.)  If you reach any square (including the target) at the same time as a ghost, it doesn't count as an escape.
 * 
 * Return True if and only if it is possible to escape.
 * 
 * 
 * Example 1:
 * Input: 
 * ghosts = [[1, 0], [0, 3]]
 * target = [0, 1]
 * Output: true
 * Explanation: 
 * You can directly reach the destination (0, 1) at time 1, while the ghosts located at (1, 0) or (0, 3) have no way to catch up with you.
 * 
 * 
 * 
 * Example 2:
 * Input: 
 * ghosts = [[1, 0]]
 * target = [2, 0]
 * Output: false
 * Explanation: 
 * You need to reach the destination (2, 0), but the ghost at (1, 0) lies between you and the destination.
 * 
 * 
 * 
 * Example 3:
 * Input: 
 * ghosts = [[2, 0]]
 * target = [1, 0]
 * Output: false
 * Explanation: 
 * The ghost can reach the target at the same time as you.
 * 
 * 
 * Note:
 * 
 * 
 * 	All points have coordinates with absolute value <= 10000.
 * 	The number of ghosts will not exceed 100.
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [789] 逃脱阻碍者
 * 
 * 
 * 你在进行一个简化版的吃豆人游戏。你从 (0, 0) 点开始出发，你的目的地是 (target[0], target[1]) 。地图上有一些阻碍者，第 i 个阻碍者从 (ghosts[i][0], ghosts[i][1]) 出发。
 * 
 * 每一回合，你和阻碍者们*可以*同时向东，西，南，北四个方向移动，每次可以移动到距离原位置1个单位的新位置。
 * 
 * 如果你可以在任何阻碍者抓住你之前到达目的地（阻碍者可以采取任意行动方式），则被视为逃脱成功。如果你和阻碍者同时到达了一个位置（包括目的地）都不算是逃脱成功。
 * 
 * 当且仅当你有可能成功逃脱时，输出 True。
 * 
 * 示例 1:
 * 输入： 
 * ghosts = [[1, 0], [0, 3]]
 * target = [0, 1]
 * 输出：true
 * 解释：
 * 你可以直接一步到达目的地(0,1)，在(1, 0)或者(0, 3)位置的阻碍者都不可能抓住你。 
 * 
 * 
 * 示例 2:
 * 输入： 
 * ghosts = [[1, 0]]
 * target = [2, 0]
 * 输出：false
 * 解释：
 * 你需要走到位于(2, 0)的目的地，但是在(1, 0)的阻碍者位于你和目的地之间。 
 * 
 * 
 * 示例 3:
 * 输入： 
 * ghosts = [[2, 0]]
 * target = [1, 0]
 * 输出：false
 * 解释：
 * 阻碍者可以和你同时达到目的地。 
 * 
 * 
 * 说明：
 * 
 * 
 * 	所有的点的坐标值的绝对值 <= 10000。
 * 	阻碍者的数量不会超过 100。
 * 
 */
public class M_789_EscapeTheGhosts {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        
    }
}