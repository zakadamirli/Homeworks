package Lesson_14.OverridAndSuper;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        super.calculateArea(); //task 3 use super key word
        return length*width;
    }
}
