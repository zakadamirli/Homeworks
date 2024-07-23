package Lesson_14.Inheritance;

public class Task_1_Main {
    public static void main(String[] args) {
        Car car=new Car("Toyota","L200",4);
        Bike bike=new Bike("Trek","Marlin",2);

        car.displayDetails();
        System.out.println();
        bike.displayDetails();

    }
}
