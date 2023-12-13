package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        System.out.println(queens(4));
    }

    public static List<List<String>> queens(int n) {
        int[][] board = new int[n][n];
        List<List<String>> solutions = new ArrayList<>();
        solveNQueens(board, 0, solutions);
        return solutions;
    }

    public static void solveNQueens(int[][] board, int row, List<List<String>> solutions) {
        if (row == board.length) {
            solutions.add(boardToList(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isValid(board, col, row)) {
                board[row][col] = 1;
                solveNQueens(board, row + 1, solutions);
                board[row][col] = 0;
            }
        }
    }

    public static boolean isValid(int[][] board, int col, int row) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) return false;
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }

    public static List<String> boardToList(int[][] board) {
        List<String> solution = new ArrayList<>();
        for (int[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (int cell : row) {
                sb.append(cell == 1 ? 'Q' : '.');
            }
            solution.add(sb.toString());
        }
        return solution;
    }
}
