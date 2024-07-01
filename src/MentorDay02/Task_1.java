package MentorDay02;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner inputConsoles=new Scanner(System.in);

        System.out.println("Enter first side");
        double firstSide=inputConsoles.nextDouble();

        System.out.println("Enter second side");
        double secondSide=inputConsoles.nextDouble();

        double perimeter=2*(firstSide+secondSide);
        double area=firstSide*secondSide;

        System.out.println("Perimeter "+perimeter);
        System.out.println("Area "+area);

    }
}
