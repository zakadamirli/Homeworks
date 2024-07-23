package Lesson_12;
import java.util.Random;
import java.util.Scanner;
public class CoinFlip {


        static Scanner sc = new Scanner(System.in);
        static Random random = new Random();


        public static void main(String[] args) {
            userOption();
            while (true) {
                System.out.print("Do you want to play again? (yes or no): ");
                String option = sc.next();

                switch (option) {
                    case "yes":
                        userOption();
                        break;
                    case "no":
                        System.exit(0);
                    default:
                        System.out.println("Wrong option");
                }
            }

        }

        public static void userOption() {
            System.out.print("Guess Heads(0) or Tails(1): ");
            int userGuess = sc.nextInt();

            int randomCoin = random.nextInt(2);

            if (userGuess == randomCoin) {
                System.out.println("User's guess is correct");
            } else {
                System.out.println("User's guess is wrong! ");
            }
        }
    }

