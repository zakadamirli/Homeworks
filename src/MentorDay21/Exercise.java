package MentorDay21;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();
        System.out.println("Enter the sentence: ");
        String t = sc.nextLine();
        //Tamerlan Kamal
        sentence.append(t);
        System.out.println(sentence);

        String textReverse = reversedWords(sentence.toString());
        System.out.println(textReverse);

        System.out.println(sentence);

        //replace 'a' with 'e'
        StringBuilder modifiedString = new StringBuilder(textReverse);
        for (int i = 0; i < textReverse.length(); i++) {
            if (modifiedString.charAt(i) == 'a') {
                modifiedString.setCharAt(i, 'e');
            }
        }
        System.out.println("Replace 'a' with 'e' " + modifiedString);


        StringBuilder result = new StringBuilder(sentence);
        result.append("\n").append(modifiedString);

        System.out.println("Modified Sentence:\n" + result);
    }

    public static String reversedWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i > -1; i--) {
            reversedString.append(words[i]);
            reversedString.append(" ");
        }
        return reversedString.toString();
    }

}