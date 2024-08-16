package MentorDay22.OnSide;

import java.util.Arrays;

public class Pizza {
    private PizzaType pizzaType;
    private PizzaSize pizzaSize;
    private Topping[] topping;

    public Pizza(PizzaType pizzaType, PizzaSize pizzaSize, Topping[] topping) {
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
        this.topping = topping;
    }

    public Topping[] getTopping() {
        return topping;
    }

    public void setTopping(Topping[] topping) {
        this.topping = topping;
    }

    public int calcTotalPrice() {
        return pizzaSize.getPrice() + pizzaType.getPrice();
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaType=" + pizzaType +
                ", pizzaSize=" + pizzaSize +
                ", topping=" + Arrays.toString(topping) +
                '}';
    }
}
