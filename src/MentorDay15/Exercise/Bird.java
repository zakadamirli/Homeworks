package MentorDay15.Exercise;

public class Bird extends Pet{
    private double wingspan;

    public Bird(String name, int age, double weight, double wingspan) {
        super(name, age, weight);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
    public void fly(){
        System.out.println(getName()+" is flying");
    }
    public void chirp(){
        System.out.println(getName()+" is chirping");
    }

    @Override
    public void makeSound() {
        chirp();
    }
}
