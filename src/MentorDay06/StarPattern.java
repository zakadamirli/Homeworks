package MentorDay06;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nece setr olsun");
        int setrSayi = sc.nextInt();
        for (int i = 0; i < setrSayi; i++) {
            for (int j = 0; j <= setrSayi - i - 2; j++) {
                System.out.print(" ");
            }

            for (int z = 0; z <= i*2; z++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
