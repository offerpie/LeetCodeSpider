/**
 * [464] Can I Win
 * 
 * difficulty: Medium
 * 
 * TestCase Example: 10 11
 * 
 * https://leetcode-cn.com/problems/can-i-win/
 * 
 * 
 * In the "100 game," two players take turns adding, to a running total, any integer from 1..10. The player who first causes the running total to reach or exceed 100 wins. 
 * 
 * What if we change the game so that players cannot re-use integers? 
 * 
 * For example, two players might take turns drawing from a common pool of numbers of 1..15 without replacement until they reach a total >= 100.
 * 
 * Given an integer maxChoosableInteger and another integer desiredTotal, determine if the first player to move can force a win, assuming both players play optimally. 
 * 
 * You can always assume that maxChoosableInteger will not be larger than 20 and desiredTotal will not be larger than 300.
 * 
 * 
 * Example
 * 
 * Input:
 * maxChoosableInteger = 10
 * desiredTotal = 11
 * 
 * Output:
 * false
 * 
 * Explanation:
 * No matter which integer the first player choose, the first player will lose.
 * The first player can choose an integer from 1 up to 10.
 * If the first player choose 1, the second player can only choose integers from 2 up to 10.
 * The second player will win by choosing 10 and get a total = 11, which is >= desiredTotal.
 * Same with other integers chosen by the first player, the second player will always win.
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [464] 我能赢吗
 * 
 * 
 * 在 "100 game" 这个游戏中，两名玩家轮流选择从 1 到 10 的任意整数，累计整数和，先使得累计整数和达到 100 的玩家，即为胜者。
 * 
 * 如果我们将游戏规则改为 “玩家不能重复使用整数” 呢？
 * 
 * 例如，两个玩家可以轮流从公共整数池中抽取从 1 到 15 的整数（不放回），直到累计整数和 >= 100。
 * 
 * 给定一个整数 maxChoosableInteger （整数池中可选择的最大数）和另一个整数 desiredTotal（累计和），判断先出手的玩家是否能稳赢（假设两位玩家游戏时都表现最佳）？
 * 
 * 你可以假设 maxChoosableInteger 不会大于 20， desiredTotal 不会大于 300。
 * 
 * 示例：
 * 
 * 输入：
 * maxChoosableInteger = 10
 * desiredTotal = 11
 * 
 * 输出：
 * false
 * 
 * 解释：
 * 无论第一个玩家选择哪个整数，他都会失败。
 * 第一个玩家可以选择从 1 到 10 的整数。
 * 如果第一个玩家选择 1，那么第二个玩家只能选择从 2 到 10 的整数。
 * 第二个玩家可以通过选择整数 10（那么累积和为 11 >= desiredTotal），从而取得胜利.
 * 同样地，第一个玩家选择任意其他整数，第二个玩家都会赢。
 * 
 */
public class M_464_CanIWin {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        
    }
}