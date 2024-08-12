package MentorDay21.ONside;

public enum CoffeeType {
    ESPRESSO(3),
    LATTE(4),
    CAPPUCCINO(5),
    AMERICANO(7);
    private final double price;

    CoffeeType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
