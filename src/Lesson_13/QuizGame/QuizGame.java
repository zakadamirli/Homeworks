package Lesson_13.QuizGame;

import java.util.Scanner;

public class QuizGame {
    private Question[] questions;
    private int score;
    private Scanner scanner;

    public QuizGame() { //constructor for start initialize questions
        scanner = new Scanner(System.in);
        initializeQuestions();
    }

    public static void main(String[] args) {
        QuizGame quizGame = new QuizGame();
        quizGame.start();
    }

    private void initializeQuestions() {
        questions = new Question[]{
                new Question("Which data type is used for whole numbers in Java?", new String[]{"double", "B) int", "C) boolean", "D) char"}, 'B', 1),
                new Question("Which keyword is used to create a new object?", new String[]{"A) class", "B) new", "C) this", "D) super"}, 'B', 1),
                new Question("Which method is the entry point of a Java application?", new String[]{"A) start()", "B) init()", "C) main()", "D) run()"}, 'C', 2),
                new Question("Which concept allows one class to inherit from another?", new String[]{"A) Polymorphism", "B) Abstraction", "C) Inheritance", "D) Encapsulation"}, 'C', 2),
                new Question("What is reflection used for in Java?",
                        new String[]{"A) Reading and writing files",
                                "B) Dynamically obtaining the classes and methods of objects at run-time",
                                "C) Establishing network connections",
                                "D) Creating GUI"}, 'B', 3)
        };
    }

    public void start() {
        System.out.println("Welcome the Quiz Game");

        for (Question question : questions) {
            askQuestion(question);
        }
        System.out.println("Game over! Your total score: " + score);
    }

    public void askQuestion(Question question) {
        System.out.println(question.getQuestion());
        String[] options = question.getOptions();
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Enter your answer (A, B, C, D) or skip  N: ");
        char answer = scanner.next().toUpperCase().charAt(0);

        if (answer == 'N') {
            System.out.println("the question was passed");
            return;
        }
        if (answer == question.getCorrectAnswer()) {
            System.out.println("Correct Answer!");
            score += question.getPoints();
        } else {
            System.out.println("Answer is wrong: Correct answer is  " + question.getCorrectAnswer());
        }
    }


}
