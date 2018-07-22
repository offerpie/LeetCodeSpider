/**
 * [799] Champagne Tower
 * 
 * difficulty: Medium
 * 
 * TestCase Example: 1 1 1
 * 
 * https://leetcode-cn.com/problems/champagne-tower/
 * 
 * 
 * We stack glasses in a pyramid, where the first row has 1 glass, the second row has 2 glasses, and so on until the 100th row.  Each glass holds one cup (250ml) of champagne.
 * 
 * Then, some champagne is poured in the first glass at the top.  When the top most glass is full, any excess liquid poured will fall equally to the glass immediately to the left and right of it.  When those glasses become full, any excess champagne will fall equally to the left and right of those glasses, and so on.  (A glass at the bottom row has it's excess champagne fall on the floor.)
 * 
 * For example, after one cup of champagne is poured, the top most glass is full.  After two cups of champagne are poured, the two glasses on the second row are half full.  After three cups of champagne are poured, those two cups become full - there are 3 full glasses total now.  After four cups of champagne are poured, the third row has the middle glass half full, and the two outside glasses are a quarter full, as pictured below.
 * 
 * 
 * 
 * Now after pouring some non-negative integer cups of champagne, return how full the j-th glass in the i-th row is (both i and j are 0 indexed.)
 * 
 *  
 * 
 * 
 * Example 1:
 * Input: poured = 1, query_glass = 1, query_row = 1
 * Output: 0.0
 * Explanation: We poured 1 cup of champange to the top glass of the tower (which is indexed as (0, 0)). There will be no excess liquid so all the glasses under the top glass will remain empty.
 * 
 * Example 2:
 * Input: poured = 2, query_glass = 1, query_row = 1
 * Output: 0.5
 * Explanation: We poured 2 cups of champange to the top glass of the tower (which is indexed as (0, 0)). There is one cup of excess liquid. The glass indexed as (1, 0) and the glass indexed as (1, 1) will share the excess liquid equally, and each will get half cup of champange.
 * 
 * 
 *  
 * 
 * Note:
 * 
 * 
 * 	poured will be in the range of [0, 10 ^ 9].
 * 	query_glass and query_row will be in the range of [0, 99].
 * 
 * 
 *  
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [799] 香槟塔
 * 
 * 
 * 我们把玻璃杯摆成金字塔的形状，其中第一层有1个玻璃杯，第二层有2个，依次类推到第100层，每个玻璃杯(250ml)将盛有香槟。
 * 
 * 从顶层的第一个玻璃杯开始倾倒一些香槟，当顶层的杯子满了，任何溢出的香槟都会立刻等流量的流向左右两侧的玻璃杯。当左右两边的杯子也满了，就会等流量的流向它们左右两边的杯子，依次类推。（当最底层的玻璃杯满了，香槟会流到地板上）
 * 
 * 例如，在倾倒一杯香槟后，最顶层的玻璃杯满了。倾倒了两杯香槟后，第二层的两个玻璃杯各自盛放一半的香槟。在倒三杯香槟后，第二层的香槟满了 - 此时总共有三个满的玻璃杯。在倒第四杯后，第三层中间的玻璃杯盛放了一半的香槟，他两边的玻璃杯各自盛放了四分之一的香槟，如下图所示。
 * 
 * 
 * 
 * 现在当倾倒了非负整数杯香槟后，返回第 i 行 j 个玻璃杯所盛放的香槟占玻璃杯容积的比例（i 和 j都从0开始）。
 * 
 *  
 * 
 * 示例 1:
 * 输入: poured(倾倒香槟总杯数) = 1, query_glass(杯子的位置数) = 1, query_row(行数) = 1
 * 输出: 0.0
 * 解释: 我们在顶层（下标是（0，0））倒了一杯香槟后，没有溢出，因此所有在顶层以下的玻璃杯都是空的。
 * 
 * 示例 2:
 * 输入: poured(倾倒香槟总杯数) = 2, query_glass(杯子的位置数) = 1, query_row(行数) = 1
 * 输出: 0.5
 * 解释: 我们在顶层（下标是（0，0）倒了两杯香槟后，有一杯量的香槟将从顶层溢出，位于（1，0）的玻璃杯和（1，1）的玻璃杯平分了这一杯香槟，所以每个玻璃杯有一半的香槟。
 * 
 * 
 * 注意:
 * 
 * 
 * 	poured 的范围[0, 10 ^ 9]。
 * 	query_glass 和query_row 的范围 [0, 99]。
 * 
 */
public class M_799_ChampagneTower {
    public double champagneTower(int poured, int query_row, int query_glass) {
        
    }
}