package MentorDay13;

public class StudentMain {
    public static void main(String[] args) {
        Student object=new Student();
        object.addStudent(new Student(112,"Jon",13,99));
        System.out.println(object.listAllStudents());
        object.addStudent(new Student(113,"Doe",13,78));
        System.out.println(object.listAllStudents());
        System.out.println(object.viewStudent(113));
        object.updateStudent(113);
        System.out.println("---------------------");
        System.out.println(object.listAllStudents());
        System.exit(0);
    }
}
