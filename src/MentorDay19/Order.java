package MentorDay19;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products;
    private ArrayList<Integer> quantities;

    public Order() {
        products = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        quantities.add(quantity);
    }

    public void processOrder(PaymentProcessor paymentProcessor, double paymentAmount) throws InsufficientStockException, PaymentProcessingException {
        double totalAmount = 0;
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            int quantity = quantities.get(i);

            product.reduceStock(quantity);
            totalAmount = product.getPrice() * quantity;
        }
        paymentProcessor.processPayment(paymentAmount, totalAmount);
    }

}
