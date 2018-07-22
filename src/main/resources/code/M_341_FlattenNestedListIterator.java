/**
 * [341] Flatten Nested List Iterator
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [[1,1],2,[1,1]]
 * 
 * https://leetcode-cn.com/problems/flatten-nested-list-iterator/
 * 
 * 
 * Given a nested list of integers, implement an iterator to flatten it.
 * 
 * Each element is either an integer, or a list -- whose elements may also be integers or other lists.
 * 
 * Example 1:
 * Given the list [[1,1],2,[1,1]],
 * 
 * By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].
 * 
 * 
 * 
 * Example 2:
 * Given the list [1,[4,[6]]],
 * 
 * By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [341] 扁平化嵌套列表迭代器
 * 
 * 
 * 给出一个嵌套的整型列表。设计一个迭代器，遍历这个整型列表中的所有整数。
 * 
 * 列表中的项或者为一个整数，或者是另一个列表。
 * 
 * 示例 1:
 * 给定列表 [[1,1],2,[1,1]],
 * 
 * 通过重复调用 next 直到 hasNext 返回false，next 返回的元素的顺序应该是: [1,1,2,1,1].
 * 
 * 示例 2:
 * 给定列表 [1,[4,[6]]],
 * 
 * 通过重复调用 next 直到 hasNext 返回false，next 返回的元素的顺序应该是: [1,4,6].
 * 
 */
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    public NestedIterator(List<NestedInteger> nestedList) {
        
    }

    @Override
    public Integer next() {
        
    }

    @Override
    public boolean hasNext() {
        
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */