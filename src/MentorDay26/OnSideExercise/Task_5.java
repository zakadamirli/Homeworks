package MentorDay26.OnSideExercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Task_5 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("hello", "world", "abcdefghij", "123456789066", "short");
        input.stream()
                .filter(n -> n.length() <= 10)
                .sorted(Comparator.comparing(String::length).reversed())
                .toList()
                .forEach(System.out::println);
    }
}
