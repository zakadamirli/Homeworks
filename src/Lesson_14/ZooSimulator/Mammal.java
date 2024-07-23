package Lesson_14.ZooSimulator;

public class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, int age, String sound, String furColor) {
        super(name, age, sound);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void giveBirth() {
        System.out.println(getName() + " gives birth");
    }
}
