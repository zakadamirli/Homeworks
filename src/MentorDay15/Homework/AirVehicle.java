package MentorDay15.Homework;

public class AirVehicle extends Vehicle{
    private double wingspan;
    private int enginePower;

    public AirVehicle(String make, String model, int year, int topSpeed, double wingspan, int enginePower) {
        super(make, model, year, topSpeed);
        this.wingspan = wingspan;
        this.enginePower = enginePower;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
    public void takeOff(){
        System.out.println("The air vehicle takes off");
    }
    public void land(){
        System.out.println("The air vehicle lands");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane takes off with a powerful thrust");
    }
}
