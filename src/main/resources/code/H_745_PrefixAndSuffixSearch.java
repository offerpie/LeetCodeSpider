/**
 * [745] Prefix and Suffix Search
 * 
 * difficulty: Hard
 * 
 * TestCase Example: ["WordFilter","f"] [[["apple"]], ["a","e"]]
 * 
 * https://leetcode-cn.com/problems/prefix-and-suffix-search/
 * 
 * 
 * 
 * Given many words, words[i] has weight i.
 * 
 * Design a class WordFilter that supports one function, WordFilter.f(String prefix, String suffix).
 * It will return the word with given prefix and suffix with maximum weight.  If no word exists, return -1.
 * 
 * 
 * Examples:
 * 
 * Input:
 * WordFilter(["apple"])
 * WordFilter.f("a", "e") // returns 0
 * WordFilter.f("b", "") // returns -1
 * 
 * 
 * Note:
 * 
 * words has length in range [1, 15000].
 * For each test case, up to words.length queries WordFilter.f may be made.
 * words[i] has length in range [1, 10].
 * prefix, suffix have lengths in range [0, 10].
 * words[i] and prefix, suffix queries consist of lowercase letters only.
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [745] 前缀和后缀搜索
 * 
 * 
 * 给定多个 words，words[i] 的权重为 i 。
 * 
 * 设计一个类 WordFilter 实现函数WordFilter.f(String prefix, String suffix)。这个函数将返回具有前缀 prefix 和后缀suffix 的词的最大权重。如果没有这样的词，返回 -1。
 * 
 * 例子:
 * 
 * 输入:
 * WordFilter(["apple"])
 * WordFilter.f("a", "e") // 返回 0
 * WordFilter.f("b", "") // 返回 -1
 * 
 * 
 * 注意:
 * 
 * 
 * 	words的长度在[1, 15000]之间。
 * 	对于每个测试用例，最多会有words.length次对WordFilter.f的调用。
 * 	words[i]的长度在[1, 10]之间。
 * 	prefix, suffix的长度在[0, 10]之前。
 * 	words[i]和prefix, suffix只包含小写字母。
 * 
 */
class WordFilter {

    public WordFilter(String[] words) {
        
    }
    
    public int f(String prefix, String suffix) {
        
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */