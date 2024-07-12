package MentorDay12.StudentGradeManSys;

import java.util.Arrays;

public class GradeBookApp {
    public static void main(String[] args) {
        GradeBook gradeBook=new GradeBook();
        System.out.println("Enter 1 student");
        gradeBook.add(new Student("111","Eli",2));
        System.out.println("Enter 2 student");
        gradeBook.add(new Student("112","Veli",3));
        System.out.println("Enter 3 student");
        gradeBook.add(new Student("113","Ali",1));
        System.out.println("Enter 4 student");
        gradeBook.add(new Student("114","Selim",2));
        System.out.println("Enter 5 student");
        gradeBook.add(new Student("115","John",3));
        System.out.println("Enter 6 student");
        gradeBook.add(new Student("116","Doe",4));
        System.out.println(gradeBook.listAllStudents());
        gradeBook.rmStudent("111");
        System.out.println(gradeBook.listAllStudents());
        System.out.println(Arrays.toString(gradeBook.findStudent("112").arr));
        System.out.println("Calculate class average: "+gradeBook.calculateClassAverage());
    }
}
