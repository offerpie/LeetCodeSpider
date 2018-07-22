/**
 * [636] Exclusive Time of Functions
 * 
 * difficulty: Medium
 * 
 * TestCase Example: 2 ["0:start:0","1:start:2","1:end:5","0:end:6"]
 * 
 * https://leetcode-cn.com/problems/exclusive-time-of-functions/
 * 
 * 
 * Given the running logs of n functions that are executed in a nonpreemptive single threaded CPU, find the exclusive time of these functions. 
 * 
 * Each function has a unique id, start from 0 to n-1. A function may be called recursively or by another function.
 * 
 * A log is a string has this format : function_id:start_or_end:timestamp. For example, "0:start:0" means function 0 starts from the very beginning of time 0. "0:end:0" means function 0 ends to the very end of time 0. 
 * 
 * Exclusive time of a function is defined as the time spent within this function, the time spent by calling other functions should not be considered as this function's exclusive time. You should return the exclusive time of each function sorted by their function id.
 * 
 * Example 1:
 * 
 * Input:
 * n = 2
 * logs = 
 * ["0:start:0",
 *  "1:start:2",
 *  "1:end:5",
 *  "0:end:6"]
 * Output:[3, 4]
 * Explanation:
 * Function 0 starts at time 0, then it executes 2 units of time and reaches the end of time 1. 
 * Now function 0 calls function 1, function 1 starts at time 2, executes 4 units of time and end at time 5.
 * Function 0 is running again at time 6, and also end at the time 6, thus executes 1 unit of time. 
 * So function 0 totally execute 2 + 1 = 3 units of time, and function 1 totally execute 4 units of time.
 * 
 * 
 * 
 * Note:
 * 
 * Input logs will be sorted by timestamp, NOT log id.
 * Your output should be sorted by function id, which means the 0th element of your output corresponds to the exclusive time of function 0.
 * Two functions won't start or end at the same time.
 * Functions could be called recursively, and will always end.
 * 1 <= n <= 100
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [636] 函数的独占时间
 * 
 * 
 * 给出一个非抢占单线程CPU的 n 个函数运行日志，找到函数的独占时间。
 * 
 * 每个函数都有一个唯一的 Id，从 0 到 n-1，函数可能会递归调用或者被其他函数调用。
 * 
 * 日志是具有以下格式的字符串：function_id：start_or_end：timestamp。例如："0:start:0" 表示函数 0 从 0 时刻开始运行。"0:end:0" 表示函数 0 在 0 时刻结束。
 * 
 * 函数的独占时间定义是在该方法中花费的时间，调用其他函数花费的时间不算该函数的独占时间。你需要根据函数的 Id 有序地返回每个函数的独占时间。
 * 
 * 示例 1:
 * 
 * 输入:
 * n = 2
 * logs = 
 * ["0:start:0",
 *  "1:start:2",
 *  "1:end:5",
 *  "0:end:6"]
 * 输出:[3, 4]
 * 说明：
 * 函数 0 在时刻 0 开始，在执行了  2个时间单位结束于时刻 1。
 * 现在函数 0 调用函数 1，函数 1 在时刻 2 开始，执行 4 个时间单位后结束于时刻 5。
 * 函数 0 再次在时刻 6 开始执行，并在时刻 6 结束运行，从而执行了 1 个时间单位。
 * 所以函数 0 总共的执行了 2 +1 =3 个时间单位，函数 1 总共执行了 4 个时间单位。
 * 
 * 
 * 说明：
 * 
 * 
 * 	输入的日志会根据时间戳排序，而不是根据日志Id排序。
 * 	你的输出会根据函数Id排序，也就意味着你的输出数组中序号为 0 的元素相当于函数 0 的执行时间。
 * 	两个函数不会在同时开始或结束。
 * 	函数允许被递归调用，直到运行结束。
 * 	1 <= n <= 100
 * 
 */
public class M_636_ExclusiveTimeOfFunctions {
    public int[] exclusiveTime(int n, List<String> logs) {
        
    }
}