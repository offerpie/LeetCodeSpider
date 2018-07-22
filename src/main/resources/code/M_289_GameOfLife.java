/**
 * [289] Game of Life
 * 
 * difficulty: Medium
 * 
 * TestCase Example: [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
 * 
 * https://leetcode-cn.com/problems/game-of-life/
 * 
 * 
 * According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 * 
 * Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
 * 
 * 
 * 	Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 * 	Any live cell with two or three live neighbors lives on to the next generation.
 * 	Any live cell with more than three live neighbors dies, as if by over-population..
 * 	Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * 
 * 
 * Write a function to compute the next state (after one update) of the board given its current state. The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously.
 * 
 * Example:
 * 
 * 
 * Input: 
 * [
 *   [0,1,0],
 *   [0,0,1],
 *   [1,1,1],
 *   [0,0,0]
 * ]
 * Output: 
 * [
 *   [0,0,0],
 *   [1,0,1],
 *   [0,1,1],
 *   [0,1,0]
 * ]
 * 
 * 
 * Follow up:
 * 
 * 
 * 	Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
 * 	In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [289] 生命游戏
 * 
 * 
 * 根据百度百科，生命游戏，简称为生命，是英国数学家约翰·何顿·康威在1970年发明的细胞自动机。
 * 
 * 给定一个包含 m × n 个格子的面板，每一个格子都可以看成是一个细胞。每个细胞具有一个初始状态 live（1）即为活细胞， 或 dead（0）即为死细胞。每个细胞与其八个相邻位置（水平，垂直，对角线）的细胞都遵循以下四条生存定律：
 * 
 * 
 * 	如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；
 * 	如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
 * 	如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
 * 	如果死细胞周围正好有三个活细胞，则该位置死细胞复活；
 * 
 * 
 * 根据当前状态，写一个函数来计算面板上细胞的下一个（一次更新后的）状态。下一个状态是通过将上述规则同时应用于当前状态下的每个细胞所形成的，其中细胞的出生和死亡是同时发生的。
 * 
 * 示例:
 * 
 * 输入: 
 * [
 *   [0,1,0],
 *   [0,0,1],
 *   [1,1,1],
 *   [0,0,0]
 * ]
 * 输出: 
 * [
 *   [0,0,0],
 *   [1,0,1],
 *   [0,1,1],
 *   [0,1,0]
 * ]
 * 
 * 进阶:
 * 
 * 
 * 	你可以使用原地算法解决本题吗？请注意，面板上所有格子需要同时被更新：你不能先更新某些格子，然后使用它们的更新后的值再更新其他格子。
 * 	本题中，我们使用二维数组来表示面板。原则上，面板是无限的，但当活细胞侵占了面板边界时会造成问题。你将如何解决这些问题？
 * 
 */
public class M_289_GameOfLife {
    public void gameOfLife(int[][] board) {
        
    }
}