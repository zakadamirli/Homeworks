package Lesson_24;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 90);
        studentGrades.put("Charlie", 78);
        studentGrades.put("David", 92);
        studentGrades.put("Eve", 88);

        String studentName = "Bob";
        if (studentGrades.containsKey(studentName)) {
            System.out.println(studentName + "'s grade: " + studentGrades.get(studentName));
        } else {
            System.out.println(studentName + " not found in the list");
        }
        studentGrades.remove("Charlie");

        System.out.println("\nList of students and their grades after removal:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }
}

