package pizzashop;

public class PizzashopMain {
    public static void main(String[] args) {
        PizzaShop pizzaShop = PizzaShop.getInstance();
        System.out.println(pizzaShop.getOrderCounter());

        OriginalPizza originalPizza = new OriginalPizza(pizzaShop.getOrderCounter());
        Bacon bacon = new Bacon(originalPizza);

        pizzaShop.placeOrder(bacon);

        System.out.println(pizzaShop.toString());
        

    }
}
