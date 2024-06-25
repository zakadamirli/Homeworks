package Lesson_7;

import java.util.Random;

public class NrmLev_02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int max = 0;

        for (int i = 0; i < 10; i++) {
            int rand_num = random.nextInt(10);
            array[i] = rand_num;
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Print the array's elements");

        for (int i : array) {
            System.out.println(i);
        }
    }
}
