package MentorDay17.Interface;

public class Person implements Swim, Walk {

    @Override
    public void swim() {
        System.out.println("Person is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Person is walking");
    }
}
