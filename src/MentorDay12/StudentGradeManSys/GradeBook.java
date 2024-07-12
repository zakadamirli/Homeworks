package MentorDay12.StudentGradeManSys;

import java.util.ArrayList;

public class GradeBook {
    ArrayList<Student> list;

    public GradeBook(){
        list=new ArrayList<>();
    }

    public void add(Student student){
        list.add(student);
    }

    public void rmStudent(String id){
        list.removeIf(x ->x.getStudentId().equals(id));
    }

    public Student findStudent(String id){
        for (Student student:list){
            if (student.getStudentId().equals(id)){
                return student;
            }
        }
        return null;
    }
    public ArrayList<Student> listAllStudents() {
        return list;
    }
    public double calculateClassAverage() {
        double totalSum = 0;
        int totalGrades = 0;
        for (Student student : list) {
            for (double grade : student.getArr()) {
                totalSum += grade;
                totalGrades++;
            }
        }
        return totalGrades == 0 ? 0 : totalSum / totalGrades;
    }

}
