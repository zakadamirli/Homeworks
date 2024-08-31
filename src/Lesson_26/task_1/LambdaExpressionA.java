package Lesson_26.task_1;

import java.util.Scanner;

public class LambdaExpressionA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Check isPositive = number1 -> number1 > 0;

        if (isPositive.check(number)) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative or equals zero");
        }

    }
}