/**
 * [838] Push Dominoes
 * 
 * difficulty: Medium
 * 
 * TestCase Example: ".L.R...LR..L.."
 * 
 * https://leetcode-cn.com/problems/push-dominoes/
 * 
 * 
 * There are N dominoes in a line, and we place each domino vertically upright.
 * 
 * In the beginning, we simultaneously push some of the dominoes either to the left or to the right.
 * 
 * 
 * 
 * After each second, each domino that is falling to the left pushes the adjacent domino on the left.
 * 
 * Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.
 * 
 * When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.
 * 
 * For the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.
 * 
 * Given a string "S" representing the initial state. S[i] = 'L', if the i-th domino has been pushed to the left; S[i] = 'R', if the i-th domino has been pushed to the right; S[i] = '.', if the i-th domino has not been pushed.
 * 
 * Return a string representing the final state. 
 * 
 * Example 1:
 * 
 * 
 * Input: ".L.R...LR..L.."
 * Output: "LL.RR.LLRRLL.."
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "RR.L"
 * Output: "RR.L"
 * Explanation: The first domino expends no additional force on the second domino.
 * 
 * 
 * Note:
 * 
 * 
 * 	0 <= N <= 10^5
 * 	String dominoes contains only 'L', 'R' and '.'
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [838] 推多米诺
 * 
 * 
 * 一行中有 N 张多米诺骨牌，我们将每张多米诺骨牌垂直竖立。
 * 
 * 在开始时，我们同时把一些多米诺骨牌向左或向右推。
 * 
 * 
 * 
 * 每过一秒，倒向左边的多米诺骨牌会推动其左侧相邻的多米诺骨牌。
 * 
 * 同样地，倒向右边的多米诺骨牌也会推动竖立在其右侧的相邻多米诺骨牌。
 * 
 * 如果同时有多米诺骨牌落在一张垂直竖立的多米诺骨牌的两边，由于受力平衡， 该骨牌仍然保持不变。
 * 
 * 就这个问题而言，我们会认为正在下降的多米诺骨牌不会对其它正在下降或已经下降的多米诺骨牌施加额外的力。
 * 
 * 给定表示初始状态的字符串 "S" 。如果第 i 张多米诺骨牌被推向左边，则 S[i] = 'L'；如果第 i 张多米诺骨牌被推向右边，则 S[i] = 'R'；如果第 i 张多米诺骨牌没有被推动，则 S[i] = '.'。
 * 
 * 返回表示最终状态的字符串。
 * 
 * 示例 1：
 * 
 * 输入：".L.R...LR..L.."
 * 输出："LL.RR.LLRRLL.."
 * 
 * 示例 2：
 * 
 * 输入："RR.L"
 * 输出："RR.L"
 * 说明：第一张多米诺骨牌没有给第二张施加额外的力。
 * 
 * 提示：
 * 
 * 
 * 	0 <= N <= 10^5
 * 	表示多米诺骨牌状态的字符串只含有 'L'，'R'; 以及 '.';
 * 
 */
public class M_838_PushDominoes {
    public String pushDominoes(String dominoes) {
        
    }
}