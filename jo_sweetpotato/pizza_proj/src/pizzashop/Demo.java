package pizzashop;

public class Demo {
    public static void main(String args[]) {

        OriginalPizza originalPizza = new OriginalPizza(1);
        DeepPanPizza deepPanPizza = new DeepPanPizza(2);
        PizzaOrTopping pizzaOrTopping = new PizzaOrTopping(3) {
            @Override
            public long getCookingTime() {
                return 0;
            }

            @Override
            public double cost() {
                return 0;
            }
        };

//        System.out.println(originalPizza.toString());
//        System.out.println(originalPizza.cost());
//        System.out.println(deepPanPizza.toString());
//        System.out.println(deepPanPizza.cost());
//
//        System.out.println(pizzaOrTopping.toString());
//        System.out.println(pizzaOrTopping.cost());

        OriginalPizza originalPizza1 = new OriginalPizza(4);
        Bacon bacon = new Bacon(originalPizza1);

        PizzaOrTopping pizzaOrTopping1 = bacon;
        System.out.println(pizzaOrTopping1.getDescription());
        System.out.println(pizzaOrTopping1.cost());
        System.out.println(pizzaOrTopping1.getCookingTime());


        DeepPanPizza deepPanPizza1 = new DeepPanPizza(5);
        Bacon bacon1 = new Bacon(deepPanPizza1);
        Pineapple pineapple = new Pineapple(bacon1);

        PizzaOrTopping pizzaOrTopping2 = pineapple;
        System.out.println(pizzaOrTopping2.getDescription());
        System.out.println(pizzaOrTopping2.cost());
        System.out.println(pizzaOrTopping2.getCookingTime());

        OriginalPizza originalPizza2 = new OriginalPizza(6);
        Pepperoni pepperoni = new Pepperoni(originalPizza2);
        Mushroom mushroom = new Mushroom(pepperoni);
        Cheese cheese = new Cheese(mushroom);

        PizzaOrTopping pizzaOrTopping3 = cheese;
        System.out.println(pizzaOrTopping3.getDescription());
        System.out.println(pizzaOrTopping3.cost());
        System.out.println(pizzaOrTopping3.getCookingTime());

        //오리지널 파인2 페페로니2 치즈1

        OriginalPizza originalPizza3 = new OriginalPizza(7);
        Pineapple pineapple1 = new Pineapple(originalPizza3);
        Pineapple pineapple2 = new Pineapple(pineapple1);
        Pepperoni pepperoni1 = new Pepperoni(pineapple2);
        Pepperoni pepperoni2 = new Pepperoni(pepperoni1);
        Cheese cheese1 = new Cheese(pepperoni2);
        SweetPotato sweetPotato = new SweetPotato(cheese1);

        PizzaOrTopping pizzaOrTopping4 = sweetPotato;
        System.out.println(pizzaOrTopping4.getDescription());
        System.out.println(pizzaOrTopping4.cost());
        System.out.println(pizzaOrTopping4.getCookingTime());

    }
}
