package MentorDay35;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryManager {

    private final Map<String, Double> employeeSalaries;

    public EmployeeSalaryManager(Map<String, Double> employeeSalaries) {
        this.employeeSalaries = employeeSalaries;
    }

    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();
        salaries.put("Malik", 80000.0);
        salaries.put("Samir", 93000.0);
        salaries.put("Kamal", 110000.0);
        salaries.put("David", 45000.0);
        salaries.put("Ali", 90000.0);

        EmployeeSalaryManager manager = new EmployeeSalaryManager(salaries);

        System.out.println("Employees earning above 50000: " + manager.findEmployeesEarningAbove(50000));
        System.out.println("Salaries increased by 10%: " + manager.increaseSalariesByPercentage(10));
        System.out.println("Employee with highest salary: " + manager.findEmployeeWithHighestSalary());
        System.out.println("Average salary: " + manager.calculateAverageSalary());
        System.out.println("Employees sorted by salary: " + manager.sortEmployeesBySalaryDescending());
        System.out.println("Employees whose name starts with 'A': " + manager.filterEmployeesByStartingLetter('A'));
    }

    public List<String> findEmployeesEarningAbove(double threshold) {
        return employeeSalaries.entrySet().stream()
                .filter(entry -> entry.getValue() > threshold)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public Map<String, Double> increaseSalariesByPercentage(double percentage) {
        return employeeSalaries.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue() * (1 + percentage / 100)
                ));
    }

    public String findEmployeeWithHighestSalary() {
        return employeeSalaries.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public double calculateAverageSalary() {
        return employeeSalaries.values().stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    public List<String> sortEmployeesBySalaryDescending() {
        return employeeSalaries.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public List<String> filterEmployeesByStartingLetter(char letter) {
        return employeeSalaries.keySet().stream()
                .filter(name -> name.startsWith(String.valueOf(letter)))
                .collect(Collectors.toList());
    }
}