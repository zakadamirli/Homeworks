package MentorDay21.ONside;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CoffeeOrder> coffeeOrders = new ArrayList<>();
        coffeeOrders.add(new CoffeeOrder(CoffeeSize.LARGE, CoffeeType.ESPRESSO, 12));
        coffeeOrders.add(new CoffeeOrder(CoffeeSize.MEDIUM, CoffeeType.AMERICANO, 5));
        coffeeOrders.add(new CoffeeOrder(CoffeeSize.SMALL, CoffeeType.CAPPUCCINO, 4));
        coffeeOrders.add(new CoffeeOrder(CoffeeSize.LARGE, CoffeeType.LATTE, 6));

        System.out.println("My Orders: \n" + coffeeOrders);
        System.out.println("Total Amount: " + CoffeeOrder.totalPrice);

    }
}
