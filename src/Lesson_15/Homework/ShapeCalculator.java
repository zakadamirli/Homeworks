package Lesson_15.Homework;

public class ShapeCalculator {
    int length = 5;
    int weight = 3;

    //rectangle area
    public int rectangle(int length, int weight) {
        return length * weight;
    }

    public double rectangle(int length) {
        return length * weight;
    }

    public double rectangle(int length, double weight) {
        return length * weight;
    }

    public double rectangle(double weight) {
        return length * weight;
    }

    //circle area
    double a = Math.PI;
    double r = 5;

    public double circle(int r) {
        return Math.PI * Math.pow(r, 2);
    }

    public double circle(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public double circle() {
        return a * Math.pow(r, 2);
    }

    //triangle area
    public double triangle(int a, int b) {
        return (double) (a * b) / 2;
    }

    public double triangle(double a, int b) {
        return (double) (a * b) / 2;
    }

    public double triangle(double a, double b) {
        return (double) (a * b) / 2;
    }
}
