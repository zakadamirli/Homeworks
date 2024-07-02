package Lesson_9;

import java.util.Scanner;

public class QuizGame {
    private final Scanner scanner;
    private int score;

    public QuizGame() {
        score = 0;
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        QuizGame quiz = new QuizGame();
        quiz.startQuiz();

        String[] question1Options = {"H2O", "CO2", "O2"};
        quiz.askQuestion("What is the chemical symbol for water?", question1Options, 'A');

        String[] question2Options = {"7", "8", "9"};
        quiz.askQuestion("How many planets are in our solar system?", question2Options, 'B');

        String[] question3Options = {"Berlin", "Madrid", "Paris"};
        quiz.askQuestion("What is the capital of France?", question3Options, 'C');

        quiz.endQuiz();
    }

    public void startQuiz() {
        System.out.println("Welcome to the Science Quiz!");
    }

    public void askQuestion(String question, String[] options, char correctAnswer) {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((char) ('A' + i) + ") " + options[i]);
        }
        System.out.print("Your Answer: ");
        char answer = scanner.next().toUpperCase().charAt(0);
        evaluateAnswer(answer, correctAnswer);
    }

    public void evaluateAnswer(char answer, char correctAnswer) {
        if (answer == correctAnswer) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer was " + correctAnswer);
        }
    }

    public void endQuiz() {
        System.out.println("Quiz Over!");
        System.out.println("Your final score is: " + score + " out of 3");
    }


}