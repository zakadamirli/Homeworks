package MentorDay13;

import java.util.ArrayList;
public class Student {

    private int studentId;
    private String name;
    private int age;
    private int grade;
    ArrayList<Student> students;
    public Student(){
            students=new ArrayList<>();
    }

    public Student( int studentId, String name, int age, int grade) {
        this.studentId = studentId;
        this.name = name;
        setAge(age);
        setGrade(grade);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>12&&age<25){
            this.age=age;
        }else {
            throw new IllegalArgumentException("Age must be between 12 and 25.");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade>0&&grade<101){
            this.grade=grade;
        }else {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
    }

    public ArrayList<Student> listAllStudents() {
        return students;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public Student viewStudent(int id){
        for (Student student:students){
            if(id==student.getStudentId()){
                return student;
            }
        }
        return null;
    }
    public void updateStudent(int id){
        for (Student student:students){
            if(id==student.getStudentId()){
                student.setAge(13);
                student.setName("San");
                student.setGrade(90);

            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
