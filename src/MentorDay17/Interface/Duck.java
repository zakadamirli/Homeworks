package MentorDay17.Interface;

public class Duck implements Swim, Fly, Walk {

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Duck is walking");
    }
}
