package Lesson_14.OverridAndSuper;

public class Task_2_Main {
    public static void main(String[] args) {
        Circle circle=new Circle(4.5);
        Rectangle rectangle=new Rectangle(6.0,7.0);

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
    }
}
