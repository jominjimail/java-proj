package pizzashop;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(){
        for(Observer observer : observers){
            observer.update(finishedPizza);
        }
    }

    public void getPizzaDes(){
        for(PizzaOrTopping pizza : pizzas){
            System.out.println(pizza.getDescription());
        }
    }

    public void removePizza(PizzaOrTopping pizza){
        pizzas.remove(pizza);
    }

    public void addPizza(PizzaOrTopping pizza){
        pizzas.add(pizza);
    }
}
