package MentorDay25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {
        String paragraph = "The quick brown fox jumped over the lazy dog, but the lazy dog didn't " +
                "notice because the lazy dog was too busy sleeping";
        String cleanedParagraph = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        System.out.println(cleanedParagraph);

        String[] words = cleanedParagraph.split("\\s+");

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        System.out.println("Unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
