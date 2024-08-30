package MentorDay26.Custom_Sorting_System;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice Johnson", 85));
        students.add(new Student("Bob Smith", 92));
        students.add(new Student("Charlie Brown", 78));
        students.add(new Student("Diana Green", 88));
        students.add(new Student("Edward White", 88));
        students.add(new Student("Fiona Black", 80));
        students.add(new Student("George King", 90));

        Collections.sort(students);
        System.out.println("Comparable: \n");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, Comparator.comparingInt(Student::getGrade));
        System.out.println("\nComparator with grade: \n");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, new CustomComparator());
        System.out.println("\nSecond comparator: \n");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }

}
