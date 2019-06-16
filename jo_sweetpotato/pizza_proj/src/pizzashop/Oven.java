package pizzashop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Oven implements Subject {
    private PizzaOrTopping finishedPizza;
    private ArrayList<PizzaOrTopping> pizzas;
    private ArrayList<Observer> observers;

    public Oven(){
        super();
        ArrayList<PizzaOrTopping> pizzaOrToppings = new ArrayList<>();
        ArrayList<Observer> observers = new ArrayList<>();
        this.pizzas = pizzaOrToppings;
        this.observers = observers;
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        System.out.println("call removeObserver");
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(){
        System.out.println(observers.size());
        for(Observer observer : observers){

            observer.update(finishedPizza);
        }
    }

    @Override
    public int countObserver() {
        return observers.size();
    }

    public String getPizzaDes(){
        String str = "";
        for(PizzaOrTopping pizza : pizzas){
            str = str+pizza.getDescription();
        }
        return str;
    }

    public void removePizza(PizzaOrTopping pizza){

        pizzas.remove(pizza);
    }

    public void addPizza(PizzaOrTopping pizza){
        System.out.println("Main thread: " + Thread.currentThread());
        pizzas.add(pizza);
        System.out.println(getPizzaDes()); 
        Timer pizzaTimer = new Timer();
        final long start = System.currentTimeMillis();
        pizzaTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.print("Task invoked: " +
                        (System.currentTimeMillis() - start) + " ms");
                System.out.println(" - " + Thread.currentThread());
                pizza.setFinished();

                finishedPizza = pizza;

                removePizza(pizza);


                notifyObserver();

          
            }
        },pizza.getCookingTime());

    }
}
