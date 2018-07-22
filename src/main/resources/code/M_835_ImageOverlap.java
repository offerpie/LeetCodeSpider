/**
 * [835] Image Overlap
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [[1,1,0],[0,1,0],[0,1,0]] [[0,0,0],[0,1,1],[0,0,1]]
 * 
 * https://leetcode-cn.com/problems/image-overlap/
 * 
 * 
 * Two images A and B are given, represented as binary, square matrices of the same size.  (A binary matrix has only 0s and 1s as values.)
 * 
 * We translate one image however we choose (sliding it left, right, up, or down any number of units), and place it on top of the other image.  After, the overlap of this translation is the number of positions that have a 1 in both images.
 * 
 * (Note also that a translation does not include any kind of rotation.)
 * 
 * What is the largest possible overlap?
 * 
 * Example 1:
 * 
 * 
 * Input: A = [[1,1,0],
 *             [0,1,0],
 *             [0,1,0]]
 *        B = [[0,0,0],
 *             [0,1,1],
 *             [0,0,1]]
 * Output: 3
 * Explanation: We slide A to right by 1 unit and down by 1 unit.
 * 
 * Notes: 
 * 
 * 
 * 	1 <= A.length = A[0].length = B.length = B[0].length <= 30
 * 	0 <= A[i][j], B[i][j] <= 1
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [835] 图像重叠
 * 
 * 
 * 给出两个图像 A 和 B ，A 和 B 为大小相同的二维正方形矩阵。（并且为二进制矩阵，只包含0和1）。
 * 
 * 我们转换其中一个图像，向左，右，上，或下滑动任何数量的单位，并把它放在另一个图像的上面。之后，该转换的重叠是指两个图像都具有 1 的位置的数目。
 * 
 * （请注意，转换不包括向任何方向旋转。）
 * 
 * 最大可能的重叠是什么？
 * 
 * 示例 1:
 * 
 * 输入：A = [[1,1,0],
 *           [0,1,0],
 *           [0,1,0]]
 *      B = [[0,0,0],
 *           [0,1,1],
 *           [0,0,1]]
 * 输出：3
 * 解释: 将 A 向右移动一个单位，然后向下移动一个单位。
 * 
 * 注意: 
 * 
 * 
 * 	1 <= A.length = A[0].length = B.length = B[0].length <= 30
 * 	0 <= A[i][j], B[i][j] <= 1
 * 
 */
public class M_835_ImageOverlap {
    public int largestOverlap(int[][] A, int[][] B) {
        
    }
}