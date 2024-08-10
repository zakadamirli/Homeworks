package Lesson_20;

import java.util.Calendar;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder myString = new StringBuilder();
        myString.append("Zeka");
        myString.append(Calendar.getInstance().get(Calendar.YEAR));
        System.out.println(myString);
    }
}
