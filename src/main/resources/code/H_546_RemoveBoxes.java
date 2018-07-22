/**
 * [546] Remove Boxes
 * 
 * difficulty: Hard
 * 
 * TestCase Example: [1,3,2,2,2,3,4,3,1]
 * 
 * https://leetcode-cn.com/problems/remove-boxes/
 * 
 * 
 * Given several boxes with different colors represented by different positive numbers. 
 * You may experience several rounds to remove boxes until there is no box left. Each time you can choose some continuous boxes with the same color (composed of k boxes, k >= 1), remove them and get k*k points.
 * Find the maximum points you can get.
 * 
 * 
 * Example 1:
 * Input: 
 * 
 * [1, 3, 2, 2, 2, 3, 4, 3, 1]
 * 
 * Output:
 * 
 * 23
 * 
 * Explanation: 
 * 
 * [1, 3, 2, 2, 2, 3, 4, 3, 1] 
 * ----> [1, 3, 3, 4, 3, 1] (3*3=9 points) 
 * ----> [1, 3, 3, 3, 1] (1*1=1 points) 
 * ----> [1, 1] (3*3=9 points) 
 * ----> [] (2*2=4 points)
 * 
 * 
 * 
 * Note:
 * The number of boxes n would not exceed 100.
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [546] 移除盒子
 * 
 * 
 * 给出一些不同颜色的盒子，盒子的颜色由数字表示，即不同的数字表示不同的颜色。
 * 你将经过若干轮操作去去掉盒子，直到所有的盒子都去掉为止。每一轮你可以移除具有相同颜色的连续 k 个盒子（k >= 1），这样一轮之后你将得到 k*k 个积分。
 * 当你将所有盒子都去掉之后，求你能获得的最大积分和。
 * 
 * 示例 1：
 * 输入:
 * 
 * [1, 3, 2, 2, 2, 3, 4, 3, 1]
 * 
 * 
 * 输出:
 * 
 * 23
 * 
 * 
 * 解释:
 * 
 * [1, 3, 2, 2, 2, 3, 4, 3, 1] 
 * ----> [1, 3, 3, 4, 3, 1] (3*3=9 分) 
 * ----> [1, 3, 3, 3, 1] (1*1=1 分) 
 * ----> [1, 1] (3*3=9 分) 
 * ----> [] (2*2=4 分)
 * 
 * 
 *  
 * 
 * 提示：盒子的总数 n 不会超过 100。
 * 
 */
public class H_546_RemoveBoxes {
    public int removeBoxes(int[] boxes) {
        
    }
}