package Lesson_8;

import java.util.Scanner;

public class BattleshipWarGame {
    static String[][] board = new String[10][10]; //static
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        board[1][1]="Ship";
        board[1][2]="Ship";
        board[2][3]="Ship";
        board[2][6]="Ship";
        board[2][7]="Ship";
        board[7][3]="Ship";
        board[8][9]="Ship";
        printBoard();//add ships
        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println();
            targetAndCheck();
            System.out.println();
            printBoard();
        }
        }
    public static void printBoard () {
        for (String[] s : board) {
            for (String e : s) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
    public static void targetAndCheck(){
        System.out.println("Input coordinates");
        System.out.print("Row: ");
        int row=sc.nextInt();
        System.out.print("Column: ");
        int column=sc.nextInt();

        if (board[row][column].equalsIgnoreCase("Ship")){
            board[row][column]="X";
            System.out.println("you hit");
        }else {
            board[row][column]="O";
            System.out.println("yo missed");
        }
    }

}
