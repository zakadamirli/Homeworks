package MentorDay15.Homework;

public class VehicleMain {
    public static void main(String[] args) {
        GroundVehicle groundVehicle=new GroundVehicle("Porsche","911 GT3 RS",2023,311,"4.0L Naturally Aspirated Flat-6",4);
        AirVehicle airVehicle=new AirVehicle("F-16","Fighting Falcon (Block 50/52)",2020,2414,9.96,130); //enginePower kN
        WaterVehicle waterVehicle=new WaterVehicle("Boston Whaler","270 Dauntless",2023,80,"Monohull",400 ); //Powerboat


        groundVehicle.accelerate();
        groundVehicle.brake();
        groundVehicle.drive();
        groundVehicle.park();

        airVehicle.accelerate();
        airVehicle.brake();
        airVehicle.takeOff();
        airVehicle.land();

        waterVehicle.accelerate();
        waterVehicle.brake();
        waterVehicle.sail();
        waterVehicle.dock();
    }
}
