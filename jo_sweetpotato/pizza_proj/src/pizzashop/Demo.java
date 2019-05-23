package pizzashop;

import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean start_flag = true;
        boolean topping_flag = true;
        int order_NUM = 1;

        while (start_flag) {
            System.out.println("*****Pizza management system*****");
            System.out.println("(1) Order a Pizza");
            System.out.println("(2) View Pizza");
            System.out.println("(3) Exit Program");

            int first_choose = scanner.nextInt();
            int topping_choose;
            // Order a Pizza
            if (first_choose == 1) {
                System.out.println("*****Pizza dou list*****");
                System.out.println("(1) Original Pizza dou");
                System.out.println("(2) DeepPan Pizza dou");
                System.out.println("(3) Cancel Order");

                int dou_choose = scanner.nextInt();

                // topping while
                if (dou_choose == 1 || dou_choose == 2) {
                    PizzaOrTopping dou;

                    while (topping_flag) {
                        System.out.println("*****Pizza topping list*****");
                        System.out.println("(1) Pepperoni");
                        System.out.println("(2) Bacon");
                        System.out.println("(3) Pineapple");
                        System.out.println("(6) Confirm Order");
                        System.out.println("(7) Concel Order");
                        topping_choose = scanner.nextInt();

                        if(topping_choose == 7){
                            topping_flag = false;
                        }

                        if (dou_choose == 1) {
                            OriginalPizza originalPizza = new OriginalPizza(order_NUM);
                            dou = originalPizza;

                        } else {
                            DeepPanPizza deepPanPizza = new DeepPanPizza(order_NUM);
                            dou = deepPanPizza;
                        }

                        if(topping_choose != 6){

                        }



                        // Cancel Order
                    }//while

                }else {
                    System.out.println("cancel the order ...");
                }

            }
            // View Pizza
            else if (first_choose == 2) {


            }
            //Exit Program
            else {
                System.out.println("see you");
                start_flag = false;
            }

        }

    }


}
