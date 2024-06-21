package MentorDay06;
//homework day 05
import java.util.Scanner;

public class PalCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
        if (reversedNumber==number){
            System.out.println("The number "+number+" is a palindrome.");
        }else {
            System.out.println("isn't palindrome");
        }
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {//12
            int digit = number % 10;//2
            reversed = reversed * 10 + digit;//0*10+2=2
            number = number/10;//1
        }
        return reversed;
    }
}

