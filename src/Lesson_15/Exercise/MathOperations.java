package Lesson_15.Exercise;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b;
    }

    public int add(int a) {
        return a + 5;
    }

    public double add(int a, int b, double c) {
        return a + b + c;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public double subtract(int a, int b) {
        return a - b;
    }

    public double subtract(int a, int b, int c) {
        return a - b + c;
    }

    public int subtract(int a) {
        return a - 5;
    }

    public int multiply(int b) {
        return 5 * b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(int a, int b, double c) {
        return a * b * c;
    }

    public double multiply(double a) {
        return a * 4;
    }

    public void divide(double a, double b) {
        System.out.println(a / b);
    }

    public void divide(int a, double b) {
        System.out.println(a / b);
    }

    public void divide(int a, int b) {
        System.out.println(a / b);
    }

    public void divide(long a, double b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        System.out.println(mathOperations.add(1, 2));
        System.out.println(mathOperations.add(1, 2.4));
        System.out.println(mathOperations.add(3));
        System.out.println(mathOperations.add(1, 2, 3));
        mathOperations.divide(1, 2);
        mathOperations.divide(1.3, 3.4);
        System.out.println(mathOperations.multiply(1, 2));
    }
}
