package MentorDay03;

import java.util.Random;
import java.util.Scanner;

public class RandNum {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(0, 10);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int firNum = sc.nextInt();
        System.out.print("Enter your second number: ");
        int secNum = sc.nextInt();
        System.out.print("Enter your third number: ");
        int thNum = sc.nextInt();
        int largestNum;
        if (firNum >= secNum && firNum >= thNum) {
            largestNum = firNum;
        } else if (secNum >= firNum && secNum >= thNum) {
            largestNum = secNum;
        } else {
            largestNum = thNum;
        }
        System.out.println("The largest number is: " + largestNum);
        System.out.print("Random number: " + randomNum);
        if (randomNum == largestNum) {
            System.out.println(" equals with: " + largestNum);
        } else {
            System.out.println(" not equals with: " + largestNum);
        }
    }
}
