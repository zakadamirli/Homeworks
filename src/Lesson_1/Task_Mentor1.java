package Lesson_1;

import java.util.Scanner;

public class Task_Mentor1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mil");
        double mil= sc.nextDouble();

        double kilo=mil*1609;

        System.out.println("Kilometr: " +kilo);
    }
}