package pizzashop;

public class PizzashopMain {
    public static void main(String[] args) {
        int order_Num=0;

        PizzaOrTopping pizzaOrTopping;
        PizzaOrTopping pizzaOrTopping1;

        OriginalPizza originalPizza = new OriginalPizza(order_Num);
        order_Num++;
        Bacon bacon = new Bacon(originalPizza);

        DeepPanPizza deepPanPizza = new DeepPanPizza(order_Num);
        order_Num++;
        Pineapple pineapple = new Pineapple(deepPanPizza);

        pizzaOrTopping = bacon;
        pizzaOrTopping1 = pineapple;

        System.out.println(pizzaOrTopping.getDescription());
        System.out.println(pizzaOrTopping.getCookingTime());
        System.out.println(pizzaOrTopping.getcost());



        Oven oven = new Oven();
        Order order = new Order(pizzaOrTopping.getOrderNum(), oven);
        Order order1 = new Order(pizzaOrTopping1.getOrderNum(),oven);

        oven.registerObserver(order);
        oven.registerObserver(order1);

        oven.addPizza(pizzaOrTopping);
        oven.addPizza(pizzaOrTopping1);

        oven.getPizzaDes();

    }
}
