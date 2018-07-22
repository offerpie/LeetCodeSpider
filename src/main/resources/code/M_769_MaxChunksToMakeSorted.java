/**
 * [769] Max Chunks To Make Sorted
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [4,3,2,1,0]
 * 
 * https://leetcode-cn.com/problems/max-chunks-to-make-sorted/
 * 
 * 
 * Given an array arr that is a permutation of [0, 1, ..., arr.length - 1], we split the array into some number of "chunks" (partitions), and individually sort each chunk.  After concatenating them, the result equals the sorted array.
 * 
 * What is the most number of chunks we could have made?
 * 
 * Example 1:
 * 
 * 
 * Input: arr = [4,3,2,1,0]
 * Output: 1
 * Explanation:
 * Splitting into two or more chunks will not return the required result.
 * For example, splitting into [4, 3], [2, 1, 0] will result in [3, 4, 0, 1, 2], which isn't sorted.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: arr = [1,0,2,3,4]
 * Output: 4
 * Explanation:
 * We can split into two chunks, such as [1, 0], [2, 3, 4].
 * However, splitting into [1, 0], [2], [3], [4] is the highest number of chunks possible.
 * 
 * 
 * Note:
 * 
 * 
 * 	arr will have length in range [1, 10].
 * 	arr[i] will be a permutation of [0, 1, ..., arr.length - 1].
 * 
 * 
 *  
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [769] 最多能完成排序的块
 * 
 * 
 * 数组arr是[0, 1, ..., arr.length - 1]的一种排列，我们将这个数组分割成几个“块”，并将这些块分别进行排序。之后再连接起来，使得连接的结果和按升序排序后的原数组相同。
 * 
 * 我们最多能将数组分成多少块？
 * 
 * 示例 1:
 * 
 * 输入: arr = [4,3,2,1,0]
 * 输出: 1
 * 解释:
 * 将数组分成2块或者更多块，都无法得到所需的结果。
 * 例如，分成 [4, 3], [2, 1, 0] 的结果是 [3, 4, 0, 1, 2]，这不是有序的数组。
 * 
 * 
 * 示例 2:
 * 
 * 输入: arr = [1,0,2,3,4]
 * 输出: 4
 * 解释:
 * 我们可以把它分成两块，例如 [1, 0], [2, 3, 4]。
 * 然而，分成 [1, 0], [2], [3], [4] 可以得到最多的块数。
 * 
 * 
 * 注意:
 * 
 * 
 * 	arr 的长度在 [1, 10] 之间。
 * 	arr[i]是 [0, 1, ..., arr.length - 1]的一种排列。
 * 
 */
public class M_769_MaxChunksToMakeSorted {
    public int maxChunksToSorted(int[] arr) {
        
    }
}