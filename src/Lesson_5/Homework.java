package Lesson_5;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter score range: ");
            double scoreRange = sc.nextDouble();
//if statements
            if (scoreRange < 0 || scoreRange > 100) {
                System.out.println("Error");
                break;
            }
            if (scoreRange >= 0 && scoreRange < 61) {
                System.out.println("Letter grade = F");
            } else if (scoreRange >= 61 && scoreRange < 71) {
                System.out.println("Letter grade = D");
            } else if (scoreRange >= 71 && scoreRange < 81) {
                System.out.println("Letter grade = C");
            } else if (scoreRange >= 81 && scoreRange < 91) {
                System.out.println("Letter grade = B");
            } else if (scoreRange >= 91 && scoreRange <= 100) {
                System.out.println("Letter grade = A");
            }
        }
    }
}