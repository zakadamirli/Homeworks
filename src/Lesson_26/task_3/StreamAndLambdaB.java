package Lesson_26.task_3;

import java.util.ArrayList;
import java.util.List;

public class StreamAndLambdaB {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(6);
        numbers.add(3);
        numbers.add(9);

        int reduce = numbers.stream().reduce(1, (a, b) -> a * b);

        System.out.println("Product = " + reduce);
    }
}