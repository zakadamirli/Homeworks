package MentorDay13;

public class String_Manipulating {
    public static void main(String[] args) {
        String string="Backend Development";

        String withoutSpace=string.replace(" ","");
        int length =withoutSpace.length();
        System.out.println("Length excluding whitespaces: "+length);

        String uppercase=string.toUpperCase();
        System.out.println("Uppercase: "+uppercase);

        String lowercase=string.toLowerCase();
        System.out.println("Lowercase: "+lowercase);

        boolean startWith=string.startsWith("A");
        System.out.println("Start with 'A' : "+startWith);

        boolean endWith=string.endsWith("Z");
        System.out.println("End with 'Z' : "+endWith);

        String replaceE=string.replace('e','E');
        System.out.println("Replace all occurrences of the letter 'e' : "+replaceE);

        String[] arrSplit=string.split(" ");
        for (String s: arrSplit){
            System.out.print(s+" | ");
        }

        System.out.println();

        int findIndex=string.indexOf('e');
        System.out.println("Index of e: "+findIndex);

        String substring=string.substring(4,10);
        System.out.println("Substring: "+substring);

        String trim=string.trim();
        System.out.println("Trim: "+trim);
    }
}
