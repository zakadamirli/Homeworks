package Lesson_6;

import java.util.Random;
import java.util.Scanner;

public class EntertainingTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Scissors", "Paper"};
        boolean playAgain = true;
        int userScore = 0;
        int compScore = 0;
        while (playAgain) {
            int computerChoices = random.nextInt(3);
            String computerOption = choices[computerChoices];
            System.out.print("Enter your move (Rock, Paper, Scissors). To exit the game, type exit: ");
            String userMove = sc.next();
            if (userMove.equalsIgnoreCase("exit")) {
                System.out.println("Game has ended");
                break;
            }
            if (!userMove.equalsIgnoreCase("Rock") && !userMove.equalsIgnoreCase("Scissors") && !userMove.equalsIgnoreCase("Paper")) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }
            System.out.println("Computer's move: " + computerOption);
            if (computerOption.equalsIgnoreCase(userMove)) {
                System.out.println("Tie!");
                System.out.println("Computer score is: " + compScore + " and your score is: " + userScore);
            } else if (userMove.equalsIgnoreCase("Rock") && computerOption.equalsIgnoreCase("Scissors") || userMove.equalsIgnoreCase("Paper") && computerOption.equalsIgnoreCase("Rock") || userMove.equalsIgnoreCase("Scissors") && computerOption.equalsIgnoreCase("Paper")) {
                userScore++;
                System.out.println("You are won!");
                System.out.println("Computer score is: " + compScore + " and your score is: " + userScore);
            } else {
                compScore++;
                System.out.println("Computer is won!");
                System.out.println("Computer score is: " + compScore + " and your score is: " + userScore);
            }
            if (compScore == 3) {
                System.out.println("Result: COMPUTER WON");
                break;
            } else if (userScore == 3) {
                System.out.println("Result: YOU WON");
                break;
            }
            System.out.println("Do you exit the game: (yes/no)");
            String playAgaInput = sc.next();
            if (playAgaInput.equalsIgnoreCase("yes")) {
                playAgain = false;
                System.out.println("Game has ended!");
            }
        }

    }
}
