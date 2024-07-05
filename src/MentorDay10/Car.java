package MentorDay10;

public class Car {
    String make="Ford";
    String model="Fusion";
    int year=2019;
    double mil=15000;

public void milCalculate(){
    double kM=mil*1.6;
    System.out.println(kM+" km");
}
public void carAge(int nowYear){
    int age=nowYear-year;
    System.out.println(age+" age");
}

    public static void main(String[] args) {
        Car carObj=new Car();
        System.out.println("Car 1: ");
        System.out.println("Make: "+carObj.make);
        System.out.println("Model: "+carObj.model);
        System.out.println("Year: "+carObj.year);
        System.out.println("Mileage: "+carObj.mil);
        System.out.println();
        carObj.milCalculate();
        carObj.carAge(2024);
    }
}
