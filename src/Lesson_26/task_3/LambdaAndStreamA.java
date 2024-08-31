package Lesson_26.task_3;

import java.util.ArrayList;
import java.util.List;

public class LambdaAndStreamA {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("computer");
        words.add("phone");
        words.add("headphone");
        words.add("mouse");
        words.add("keyboard");

        double average = words.stream().mapToInt(word -> word.length()).average().orElseThrow(() -> new NullPointerException("there are no words in the list"));

        System.out.println("Average = " + average);
    }
}
