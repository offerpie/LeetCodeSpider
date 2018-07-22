/**
 * [486] Predict the Winner
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [1,5,2]
 * 
 * https://leetcode-cn.com/problems/predict-the-winner/
 * 
 * 
 * Given an array of scores that are non-negative integers. Player 1 picks one of the numbers from either end of the array followed by the player 2 and then player 1 and so on. Each time a player picks a number, that number will not be available for the next player. This continues until all the scores have been chosen. The player with the maximum score wins. 
 * 
 * Given an array of scores, predict whether player 1 is the winner. You can assume each player plays to maximize his score. 
 * 
 * Example 1:
 * 
 * Input: [1, 5, 2]
 * Output: False
 * Explanation: Initially, player 1 can choose between 1 and 2. If he chooses 2 (or 1), then player 2 can choose from 1 (or 2) and 5. If player 2 chooses 5, then player 1 will be left with 1 (or 2). So, final score of player 1 is 1 + 2 = 3, and player 2 is 5. Hence, player 1 will never be the winner and you need to return False.
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: [1, 5, 233, 7]
 * Output: True
 * Explanation: Player 1 first chooses 1. Then player 2 have to choose between 5 and 7. No matter which number player 2 choose, player 1 can choose 233.Finally, player 1 has more score (234) than player 2 (12), so you need to return True representing player1 can win.
 * 
 * 
 * 
 * Note:
 * 
 * 1 <= length of the array <= 20. 
 * Any scores in the given array are non-negative integers and will not exceed 10,000,000.
 * If the scores of both players are equal, then player 1 is still the winner.
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [486] 预测赢家
 * 
 * 
 * 给定一个表示分数的非负整数数组。 玩家1从数组任意一端拿取一个分数，随后玩家2继续从剩余数组任意一端拿取分数，然后玩家1拿，……。每次一个玩家只能拿取一个分数，分数被拿取之后不再可取。直到没有剩余分数可取时游戏结束。最终获得分数总和最多的玩家获胜。
 * 
 * 给定一个表示分数的数组，预测玩家1是否会成为赢家。你可以假设每个玩家的玩法都会使他的分数最大化。
 * 
 * 示例 1:
 * 
 * 输入: [1, 5, 2]
 * 输出: False
 * 解释: 一开始，玩家1可以从1和2中进行选择。
 * 如果他选择2（或者1），那么玩家2可以从1（或者2）和5中进行选择。如果玩家2选择了5，那么玩家1则只剩下1（或者2）可选。
 * 所以，玩家1的最终分数为 1 + 2 = 3，而玩家2为 5。
 * 因此，玩家1永远不会成为赢家，返回 False。
 * 
 * 
 * 示例 2:
 * 
 * 输入: [1, 5, 233, 7]
 * 输出: True
 * 解释: 玩家1一开始选择1。然后玩家2必须从5和7中进行选择。无论玩家2选择了哪个，玩家1都可以选择233。
 * 最终，玩家1（234分）比玩家2（12分）获得更多的分数，所以返回 True，表示玩家1可以成为赢家。
 * 
 * 
 * 注意:
 * 
 * 
 * 	1 <= 给定的数组长度 <= 20.
 * 	数组里所有分数都为非负数且不会大于10000000。
 * 	如果最终两个玩家的分数相等，那么玩家1仍为赢家。
 * 
 */
public class M_486_PredictTheWinner {
    public boolean PredictTheWinner(int[] nums) {
        
    }
}