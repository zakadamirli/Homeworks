package Lesson_15.Homework;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int score = 0;

    public static void main(String[] args) {
        System.out.println("Welcome the shape game:\n1- calculate area of Circle\n2- calculate area of Rectangle" +
                "\n3- calculate area of Triangle");
        while (true) {
            System.out.println("your option");
            int yourOption = scanner.nextInt();
            if (yourOption == 1) {
                CalcCircle.circleGame();
                System.out.println();
                System.out.println("do you continue game: y/n");
                scanner.nextLine();
                String continues = scanner.nextLine();
                if (continues.equals("n")) {
                    System.out.println("Game is over: \nYour Score is: " + score);
                    break;
                }
            } else if (yourOption == 2) {
                CalcRectangle.rectangleGame();
                System.out.println("do you continue game: y/n");
                scanner.nextLine();
                String continues = scanner.nextLine();
                if (continues.equals("n")) {
                    System.out.println("Game is over: \nYour Score is: " + score);
                    break;
                }
            } else if (yourOption == 3) {
                CalcTriangle.triangleGame();
                System.out.println("do you continue game: y/n");
                scanner.nextLine();
                String continues = scanner.nextLine();
                if (continues.equals("n")) {
                    System.out.println("Game is over: \nYour Score is: " + score);
                    break;
                }
            } else {
                System.out.println("your option invalid enter option again: ");
            }
        }
    }
}
