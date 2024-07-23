package Lesson_15.Homework;

import static Lesson_15.Homework.Main.scanner;

public class CalcRectangle {

    public static void rectangleGame() {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("Calculate area of rectangle:\nenter the length and weight");
        int length = scanner.nextInt();
        double weight = scanner.nextDouble();
        double areaOfRectangle = shapeCalculator.rectangle(length, weight);
        System.out.println("Enter the area");
        double yourAnswer = scanner.nextDouble();
        if (yourAnswer == areaOfRectangle) {
            System.out.println("Your answer is correct");
            Main.score += 5;
        }
        System.out.println("Score: " + Main.score);

    }

}
