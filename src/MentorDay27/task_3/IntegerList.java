package MentorDay27.task_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3, 2, 8, 5);

        List<Integer> integerList = numbers.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println("Distinct numbers in ascending order: " + integerList);
    }
}

