package Lesson_14.ZooSimulator;

public class ZooMain {
    public static void main(String[] args) {

        Mammal mammal = new Mammal("Lion", 12, "roar", "Golden");
        mammal.makeSound();
        mammal.giveBirth();

        Bird bird = new Bird("Eagle", 3, "Screech", 2.0);
        bird.fly();
        bird.makeSound();

        Aquatic aquatic = new Aquatic("Dolphin", 8, "Click", 100.0);
        aquatic.makeSound();
        aquatic.swim();

    }
}
