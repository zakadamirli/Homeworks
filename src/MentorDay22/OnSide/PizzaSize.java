package MentorDay22.OnSide;

public enum PizzaSize {
    SMALL(10),
    MEDIUM(15),
    LARGE(19);
    private int price;

    PizzaSize(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
