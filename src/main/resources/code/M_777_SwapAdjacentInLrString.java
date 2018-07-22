/**
 * [777] Swap Adjacent in LR String
 * 
 * difficulty: Medium
 * 
 * TestCase Example: "X" "L"
 * 
 * https://leetcode-cn.com/problems/swap-adjacent-in-lr-string/
 * 
 * 
 * In a string composed of 'L', 'R', and 'X' characters, like "RXXLRXRXL", a move consists of either replacing one occurrence of "XL" with "LX", or replacing one occurrence of "RX" with "XR". Given the starting string start and the ending string end, return True if and only if there exists a sequence of moves to transform one string to the other.
 * 
 * Example:
 * 
 * 
 * Input: start = "RXXLRXRXL", end = "XRLXXRRLX"
 * Output: True
 * Explanation:
 * We can transform start to end following these steps:
 * RXXLRXRXL ->
 * XRXLRXRXL ->
 * XRLXRXRXL ->
 * XRLXXRRXL ->
 * XRLXXRRLX
 * 
 * 
 * Note:
 * 
 * 
 * 	1 <= len(start) = len(end) <= 10000.
 * 	Both start and end will only consist of characters in {'L', 'R', 'X'}.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [777] 在LR字符串中交换相邻字符
 * 
 * 
 * 在一个由 'L' , 'R' 和 'X' 三个字符组成的字符串（例如"RXXLRXRXL"）中进行移动操作。一次移动操作指用一个"LX"替换一个"XL"，或者用一个"XR"替换一个"RX"。现给定起始字符串start和结束字符串end，请编写代码，当且仅当存在一系列移动操作使得start可以转换成end时， 返回True。
 * 
 * 示例 :
 * 
 * 输入: start = "RXXLRXRXL", end = "XRLXXRRLX"
 * 输出: True
 * 解释:
 * 我们可以通过以下几步将start转换成end:
 * RXXLRXRXL ->
 * XRXLRXRXL ->
 * XRLXRXRXL ->
 * XRLXXRRXL ->
 * XRLXXRRLX
 * 
 * 
 * 注意:
 * 
 * 
 * 	1 <= len(start) = len(end) <= 10000。
 * 	start和end中的字符串仅限于'L', 'R'和'X'。
 * 
 */
public class M_777_SwapAdjacentInLrString {
    public boolean canTransform(String start, String end) {
        
    }
}