package MentorDay19;

public class Product {
    private int product_ID;
    private String name;
    private double price;
    private int stock_Quantity;

    public Product(int product_ID, String name, double price, int stock_Quantity) {
        this.product_ID = product_ID;
        this.name = name;
        this.price = price;
        this.stock_Quantity = stock_Quantity;
    }

    public int getProduct_ID() {
        return product_ID;
    }

    public void setProduct_ID(int product_ID) {
        this.product_ID = product_ID;
    }

    public int getStock_Quantity() {
        return stock_Quantity;
    }

    public void setStock_Quantity(int stock_Quantity) {
        this.stock_Quantity = stock_Quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void reduceStock(int quantity) throws InsufficientStockException {
        if (quantity > stock_Quantity) {
            throw new InsufficientStockException("Insufficient stock for product: " + name);
        }
        this.stock_Quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_ID='" + product_ID + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock_Quantity=" + stock_Quantity +
                '}';
    }
}