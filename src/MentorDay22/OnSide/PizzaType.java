package MentorDay22.OnSide;

public enum PizzaType {
    MARGHERITA(2),
    PEPPERONI(3),
    VEGGIE(5),
    BBQ_CHICKEN(7);

    private int price;

    PizzaType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
