package Lesson_21;


import java.util.HashSet;
import java.util.Set;

public class Sudoku {

    public static int score = 0;
    public static Set<Integer> seen = new HashSet<>();
    public static int[][] board = new int[][]{
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    public boolean isValidColumn(int[][] board, int row, int col) {
        int targetValue = board[row][col];
        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == targetValue) {
                return false;
            }
        }
        return true;
    }


    public boolean isValidRow(int[][] board, int row, int col) {
        int targetValue = board[row][col];
        for (int i = 0; i < 9; i++) {
            if (targetValue == board[row][i] && i != col) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidSubGrid(int[][] board, int startRow, int startCol) {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int currentValue = board[startRow + i][startCol + j];
                if (currentValue != 0) {
                    if (!seen.add(currentValue)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public int detectSubGridStartRow(int row) {
        if (row == 0 || row == 1 || row == 2) {
            return 0;
        } else if (row == 3 || row == 4 || row == 5) {
            return 3;
        } else {
            return 6;
        }
    }

    public int detectSubGridStartColumn(int col) {
        if (col == 0 || col == 1 || col == 2) {
            return 0;
        } else if (col == 3 || col == 4 || col == 5) {
            return 3;
        } else {
            return 6;
        }
    }
}

