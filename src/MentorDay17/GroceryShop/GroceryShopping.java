package MentorDay17.GroceryShop;

import java.util.ArrayList;
import java.util.List;

public class GroceryShopping {
    private List<Product> shoppingList;

    public GroceryShopping() {
        shoppingList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        shoppingList.add(product);
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Product product : shoppingList) {
            total += product.getCost();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("Receipt:");
        for (Product product : shoppingList) {
            System.out.println(product);
        }
        System.out.println("Total cost: $" + calculateTotalCost());
    }
}

