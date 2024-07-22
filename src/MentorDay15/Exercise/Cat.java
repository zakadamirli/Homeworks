package MentorDay15.Exercise;

public class Cat extends Pet{
    private String furColor;

    public Cat(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void meow(){
        System.out.println(getName()+" is meowing");
    }
    @Override
    public void makeSound() {
        meow();
    }
}
