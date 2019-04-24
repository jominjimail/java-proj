package pizzashop;

public class Pepperoni extends Topping {
    private PizzaOrTopping decoratedPizza;
    private double cost;
    private int cookingTime;

    public Pepperoni(PizzaOrTopping decoratedPizza){
        super(decoratedPizza.getOrderNum());
        cost = 2.00;
        cookingTime=2500;
        this.decoratedPizza = decoratedPizza;

    }
    @Override
    public double cost(){
        return decoratedPizza.cost()+this.cost;
    }
    @Override
    public String getDescription(){
        return decoratedPizza.getDescription()+"\tPepperoni\n";
    }
    @Override
    public long getCookingTime(){
        return decoratedPizza.getCookingTime()+this.cookingTime;
    }
}
