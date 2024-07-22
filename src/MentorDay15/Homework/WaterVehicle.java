package MentorDay15.Homework;

public class WaterVehicle extends Vehicle {
    String hullType;
    int enginePower;

    public WaterVehicle(String make, String model, int year, int topSpeed, String hullType, int enginePower) {
        super(make, model, year, topSpeed);
        this.hullType = hullType;
        this.enginePower = enginePower;
    }

    public String getHullType() {
        return hullType;
    }

    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
    public void sail() {
        System.out.println("The water vehicle sails.");
    }

    public void dock() {
        System.out.println("The water vehicle docks.");
    }

    @Override
    public void accelerate() {
        System.out.println("The powerboat accelerates swiftly with its powerful engines");
    }
}
