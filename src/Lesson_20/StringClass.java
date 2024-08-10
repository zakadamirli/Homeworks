package Lesson_20;

public class StringClass {
    public static void main(String[] args) {
        String firstPart = "Dear Guest";
        String secondPart = " welcome";
        String sentence = firstPart.concat(secondPart);
        String substring = sentence.substring(11);
        System.out.println("SubString length: " + substring);
        System.out.println("Full Sentence: " + sentence);
        System.out.println("Length of the sentence: " + sentence.length());
    }
}
