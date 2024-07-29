package MentorDay17.GroceryShop;

public abstract class Product {
    protected String name;
    protected double unitPrice;
    protected double amount;

    public Product(String name, double amount, double unitPrice) {
        this.name = name;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public double getCost() {
        return unitPrice * amount;
    }

    @Override
    public String toString() {
        return name + " : " + amount + " units at $" + unitPrice + " each, total: $" + getCost();
    }

}
