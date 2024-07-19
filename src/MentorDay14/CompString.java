package MentorDay14;

public class CompString {
    public static void main(String[] args) {
        String compressedString = compressString("abc");
        System.out.println("Compressed string: " + compressedString);
    }


    public static String compressString(String str) {
        String compressed = "";
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {  //max length 11
            countConsecutive++;

            if (i + 1 == str.length() /*last character*/ || str.charAt(i) != str.charAt(i + 1)/*Consecutive*/) {
                compressed += str.charAt(i) + String.valueOf(countConsecutive) /*  "" + countConsecutive  */;
                countConsecutive = 0;
            }
        } 
        return compressed.length() < str.length() ? compressed : str;
    }
}






