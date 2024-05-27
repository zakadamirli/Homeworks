package MentorDay03;

import java.util.Scanner;

public class CalculatorOnSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();
        System.out.print("Enter an arithmetic  operation: (+, -, *, / )");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Result " + (firstNum + secondNum));
                break;
            case '-':
                System.out.println("Result " + (firstNum - secondNum));
                break;
            case '*':
                System.out.println("Result " + (firstNum * secondNum));
                break;
            case '/':
                System.out.println("Result " + (firstNum / secondNum));
                break;
            default:
                System.out.println("Invalid operation");

        }
    }
}
