package MentorDay21.ONside;

public enum CoffeeSize {
    SMALL(1),
    MEDIUM(1.2),
    LARGE(1.5);

    CoffeeSize(double value) {
        this.price = value;
    }

    private final double price;

    public double getPrice() {
        return price;
    }
}
