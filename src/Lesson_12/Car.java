package Lesson_12;

public class Car {
    private String make;
    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car() {
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public static void main(String[] args) {
//        Car car = new Car("BMW","M5");
//        Car car2 = new Car("Mercedes","S-Class");
//        Car car3 = new Car("Porsche","911");
//
//        System.out.println(car);
//        System.out.println(car2);
//        System.out.println(car3);

        Car car = new Car();
        car.setMake("Opel");
        car.setModel("Astra");
        System.out.println(car.getMake());
        System.out.println(car.getModel());
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
