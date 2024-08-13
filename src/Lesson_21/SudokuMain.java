package Lesson_21;

import java.util.Scanner;

public class SudokuMain {
    public static void main(String[] args) {
        Sudoku game = new Sudoku();
        Scanner sc = new Scanner(System.in);
        System.out.println("Play Free Sudoku Now! ");
        System.out.println("3 sansin var");
        int gameCount = 0;
        do {
            System.out.println("Enter row (srt)");
            int str = sc.nextInt();
            System.out.println("Enter column (stn)");
            int stn = sc.nextInt();
            System.out.println("Enter value: ");
            int value = sc.nextInt();
            Sudoku.board[str][stn] = value;
            if (game.isValidRow(Sudoku.board, str, stn) && game.isValidColumn(Sudoku.board, str, stn) &&
                    game.isValidSubGrid(Sudoku.board, game.detectSubGridStartRow(str), game.detectSubGridStartColumn(stn))) {
                Sudoku.score += 5;
                System.out.println("Congratulation!!!!\n5 points were added to the score...\nYour score: " + Sudoku.score);
                gameCount++;
            } else {

                System.out.println("You've lost the game. Better luck next time!");
                gameCount++;
            }
        } while (gameCount != 3);
    }
}
