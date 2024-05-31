package MentorDay04;

import java.util.Scanner;

public class CovertTask {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to amount to be converted: ");
        double amount = sc.nextDouble();
        System.out.print("Enter the source currency code: ");
        String sourceCurrency = sc.next().toUpperCase();
        System.out.print("Enter the target currency code: ");
        String targetCurrency = sc.next().toUpperCase();
        switch (sourceCurrency) {
            case "USD":
                if (targetCurrency.equals("AZN")) {
                    System.out.println("Converted amount: " + amount * 1.70);
                } else if (targetCurrency.equals("USD")) {
                    System.out.println("Converted amount: " + amount);
                }
                break;
            case "AZN":
                if (targetCurrency.equals("USD")) {
                    System.out.println("Converted amount: " + amount / 1.70);
                } else if (targetCurrency.equals("AZN")) {
                    System.out.println("Converted amount: " + amount);
                }
                break;

            default:
                System.out.println("Error");
        }


    }
}