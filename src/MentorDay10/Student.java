package MentorDay10;

import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int grade;

    public static void main(String[] args) {
        Student studentObj = new Student();
        System.out.println("Please enter student's name: ");
        studentObj.name = sc.nextLine();
        System.out.println("Please enter student's age: ");
        studentObj.age=sc.nextInt();
        System.out.println("Please enter student's grade: ");
        studentObj.grade = sc.nextInt();

        System.out.println("Student Name: " + studentObj.name);
        System.out.println("Student Age: "+studentObj.age);
        System.out.println("Student Grade: " + studentObj.grade);
        System.out.println();
        if (studentObj.grade > 90 && studentObj.grade < 101){
            System.out.println("A");
        } else if (studentObj.grade > 80 && studentObj.grade < 91 ) {
            System.out.println("B");
        } else if (studentObj.grade > 70 && studentObj.grade < 81) {
            System.out.println("C");
        }
    }
}
