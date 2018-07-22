/**
 * [352] Data Stream as Disjoint Intervals
 * 
 * difficulty: Hard
 * 
 * TestCase Example: ["SummaryRanges","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals","addNum","getIntervals"] [[],[1],[],[3],[],[7],[],[2],[],[6],[]]
 * 
 * https://leetcode-cn.com/problems/data-stream-as-disjoint-intervals/
 * 
 * 
 * Given a data stream input of non-negative integers a1, a2, ..., an, ..., summarize the numbers seen so far as a list of disjoint intervals.
 * 
 * For example, suppose the integers from the data stream are 1, 3, 7, 2, 6, ..., then the summary will be:
 * 
 * [1, 1]
 * [1, 1], [3, 3]
 * [1, 1], [3, 3], [7, 7]
 * [1, 3], [7, 7]
 * [1, 3], [6, 7]
 * 
 * 
 * Follow up:
 * What if there are lots of merges and the number of disjoint intervals are small compared to the data stream's size?
 * 
 * 
 * Credits:Special thanks to @yunhong for adding this problem and creating most of the test cases.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [352] null
 * 
 * 
 * 
 */
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class SummaryRanges {

    /** Initialize your data structure here. */
    public SummaryRanges() {
        
    }
    
    public void addNum(int val) {
        
    }
    
    public List<Interval> getIntervals() {
        
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(val);
 * List<Interval> param_2 = obj.getIntervals();
 */