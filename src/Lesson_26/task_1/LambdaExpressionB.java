package Lesson_26.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressionB {
    public static void main(String[] args) {
        double[] numbers = {5.5, 9.6, 3.4, 8.1, 4.8};

        List<Integer> numberList = new ArrayList<>();
        Arrays.stream(numbers).mapToInt(num -> (int) Math.round(num)).forEach(numberList::add);

        System.out.println(numberList);
    }
}
