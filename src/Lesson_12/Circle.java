package Lesson_12;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){

    }

    public void calculateArea(){
        Circle circle = new Circle(5);
        double area = Math.PI * Math.pow(circle.radius, 2);
        System.out.println("Area: " + area);
    }

    public double calculateArea(double radius){
        return 0;
    }


    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea();
    }
}
