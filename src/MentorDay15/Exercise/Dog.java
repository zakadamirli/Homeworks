package MentorDay15.Exercise;

public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println(getName() + " is barking.");
    }

    @Override
    public void makeSound() {
        bark();
    }
}
