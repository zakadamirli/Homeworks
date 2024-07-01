package MentorDay02;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner inputConsoles=new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius=inputConsoles.nextDouble();

        double perimeter=2*Math.PI*radius;
        double area=Math.PI*Math.pow(radius,2);

        System.out.println("Perimeter "+perimeter);
        System.out.println("Area "+area);

    }
}

