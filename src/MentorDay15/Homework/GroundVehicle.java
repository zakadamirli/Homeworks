package MentorDay15.Homework;

public class GroundVehicle extends Vehicle {
    private int numWheels;
    private String engineType;

    public GroundVehicle(String make, String model, int year, int topSpeed, String engineType, int numWheels) {
        super(make, model, year, topSpeed);
        this.engineType = engineType;
        this.numWheels = numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public void drive() {
        System.out.println("The ground vehicle drives.");
    }

    public void park() {
        System.out.println("The ground vehicle parks.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car accelerates quickly");
    }
}
