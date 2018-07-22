/**
 * [126] Word Ladder II
 * 
 * difficulty: Hard
 * 
 * TestCase Example: "hit" "cog" ["hot","dot","dog","lot","log","cog"]
 * 
 * https://leetcode-cn.com/problems/word-ladder-ii/
 * 
 * 
 * Given two words (beginWord and endWord), and a dictionary's word list, find all shortest transformation sequence(s) from beginWord to endWord, such that:
 * 
 * 
 * 	Only one letter can be changed at a time
 * 	Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
 * 
 * 
 * Note:
 * 
 * 
 * 	Return an empty list if there is no such transformation sequence.
 * 	All words have the same length.
 * 	All words contain only lowercase alphabetic characters.
 * 	You may assume no duplicates in the word list.
 * 	You may assume beginWord and endWord are non-empty and are not the same.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input:
 * beginWord = "hit",
 * endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 * 
 * Output:
 * [
 *   ["hit","hot","dot","dog","cog"],
 *   ["hit","hot","lot","log","cog"]
 * ]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log"]
 * 
 * Output: []
 * 
 * Explanation: The endWord "cog" is not in wordList, therefore no possible transformation.
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
 * [126] 单词接龙 II
 * 
 * 
 * 给定两个单词（beginWord 和 endWord）和一个字典 wordList，找出所有从 beginWord 到 endWord 的最短转换序列。转换需遵循如下规则：
 * 
 * 
 * 	每次转换只能改变一个字母。
 * 	转换过程中的中间单词必须是字典中的单词。
 * 
 * 
 * 说明:
 * 
 * 
 * 	如果不存在这样的转换序列，返回一个空列表。
 * 	所有单词具有相同的长度。
 * 	所有单词只由小写字母组成。
 * 	字典中不存在重复的单词。
 * 	你可以假设 beginWord 和 endWord 是非空的，且二者不相同。
 * 
 * 
 * 示例 1:
 * 
 * 输入:
 * beginWord = "hit",
 * endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 * 
 * 输出:
 * [
 *   ["hit","hot","dot","dog","cog"],
 *   ["hit","hot","lot","log","cog"]
 * ]
 * 
 * 
 * 示例 2:
 * 
 * 输入:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log"]
 * 
 * 输出: []
 * 
 * 解释: endWord "cog" 不在字典中，所以不存在符合要求的转换序列。
 * 
 */
public class H_126_WordLadderIi {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        
    }
}