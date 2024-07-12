package MentorDay12.StudentGradeManSys;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    static Scanner sc=new Scanner(System.in);
    String studentId;
    String name;
    int []arr;

    public Student(String studentId,String name,int numOfGrades){
        this.studentId=studentId;
        this.name=name;
        this.arr=new int[numOfGrades];
        for (int i = 0; i <numOfGrades; i++) {
            arr[i]=sc.nextInt();
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int calcAverage(){
        int sum=0;
        int count= arr.length;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum/count;
    }

    public int highestGra(){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
