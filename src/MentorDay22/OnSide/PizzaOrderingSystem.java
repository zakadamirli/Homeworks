package MentorDay22.OnSide;

public class PizzaOrderingSystem {
    public static void main(String[] args) {
        Order order = new Order();

        order.addPizza(new Pizza(PizzaType.VEGGIE, PizzaSize.LARGE, order.returnTopping()));
        order.addPizza(new Pizza(PizzaType.BBQ_CHICKEN, PizzaSize.MEDIUM, order.returnTopping()));

        System.out.println("All of the ordered pizza: ");
        order.displayOrderedPizza();
        System.out.println("Total price: " + order.totalPriceOrderedPizza());


    }
}
