package MentorDay19;

import java.util.Scanner;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(new Product(1224, "Book", 12.0, 4));
        catalog.addProduct(new Product(1225, "Headphones", 100, 20));
        catalog.addProduct(new Product(1227, "Iphone 14 pro 256 gb", 690, 35));

        Order order = new Order();

        while (true) {
            System.out.println("Enter product ID to add to order (or 0 to finish) : ");
            int productID = sc.nextInt();
            if (productID == 0) break;

            System.out.println("Enter quantity: ");
            int quantity = sc.nextInt();

            try {
                Product product = catalog.getProduct(productID);
                order.addProduct(product, quantity);
            } catch (ProductNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Enter payment amount: ");
        double paymentAmount = sc.nextDouble();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        try {
            order.processOrder(paymentProcessor, paymentAmount);
            System.out.println("Order processed successfully.");
        } catch (InsufficientStockException | PaymentProcessingException exception) {
            System.out.println(exception.getMessage());
        }

        sc.close();
    }
}
