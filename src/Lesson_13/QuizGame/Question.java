package Lesson_13.QuizGame;

public class Question {
    private String question;
    private String[] options;
    private char correctAnswer;
    private int points;

    public Question(String question, String[] options, char correctAnswer, int point) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.points = point;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(char correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


}
