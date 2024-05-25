package Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Task_Entertaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" you have 5 attempts");
        System.out.println();
        System.out.println("Welcome to the Guess the Number Game!\n" +
                "I'm thinking of a number between 10 and 30.");

        Random rand = new Random();
        int randNum = rand.nextInt(10, 30);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your guess: ");
            System.out.println();
            int guessNum = sc.nextInt();

            if(guessNum>randNum){
                System.out.print("Too high  ");
                //System.out.println("My number was : "+randNum);
            }else if (guessNum<randNum){
                System.out.print("Too low  ");
               // System.out.println("My number was : "+randNum);
            }else { //else if(guessNum==randNum){}
                System.out.println("Congratulations!");
                return;
            }
        }
    }
}
