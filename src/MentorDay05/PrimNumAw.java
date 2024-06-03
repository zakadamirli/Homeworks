package MentorDay05;

import java.util.Scanner;

public class PrimNumAw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int squareRoot = (int) Math.sqrt(num);
        for (int i = 2; i < squareRoot; i++) {
            if (num%i==0){
                System.out.println("the number is not prime");
                break;
            } else {
                System.out.println("the number is not prime");
            }
        }
    }
}
