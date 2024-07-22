package MentorDay15.Exercise;

public class AnimalPet {
    public static void main(String[] args) {
        Dog dog=new Dog("Jek",5,12.5,"Poodle");
        Cat cat= new Cat("Bella",3,5.1,"red");
        Bird bird= new Bird("Timo",1,0.2,0.5);

        dog.eat();
        dog.sleep();
        dog.makeSound();
        dog.bark();

        cat.eat();
        cat.sleep();
        cat.makeSound();
        cat.meow();

        bird.eat();
        bird.sleep();
        bird.makeSound();
        bird.fly();
        bird.chirp();
    }
}
