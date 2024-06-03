package MentorDay05;

import java.util.Scanner;

public class PrimNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int squareRoot = (int) Math.sqrt(num);
        boolean isPrime = true;
        for (int i = 2; i < squareRoot; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Primedir");
        } else {
            System.out.println("Deyil");
        }
    }
}

