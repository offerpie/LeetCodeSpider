/**
 * [756] Pyramid Transition Matrix
 * 
 * difficulty: Medium
 * 
 * TestCase Example: "ABC" ["ABD","BCE","DEF","FFF"]
 * 
 * https://leetcode-cn.com/problems/pyramid-transition-matrix/
 * 
 * 
 * 
 * We are stacking blocks to form a pyramid.  Each block has a color which is a one letter string, like `'Z'`.
 * 
 * For every block of color `C` we place not in the bottom row, we are placing it on top of a left block of color `A` and right block of color `B`.  We are allowed to place the block there only if `(A, B, C)` is an allowed triple.
 * 
 * We start with a bottom row of bottom, represented as a single string.  We also start with a list of allowed triples allowed.  Each allowed triple is represented as a string of length 3.
 * 
 * Return true if we can build the pyramid all the way to the top, otherwise false.
 * 
 * 
 * Example 1:
 * 
 * Input: bottom = "XYZ", allowed = ["XYD", "YZE", "DEA", "FFF"]
 * Output: true
 * Explanation:
 * We can stack the pyramid like this:
 *     A
 *    / \
 *   D   E
 *  / \ / \
 * X   Y   Z
 * 
 * This works because ('X', 'Y', 'D'), ('Y', 'Z', 'E'), and ('D', 'E', 'A') are allowed triples.
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: bottom = "XXYX", allowed = ["XXX", "XXY", "XYX", "XYY", "YXZ"]
 * Output: false
 * Explanation:
 * We can't stack the pyramid to the top.
 * Note that there could be allowed triples (A, B, C) and (A, B, D) with C != D.
 * 
 * 
 * 
 * Note:
 * 
 * bottom will be a string with length in range [2, 8].
 * allowed will have length in range [0, 200].
 * Letters in all strings will be chosen from the set {'A', 'B', 'C', 'D', 'E', 'F', 'G'}.
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [756] 金字塔转换矩阵
 * 
 * 
 * 现在，我们用一些方块来堆砌一个金字塔。 每个方块用仅包含一个字母的字符串表示，例如 “Z”。
 * 
 * 使用三元组表示金字塔的堆砌规则如下：
 * 
 * (A, B, C) 表示，“C”为顶层方块，方块“A”、“B”分别作为方块“C”下一层的的左、右子块。当且仅当(A, B, C)是被允许的三元组，我们才可以将其堆砌上。
 * 
 * 初始时，给定金字塔的基层 bottom，用一个字符串表示。一个允许的三元组列表 allowed，每个三元组用一个长度为 3 的字符串表示。
 * 
 * 如果可以由基层一直堆到塔尖返回true，否则返回false。
 * 
 * 示例 1:
 * 
 * 输入: bottom = "XYZ", allowed = ["XYD", "YZE", "DEA", "FFF"]
 * 输出: true
 * 解析:
 * 可以堆砌成这样的金字塔:
 *     A
 *    / \
 *   D   E
 *  / \ / \
 * X   Y   Z
 * 
 * 因为符合('X', 'Y', 'D'), ('Y', 'Z', 'E') 和 ('D', 'E', 'A') 三种规则。
 * 
 * 
 * 示例 2:
 * 
 * 输入: bottom = "XXYX", allowed = ["XXX", "XXY", "XYX", "XYY", "YXZ"]
 * 输出: false
 * 解析:
 * 无法一直堆到塔尖。
 * 注意, 允许存在三元组(A, B, C)和 (A, B, D) ，其中 C != D.
 * 
 * 
 * 注意：
 * 
 * 
 * 	bottom 的长度范围在 [2, 8]。
 * 	allowed 的长度范围在[0, 200]。
 * 	方块的标记字母范围为{'A', 'B', 'C', 'D', 'E', 'F', 'G'}。
 * 
 */
public class M_756_PyramidTransitionMatrix {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        
    }
}