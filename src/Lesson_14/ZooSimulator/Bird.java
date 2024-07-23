package Lesson_14.ZooSimulator;

public class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, String sound, double wingSpan) {
        super(name, age, sound);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public void fly() {
        System.out.println(getName() + " is flying with a wingspan of " + wingSpan + " meters");
    }
}
