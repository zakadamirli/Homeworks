package MentorDay05;

import java.util.Scanner;

public class LeYeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current year: ");
        for (int y = 0; y < 10; System.out.print("Enter a year: ")) {
              int year = sc.nextInt();
            if (year % 400 == 0) {
                System.out.println("it's a leap year");
            } else if (year % 100 == 0) {
                System.out.println("it's not a leap year");
            } else if (year % 4 == 0) {
                System.out.println("it's a leap year");
            } else {
                System.out.println(" the year is not a leap year");

            }
            y++;
        }

    }
}


