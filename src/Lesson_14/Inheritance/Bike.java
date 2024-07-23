package Lesson_14.Inheritance;

public class Bike extends Vehicle{
    private int numWheels;

    public Bike(String make, String model, int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Wheels: " + numWheels);
    }
}
