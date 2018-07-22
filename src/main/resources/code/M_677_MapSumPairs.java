/**
 * [677] Map Sum Pairs
 * 
 * difficulty: Medium
 * 
 * TestCase Example: ["MapSum", "insert", "sum", "insert", "sum"] [[], ["apple",3], ["ap"], ["app",2], ["ap"]]
 * 
 * https://leetcode-cn.com/problems/map-sum-pairs/
 * 
 * 
 * 
 * Implement a MapSum class with insert, and sum methods.
 * 
 * 
 * 
 * For the method insert, you'll be given a pair of (string, integer). The string represents the key and the integer represents the value. If the key already existed, then the original key-value pair will be overridden to the new one.
 * 
 * 
 * 
 * For the method sum, you'll be given a string representing the prefix, and you need to return the sum of all the pairs' value whose key starts with the prefix.
 * 
 * 
 * Example 1:
 * 
 * Input: insert("apple", 3), Output: Null
 * Input: sum("ap"), Output: 3
 * Input: insert("app", 2), Output: Null
 * Input: sum("ap"), Output: 5
 * 
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [677] 键值映射
 * 
 * 
 * 实现一个 MapSum 类里的两个方法，insert 和 sum。
 * 
 * 对于方法 insert，你将得到一对（字符串，整数）的键值对。字符串表示键，整数表示值。如果键已经存在，那么原来的键值对将被替代成新的键值对。
 * 
 * 对于方法 sum，你将得到一个表示前缀的字符串，你需要返回所有以该前缀开头的键的值的总和。
 * 
 * 示例 1:
 * 
 * 输入: insert("apple", 3), 输出: Null
 * 输入: sum("ap"), 输出: 3
 * 输入: insert("app", 2), 输出: Null
 * 输入: sum("ap"), 输出: 5
 * 
 */
class MapSum {

    /** Initialize your data structure here. */
    public MapSum() {
        
    }
    
    public void insert(String key, int val) {
        
    }
    
    public int sum(String prefix) {
        
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */