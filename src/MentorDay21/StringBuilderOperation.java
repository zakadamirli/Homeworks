package MentorDay21;

import java.util.Scanner;

public class StringBuilderOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        String inputText = scanner.nextLine();

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for (char ch : inputText.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Lowercase letters: " + lowercaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special characters: " + specialCharCount);

        StringBuilder alternatingCaseText = new StringBuilder();
        boolean isUppercase = true;

        for (char ch : inputText.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isUppercase) {
                    alternatingCaseText.append(Character.toUpperCase(ch));
                } else {
                    alternatingCaseText.append(Character.toLowerCase(ch));
                }
                isUppercase = !isUppercase;
            } else {
                alternatingCaseText.append(ch);
            }
        }

        String reversedWordsText = reverseWords(alternatingCaseText.toString());

        System.out.println("Final Result:\n" + reversedWordsText);

    }

    public static String reverseWords(String text) {
        String[] words = text.split(" ");
        StringBuilder reversedText = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedText.append(words[i]);
            if (i != 0) {
                reversedText.append(" ");
            }
        }
        return reversedText.toString();
    }
}

