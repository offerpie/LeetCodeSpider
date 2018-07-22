/**
 * [846] Hand of Straights
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [1,2,3,6,2,3,4,7,8] 3
 * 
 * https://leetcode-cn.com/problems/hand-of-straights/
 * 
 * 
 * Alice has a hand of cards, given as an array of integers.
 * 
 * Now she wants to rearrange the cards into groups so that each group is size W, and consists of W consecutive cards.
 * 
 * Return true if and only if she can.
 * 
 *  
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: hand = [1,2,3,6,2,3,4,7,8], W = 3
 * Output: true
 * Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8].
 * 
 * Example 2:
 * 
 * 
 * Input: hand = [1,2,3,4,5], W = 4
 * Output: false
 * Explanation: Alice's hand can't be rearranged into groups of 4.
 * 
 *  
 * 
 * Note:
 * 
 * 
 * 	1 <= hand.length <= 10000
 * 	0 <= hand[i] <= 10^9
 * 	1 <= W <= hand.length
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [846] 一手顺子
 * 
 * 
 * 爱丽丝有一手（hand）由整数数组给定的牌。 
 * 
 * 现在她想把牌重新排列成组，使得每个组的大小都是 W，且由 W 张连续的牌组成。
 * 
 * 如果她可以完成分组就返回 true，否则返回 false。
 * 
 *  
 * 
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：hand = [1,2,3,6,2,3,4,7,8], W = 3
 * 输出：true
 * 解释：爱丽丝的手牌可以被重新排列为 [1,2,3]，[2,3,4]，[6,7,8]。
 * 
 * 示例 2：
 * 
 * 输入：hand = [1,2,3,4,5], W = 4
 * 输出：false
 * 解释：爱丽丝的手牌无法被重新排列成几个大小为 4 的组。
 * 
 *  
 * 
 * 提示：
 * 
 * 
 * 	1 <= hand.length <= 10000
 * 	0 <= hand[i] <= 10^9
 * 	1 <= W <= hand.length
 * 
 */
public class M_846_HandOfStraights {
    public boolean isNStraightHand(int[] hand, int W) {
        
    }
}