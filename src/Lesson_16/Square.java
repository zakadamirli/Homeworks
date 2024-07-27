package Lesson_16;

import java.util.Scanner;

public class Square extends Shape {
    @Override
    public void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();

        double squareArea = Math.pow(side, 2);
        System.out.println("Square Area = " + squareArea);
    }
}
