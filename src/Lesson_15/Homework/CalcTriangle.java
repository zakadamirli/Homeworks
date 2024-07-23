package Lesson_15.Homework;

import static Lesson_15.Homework.Main.scanner;

public class CalcTriangle {
    public static void triangleGame() {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("Calculate area of triangle:\nenter the a and b");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double areaOfTriangle = shapeCalculator.triangle(a, b);
        System.out.println("Enter the area");
        double yourAnswer = scanner.nextDouble();
        if (yourAnswer == areaOfTriangle) {
            System.out.println("Your answer is correct");
            Main.score += 15;
        }
        System.out.println("Score: " + Main.score);

    }
}
