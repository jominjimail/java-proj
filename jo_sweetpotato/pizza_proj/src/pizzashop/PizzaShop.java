package pizzashop;

import java.util.ArrayList;

public class PizzaShop {
    private static PizzaShop singlePizzaShop = new PizzaShop();
    private int orderCounter;
    private ArrayList<Order> orders;
    private Oven pizzaOven;

    private PizzaShop(){
        ArrayList<Order> orders = new ArrayList<>();
        this.orders = orders;
        Oven oven = new Oven();
        this.pizzaOven = oven;
        this.orderCounter = 1;
    }

    public void placeOrder(PizzaOrTopping pizza){
        Order order = new Order(pizza.getOrderNum(), pizzaOven);
        orderCounter++;
        orders.add(order);
        pizzaOven.registerObserver(order);
        pizzaOven.addPizza(pizza);
    }

    public int getOrderCounter() {
        return orderCounter;
    }

    public void setOrderCounter(int orderCounter) {
        this.orderCounter = orderCounter;
    }

    public Oven getPizzaOven() {
        return pizzaOven;
    }

    public void setPizzaOven(Oven pizzaOven) {
        this.pizzaOven = pizzaOven;
    }

    public static PizzaShop getInstance(){
        return singlePizzaShop;
    }

    public String toString(){
        return pizzaOven.getPizzaDes();
    }


}
