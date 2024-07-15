package MentorDay13;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee=new Employee(121,"Jon",400);
        Employee employee1=new Employee(122,"Doe",1200);
        Employee employee2=new Employee(123,"Sara",2500);




        int totalSalary = Employee.totalSalary;
        int totalEmployees=Employee.totalEmployees;

        System.out.println("Total salary: "+totalSalary);
        System.out.println("Total employees: "+totalEmployees);


    }
}
