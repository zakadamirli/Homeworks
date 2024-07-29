package MentorDay17.GroceryShop;

public class Main {
    public static void main(String[] args) {
        GroceryShopping shopping = new GroceryShopping();

        shopping.addProduct(new Dairy("Milk", 1.5, 2));
        shopping.addProduct(new FreshProduce("Apples", 0.5, 6));
        shopping.addProduct(new Meat("Chicken Breast", 5.0, 1.5));

        shopping.printReceipt();
    }
}
