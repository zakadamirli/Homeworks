package Lesson_26.task_2;

import java.util.ArrayList;
import java.util.List;

public class StreamsB {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(9);
        numbers.add(2);
        numbers.add(6);
        numbers.add(1);

        numbers.stream().skip(2).forEach(System.out::println);
    }
}
