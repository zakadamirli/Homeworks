package MentorDay22.OnSide;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private final ArrayList<Pizza> orders = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addPizza(Pizza pizza) {
        orders.add(pizza);
    }

    public int totalPriceOrderedPizza() {
        return orders.stream()
                .mapToInt(Pizza::calcTotalPrice)
                .sum();
    }

    public void displayOrderedPizza() {
        orders.forEach(System.out::println);
    }

    public Topping[] returnTopping() {
        System.out.print("How many toppings would you like to add? ");
        int numToppings = validatePositiveInteger();
        Topping[] toppings = new Topping[numToppings];

        for (int i = 0; i < numToppings; i++) {
            System.out.println("Choose topping: \n1. CHEESE\n2. TOMATO\n3. OLIVES\n4. MUSHROOMS");
            int option = validateOption();
            toppings[i] = Topping.values()[option - 1];
        }
        return toppings;
    }

    private int validatePositiveInteger() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.next(); // Clear invalid input
        }
        int value = scanner.nextInt();
        while (value <= 0) {
            System.out.println("Number must be positive. Please enter a positive integer.");
            value = scanner.nextInt();
        }
        return value;
    }

    private int validateOption() {
        int option;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please choose a valid option.");
                scanner.next(); // Clear invalid input
            }
            option = scanner.nextInt();
        } while (option < 1 || option > 4);
        return option;
    }
}
