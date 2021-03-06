/**
 * [688] Knight Probability in Chessboard
 * 
 * difficulty: Medium
 * 
 * TestCase Example: 3 2 0 0
 * 
 * https://leetcode-cn.com/problems/knight-probability-in-chessboard/
 * 
 * 
 * 
 * On an NxN chessboard, a knight starts at the r-th row and c-th column and attempts to make exactly K moves.  The rows and columns are 0 indexed, so the top-left square is (0, 0), and the bottom-right square is (N-1, N-1).
 * 
 * 
 * 
 * A chess knight has 8 possible moves it can make, as illustrated below.  Each move is two squares in a cardinal direction, then one square in an orthogonal direction.
 * 
 * 
 * 
 * 
 * 
 * Each time the knight is to move, it chooses one of eight possible moves uniformly at random (even if the piece would go off the chessboard) and moves there.
 * 
 * 
 * 
 * The knight continues moving until it has made exactly K moves or has moved off the chessboard.  Return the probability that the knight remains on the board after it has stopped moving.
 * 
 * 
 * Example:
 * 
 * Input: 3, 2, 0, 0
 * Output: 0.0625
 * Explanation: There are two moves (to (1,2), (2,1)) that will keep the knight on the board.
 * From each of those positions, there are also two moves that will keep the knight on the board.
 * The total probability the knight stays on the board is 0.0625.
 * 
 * 
 * 
 * Note:
 * N will be between 1 and 25.
 * K will be between 0 and 100.
 * The knight always initially starts on the board.
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [688] “马”在棋盘上的概率
 * 
 * 
 * 已知一个 NxN 的国际象棋棋盘，棋盘的行号和列号都是从0开始。即最左上角的格子记为 (0, 0), 最右下角的记为 (N-1, N-1)。 
 * 
 * 现有一个“马”（也译作“骑士”）位于 (r, c) ，并打算进行 K 次移动。 
 * 
 * 如下图所示，国际象棋的“马”每一步先沿水平或垂直方向移动2个格子，然后向与之相垂直的方向再移动1个格子，共有8个可选的位置。
 * 
 * 
 * 
 * 现在“马”每一步都从可选的位置（包括棋盘外部的）中独立随机地选择一个进行移动，直到移动了 K 次或跳到了棋盘外面。
 * 
 * 求移动结束后，“马”仍留在棋盘上的概率。
 * 
 * 例:
 * 
 * 输入: 3, 2, 0, 0
 * 输出: 0.0625
 * 解释: 
 * 输入的数据依次为 N, K, r, c
 * 第1步时，有且只有2种走法令“马”可以留在棋盘上(跳到(1,2)或(2,1))。对于以上的两种情况，各自在第2步均有且只有2种走法令“马”仍然留在棋盘上。
 * 所以“马"在结束后仍在棋盘上的概率为0.0625。
 * 
 * 
 * 注意:
 * 
 * 
 * 	N 的取值范围为 [1, 25]
 * 	K 的取值范围为 [0, 100]
 * 	开始时，“马”总是位于棋盘上
 * 
 */
public class M_688_KnightProbabilityInChessboard {
    public double knightProbability(int N, int K, int r, int c) {
        
    }
}