/**
 * [828] Unique Letter String
 * 
 * difficulty: Hard
 * 
 * TestCase Example: "ABC"
 * 
 * https://leetcode-cn.com/problems/unique-letter-string/
 * 
 * 
 * A character is unique in string S if it occurs exactly once in it.
 * 
 * For example, in string S = "LETTER", the only unique characters are "L" and "R".
 * 
 * Let's define UNIQ(S) as the number of unique characters in string S.
 * 
 * For example, UNIQ("LETTER") =  2.
 * 
 * Given a string S, calculate the sum of UNIQ(substring) over all non-empty substrings of S.
 * 
 * If there are two or more equal substrings at different positions in S, we consider them different.
 * 
 * Since the answer can be very large, retrun the answer modulo 10 ^ 9 + 7.
 * 
 *  
 * 
 * Example 1:
 * 
 * 
 * Input: "ABC"
 * Output: 10
 * Explanation: All possible substrings are: "A","B","C","AB","BC" and "ABC".
 * Evey substring is composed with only unique letters.
 * Sum of lengths of all substring is 1 + 1 + 1 + 2 + 2 + 3 = 10
 * 
 * Example 2:
 * 
 * 
 * Input: "ABA"
 * Output: 8
 * Explanation: The same as example 1, except uni("ABA") = 1.
 * 
 * 
 *  
 * 
 * Note: 0 <= S.length <= 10000.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [828] 独特字符串
 * 
 * 
 * 如果一个字符在字符串 S 中有且仅有出现一次，那么我们称其为独特字符。
 * 
 * 例如，在字符串 S = "LETTER" 中，"L" 和 "R" 可以被称为独特字符。
 * 
 * 我们再定义 UNIQ(S) 作为字符串 S 中独特字符的个数。
 * 
 * 那么，在 S = "LETTER" 中， UNIQ("LETTER") =  2。
 * 
 * 对于给定字符串 S，计算其所有非空子串的独特字符的个数，即 UNIQ(substring)。
 * 
 * 如果出现两个或者多个相同的子串，将其认为是不同的两个子串。
 * 
 * 考虑到答案可能会非常大，规定返回格式为：结果 mod 10 ^ 9 + 7。
 * 
 * 示例 1:
 * 
 * 输入: "ABC"
 * 输出: 10
 * 解释: 所有可能的子串为："A","B","C","AB","BC" 和 "ABC"。
 *      其中，每一个子串都由独特字符构成。
 *      所以其长度总和为：1 + 1 + 1 + 2 + 2 + 3 = 10
 * 
 * 
 * 示例 2:
 * 
 * 输入: "ABA"
 * 输出: 8
 * 解释: 除了子串 UNIQ('ABA') = 1，其余与示例1相同。
 * 
 * 
 * 说明: 0 <= S.length <= 10000。
 * 
 */
public class H_828_UniqueLetterString {
    public int uniqueLetterString(String S) {
        
    }
}