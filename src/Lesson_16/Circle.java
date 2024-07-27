package Lesson_16;

import java.util.Scanner;

public class Circle extends Shape {
    @Override
    public void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle Area = " + circleArea);
    }
}
