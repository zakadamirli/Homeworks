package Lesson_1;

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int number1;
            int number2;
        System.out.println("Enter number1: ");
        number1=sc.nextInt();
        System.out.println("Enter number2: ");
        number2=sc.nextInt();
        //a. Add number1 and number2 and store the result in a variable.
            int add=number1+number2;
        System.out.println("Result add: "+add);

        //b. Subtract number2 from number1 and store the result in another variable.
            int subtract=number1-number2;
        System.out.println("Result Subtract: "+subtract);

        //c. Multiply number1 and number2 and store the result.
            int multiply=number1*number2;
        System.out.println("Result Multiply: "+multiply);

        //d. Divide number1 by number2 and store the result.
            double divide=(double) number1/number2;
        System.out.println("Result divide: "+divide);
    }
}