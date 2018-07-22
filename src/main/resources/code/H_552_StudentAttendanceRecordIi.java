/**
 * [552] Student Attendance Record II
 * 
 * difficulty: Hard
 * 
 * TestCase Example: 1
 * 
 * https://leetcode-cn.com/problems/student-attendance-record-ii/
 * 
 * 
 * Given a positive integer n, return the number of all possible attendance records with length n, which will be regarded as rewardable. The answer may be very large, return it after mod 109 + 7.
 * 
 * A student attendance record is a string that only contains the following three characters:
 * 
 * 
 * 
 * 'A' : Absent. 
 * 'L' : Late.
 *  'P' : Present. 
 * 
 * 
 * 
 * 
 * A record is regarded as rewardable if it doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
 * 
 * Example 1:
 * 
 * Input: n = 2
 * Output: 8 
 * Explanation:
 * There are 8 records with length 2 will be regarded as rewardable:
 * "PP" , "AP", "PA", "LP", "PL", "AL", "LA", "LL"
 * Only "AA" won't be regarded as rewardable owing to more than one absent times. 
 * 
 * 
 * 
 * Note:
 * The value of n won't exceed 100,000.
 * 
 * 
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [552] 学生出勤记录 II
 * 
 * 
 * 给定一个正整数 n，返回长度为 n 的所有可被视为可奖励的出勤记录的数量。 答案可能非常大，你只需返回结果mod 109 + 7的值。
 * 
 * 学生出勤记录是只包含以下三个字符的字符串：
 * 
 * 
 * 	'A' : Absent，缺勤
 * 	'L' : Late，迟到
 * 	'P' : Present，到场
 * 
 * 
 * 如果记录不包含多于一个'A'（缺勤）或超过两个连续的'L'（迟到），则该记录被视为可奖励的。
 * 
 * 示例 1:
 * 
 * 输入: n = 2
 * 输出: 8 
 * 解释：
 * 有8个长度为2的记录将被视为可奖励：
 * "PP" , "AP", "PA", "LP", "PL", "AL", "LA", "LL"
 * 只有"AA"不会被视为可奖励，因为缺勤次数超过一次。
 * 
 * 注意：n 的值不会超过100000。
 * 
 */
public class H_552_StudentAttendanceRecordIi {
    public int checkRecord(int n) {
        
    }
}