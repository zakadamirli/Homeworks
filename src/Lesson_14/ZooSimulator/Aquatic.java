package Lesson_14.ZooSimulator;

public class Aquatic extends Animal {
    private double swimmingDepth;

    public Aquatic(String name, int age, String sound, double swimmingDepth) {
        super(name, age, sound);
        this.swimmingDepth = swimmingDepth;
    }

    public double getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(double swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public void swim() {
        System.out.println(getName() + " is swimming at a depth of " + swimmingDepth + " meters");
    }
}
