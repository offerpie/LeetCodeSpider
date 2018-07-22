/**
 * [839] Similar String Groups
 * 
 * difficulty: Hard
 * 
 * TestCase Example: ["tars","rats","arts","star"]
 * 
 * https://leetcode-cn.com/problems/similar-string-groups/
 * 
 * 
 * Two strings X and Y are similar if we can swap two letters (in different positions) of X, so that it equals Y.
 * 
 * For example, "tars" and "rats" are similar (swapping at positions 0 and 2), and "rats" and "arts" are similar, but "star" is not similar to "tars", "rats", or "arts".
 * 
 * Together, these form two connected groups by similarity: {"tars", "rats", "arts"} and {"star"}.  Notice that "tars" and "arts" are in the same group even though they are not similar.  Formally, each group is such that a word is in the group if and only if it is similar to at least one other word in the group.
 * 
 * We are given a list A of unique strings.  Every string in A is an anagram of every other string in A.  How many groups are there?
 * 
 * Example 1:
 * 
 * 
 * Input: ["tars","rats","arts","star"]
 * Output: 2
 * 
 * Note:
 * 
 * 
 * 	A.length <= 2000
 * 	A[i].length <= 1000
 * 	A.length * A[i].length <= 20000
 * 	All words in A consist of lowercase letters only.
 * 	All words in A have the same length and are anagrams of each other.
 * 	The judging time limit has been increased for this question.
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [839] 相似字符串组
 * 
 * 
 * 如果我们交换字符串 X 中的两个不同位置的字母，使得它和字符串 Y 相等，那么称 X 和 Y 两个字符串相似。
 * 
 * 例如，"tars" 和 "rats" 是相似的 (交换 0 与 2 的位置)； "rats" 和 "arts" 也是相似的，但是 "star" 不与 "tars"，"rats"，或 "arts" 相似。
 * 
 * 总之，它们通过相似性形成了两个关联组：{"tars", "rats", "arts"} 和 {"star"}。注意，"tars" 和 "arts" 是在同一组中，即使它们并不相似。形式上，对每个组而言，要确定一个单词在组中，只需要这个词和该组中至少一个单词相似。
 * 
 * 我们给出了一个不包含重复的字符串列表 A。列表中的每个字符串都是 A 中其它所有字符串的一个字母异位词。请问 A 中有多少个相似字符串组？
 * 
 * 示例：
 * 
 * 输入：["tars","rats","arts","star"]
 * 输出：2
 * 
 * 提示：
 * 
 * 
 * 	A.length <= 2000
 * 	A[i].length <= 1000
 * 	A.length * A[i].length <= 20000
 * 	A 中的所有单词都只包含小写字母。
 * 	A 中的所有单词都具有相同的长度，且是彼此的字谜。
 * 	此问题的判断限制时间已经延长。
 * 
 * 
 * 备注：
 * 
 *       字母异位词[anagram]，一种把某个字符串的字母的位置（顺序）加以改换所形成的新词。
 * 
 */
public class H_839_SimilarStringGroups {
    public int numSimilarGroups(String[] A) {
        
    }
}