package Lesson_15.Homework;

import static Lesson_15.Homework.Main.scanner;

public class CalcCircle {
    public static void circleGame() {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("Calculate area of circle:\nenter the radius");
        int r = scanner.nextInt();
        double areaOfCircle = shapeCalculator.circle(r);
        System.out.println(areaOfCircle);
        System.out.println("Enter the area");
        double yourAnswer = scanner.nextDouble();
        if (yourAnswer == areaOfCircle) {
            System.out.println("Your answer is correct");
            Main.score += 10;
        }
        System.out.println("Score: " + Main.score);
    }
}
