package MentorDay21.ONside;

public class CoffeeOrder {
    CoffeeSize coffeeSize;
    CoffeeType coffeeType;
    int price;
    static int totalPrice;

    public CoffeeOrder(CoffeeSize coffeeSize, CoffeeType coffeeType, int price) {
        this.coffeeSize = coffeeSize;
        this.coffeeType = coffeeType;
        this.price = price;
        totalPrice += this.price;
    }

    @Override
    public String toString() {
        return "CoffeeOrder{" +
                "coffeeSize=" + coffeeSize +
                ", coffeeType=" + coffeeType +
                ", price=" + price +
                '}';
    }
}
