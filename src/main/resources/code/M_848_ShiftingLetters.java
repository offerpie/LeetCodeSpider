/**
 * [848] Shifting Letters
 * 
 * difficulty: Medium
 * 
 * TestCase Example: "abc" [3,5,9]
 * 
 * https://leetcode-cn.com/problems/shifting-letters/
 * 
 * 
 * We have a string S of lowercase letters, and an integer array shifts.
 * 
 * Call the shift of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a'). 
 * 
 * For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
 * 
 * Now for each shifts[i] = x, we want to shift the first i+1 letters of S, x times.
 * 
 * Return the final string after all such shifts to S are applied.
 * 
 * Example 1:
 * 
 * 
 * Input: S = "abc", shifts = [3,5,9]
 * Output: "rpl"
 * Explanation: 
 * We start with "abc".
 * After shifting the first 1 letters of S by 3, we have "dbc".
 * After shifting the first 2 letters of S by 5, we have "igc".
 * After shifting the first 3 letters of S by 9, we have "rpl", the answer.
 * 
 * 
 * Note:
 * 
 * 
 * 	1 <= S.length = shifts.length <= 20000
 * 	0 <= shifts[i] <= 10 ^ 9
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [848] 字母移位
 * 
 * 
 * 有一个由小写字母组成的字符串 S，和一个整数数组 shifts。
 * 
 * 我们将字母表中的下一个字母称为原字母的 移位（由于字母表是环绕的， 'z' 将会变成 'a'）。
 * 
 * 例如·，shift('a') = 'b'， shift('t') = 'u',， 以及 shift('z') = 'a'。
 * 
 * 对于每个 shifts[i] = x ， 我们会将 S 中的前 i+1 个字母移位 x 次。
 * 
 * 返回将所有这些移位都应用到 S 后最终得到的字符串。
 * 
 * 示例：
 * 
 * 输入：S = "abc", shifts = [3,5,9]
 * 输出："rpl"
 * 解释： 
 * 我们以 "abc" 开始。
 * 将 S 中的第 1 个字母移位 3 次后，我们得到 "dbc"。
 * 再将 S 中的前 2 个字母移位 5 次后，我们得到 "igc"。
 * 最后将 S 中的这 3 个字母移位 9 次后，我们得到答案 "rpl"。
 * 
 * 
 * 提示：
 * 
 * 
 * 	1 <= S.length = shifts.length <= 20000
 * 	0 <= shifts[i] <= 10 ^ 9
 * 
 */
public class M_848_ShiftingLetters {
    public String shiftingLetters(String S, int[] shifts) {
        
    }
}