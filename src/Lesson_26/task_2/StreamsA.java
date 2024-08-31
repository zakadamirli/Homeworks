package Lesson_26.task_2;

import java.util.ArrayList;
import java.util.List;

public class StreamsA {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Maserati");
        cars.add("Ford");
        cars.add("Porsche");

        cars.stream().filter(car -> car.length() < 5).forEach(System.out::println);
    }
}