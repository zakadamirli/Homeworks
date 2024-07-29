package MentorDay17.Interface;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Duck duck = new Duck();

        person.swim();
        person.walk();

        duck.swim();
        duck.fly();
        duck.walk();
    }
}
