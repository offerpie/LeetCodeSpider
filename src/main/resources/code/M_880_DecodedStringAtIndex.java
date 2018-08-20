/**
 * [880] Decoded String at Index
 * 
 * difficulty: Medium
 * 
 * TestCase Example: "leet2code3" 10
 * 
 * https://leetcode-cn.com/problems/decoded-string-at-index/
 * 
 * 
 * An encoded string S is given.  To find and write the decoded string to a tape, the encoded string is read one character at a time and the following steps are taken:
 * 
 * 
 * 	If the character read is a letter, that letter is written onto the tape.
 * 	If the character read is a digit (say d), the entire current tape is repeatedly written d-1 more times in total.
 * 
 * 
 * Now for some encoded string S, and an index K, find and return the K-th letter (1 indexed) in the decoded string.
 * 
 *  
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: S = "leet2code3", K = 10
 * Output: "o"
 * Explanation: 
 * The decoded string is "leetleetcodeleetleetcodeleetleetcode".
 * The 10th letter in the string is "o".
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: S = "ha22", K = 5
 * Output: "h"
 * Explanation: 
 * The decoded string is "hahahaha".  The 5th letter is "h".
 * 
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: S = "a2345678999999999999999", K = 1
 * Output: "a"
 * Explanation: 
 * The decoded string is "a" repeated 8301530446056247680 times.  The 1st letter is "a".
 * 
 * 
 *  
 * 
 * Note:
 * 
 * 
 * 	2 <= S.length <= 100
 * 	S will only contain lowercase letters and digits 2 through 9.
 * 	S starts with a letter.
 * 	1 <= K <= 10^9
 * 	The decoded string is guaranteed to have less than 2^63 letters.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [880] 索引处的解码字符串
 * 
 * 
 * 给定一个编码字符串 S。为了找出解码字符串并将其写入磁带，从编码字符串中每次读取一个字符，并采取以下步骤：
 * 
 * 
 * 	如果所读的字符是字母，则将该字母写在磁带上。
 * 	如果所读的字符是数字（例如 d），则整个当前磁带总共会被重复写 d-1 次。
 * 
 * 
 * 现在，对于给定的编码字符串 S 和索引 K，查找并返回解码字符串中的第 K 个字母。
 * 
 *  
 * 
 * 示例 1：
 * 
 * 输入：S = "leet2code3", K = 10
 * 输出："o"
 * 解释：
 * 解码后的字符串为 "leetleetcodeleetleetcodeleetleetcode"。
 * 字符串中的第 10 个字母是 "o"。
 * 
 * 
 * 示例 2：
 * 
 * 输入：S = "ha22", K = 5
 * 输出："h"
 * 解释：
 * 解码后的字符串为 "hahahaha"。第 5 个字母是 "h"。
 * 
 * 
 * 示例 3：
 * 
 * 输入：S = "a2345678999999999999999", K = 1
 * 输出："a"
 * 解释：
 * 解码后的字符串为 "a" 重复 8301530446056247680 次。第 1 个字母是 "a"。
 * 
 * 
 *  
 * 
 * 提示：
 * 
 * 
 * 	2 <= S.length <= 100
 * 	S 只包含小写字母与数字 2 到 9 。
 * 	S 以字母开头。
 * 	1 <= K <= 10^9
 * 	解码后的字符串保证少于 2^63 个字母。
 * 
 */
public class M_880_DecodedStringAtIndex {
    public String decodeAtIndex(String S, int K) {
        
    }
}