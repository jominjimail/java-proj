package pizzashop;

public class Demo {
    public static void main(String args[]) {



        OriginalPizza originalPizza1 = new OriginalPizza(4);
        System.out.println("1 "+originalPizza1.description);
        //1 Original Pizza
        Bacon bacon = new Bacon(originalPizza1);

        System.out.println("2 "+bacon.getDescription());
        //2 Original Pizza
        //	Bacon
        System.out.println("3 "+bacon.description);
        //3 UnKnown Pizza
        System.out.println("add pepperoni,..");

        Pepperoni pepperoni = new Pepperoni(bacon);

        System.out.println("4 "+pepperoni.getDescription());
        //4 Original Pizza
        //	Bacon
        //	Pepperoni
        System.out.println("5 "+pepperoni.description);
        //5 UnKnown Pizza

        PizzaOrTopping pizzaOrTopping = pepperoni;

        System.out.println("6 final : "+pizzaOrTopping.getDescription());
        //6 final : Original Pizza
        //	Bacon
        //	Pepperoni
        System.out.println("7 final : "+pizzaOrTopping.description);
        //7 final : UnKnown Pizza
        pizzaOrTopping.setDescription(pizzaOrTopping.getDescription());
        System.out.println("8 final : "+pizzaOrTopping.description);
        //8 final : Original Pizza
        //	Bacon
        //	Pepperoni

//
//        DeepPanPizza deepPanPizza1 = new DeepPanPizza(5);
//        Cheese cheese = new Cheese(deepPanPizza1);
//
//        System.out.println("main 1: "+cheese.description);
//        //main 1: UnKnown Pizza
//        System.out.println("main 2: "+cheese.getDescription());
//        //main 2: Deep Pan Pizza
//        //	Cheese
//        System.out.println("main 3: "+cheese.description);
//        //main 3: UnKnown Pizza
//        PizzaOrTopping pizzaOrTopping2 = cheese;
//
//        System.out.println(pizzaOrTopping2.description);
//        //UnKnown Pizza
//


    }
}
