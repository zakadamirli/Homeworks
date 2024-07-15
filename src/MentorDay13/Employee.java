package MentorDay13;

public class Employee {
    private int employeeId;
    private String name;
    private int salary;
    static int totalEmployees=0;
    static int totalSalary=0;

    public Employee(int employeeId,String name,int salary){
        this.employeeId=employeeId;
        this.name=name;
        this.salary=salary;
        totalEmployees++;
        totalSalary+=salary;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static void setTotalEmployees(int totalEmployees) {
        Employee.totalEmployees = totalEmployees;
    }

    static void totalNumberOfEmployees(){
        System.out.println(getTotalEmployees());
    }

    static void salaryOfAllEmployees(){
        System.out.println();
    }


    public static int getTotalSalary() {
        return totalSalary;
    }
}
