/**
 * [730] Count Different Palindromic Subsequences
 * 
 * difficulty: Hard
 * 
 * TestCase Example: "bccb"
 * 
 * https://leetcode-cn.com/problems/count-different-palindromic-subsequences/
 * 
 * 
 * 
 * Given a string S, find the number of different non-empty palindromic subsequences in S, and return that number modulo 10^9 + 7.
 * 
 * A subsequence of a string S is obtained by deleting 0 or more characters from S.
 * 
 * A sequence is palindromic if it is equal to the sequence reversed.
 * 
 * Two sequences A_1, A_2, ... and B_1, B_2, ... are different if there is some i for which A_i != B_i.
 * 
 * 
 * Example 1:
 * 
 * Input: 
 * S = 'bccb'
 * Output: 6
 * Explanation: 
 * The 6 different non-empty palindromic subsequences are 'b', 'c', 'bb', 'cc', 'bcb', 'bccb'.
 * Note that 'bcb' is counted only once, even though it occurs twice.
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: 
 * S = 'abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba'
 * Output: 104860361
 * Explanation: 
 * There are 3104860382 different non-empty palindromic subsequences, which is 104860361 modulo 10^9 + 7.
 * 
 * 
 * 
 * Note:
 * The length of S will be in the range [1, 1000].
 * Each character S[i] will be in the set {'a', 'b', 'c', 'd'}.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [730] 统计不同回文子字符串
 * 
 * 
 * 给定一个字符串 S，找出 S 中不同的非空回文子字符串个数，并返回该数字与 10^9 + 7 的模。
 * 
 * 通过从 S 中删除 0 个或多个字符来获得子字符串。
 * 
 * 如果一个字符串字符序列与它的反转字符串字符序列一致，那么它是回文字符串。
 * 
 * 如果对于某个 i， A_i != B_i，那么A_1, A_2, ... 和 B_1, B_2, ... 这两个字符串是不同的。
 * 
 * 示例1:
 * 
 * 输入: 
 * S = 'bccb'
 * 输出: 6
 * 解释: 
 * 6个不同的非空回文子字符串分别为： 'b', 'c', 'bb', 'cc', 'bcb', 'bccb'。
 * 注意： 'bcb' 虽然出现两次但仅计数一次。
 * 
 * 
 *  
 * 
 * 样例2:
 * 
 * 输入: 
 * S = 'abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba'
 * 输出: 104860361
 * 解释: 
 * 共有 3104860382 个不同的非空回文子字符串，对 10^9 + 7 取模为 104860361。
 * 
 * 
 *  
 * 
 * 提示：
 * 
 * 
 * 	字符串 S 的长度将在[1, 1000]范围内。
 * 	每个字符S[i]将会是集合 {'a', 'b', 'c', 'd'} 中的某一个。
 * 
 * 
 *  
 * 
 */
public class H_730_CountDifferentPalindromicSubsequences {
    public int countPalindromicSubsequences(String S) {
        
    }
}