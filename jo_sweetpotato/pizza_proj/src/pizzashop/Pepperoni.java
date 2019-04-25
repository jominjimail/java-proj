package pizzashop;

public class Pepperoni extends Topping {
    private PizzaOrTopping decoratedPizza;
    private double cost;
    private int cookingTime;

    public Pepperoni(PizzaOrTopping decoratedPizza){
        super(decoratedPizza.getOrderNum());
        cost = 1.00;
        cookingTime=3500;
        this.decoratedPizza = decoratedPizza;

    }
    @Override
    public double cost(){
        return decoratedPizza.cost()+this.cost;
    }
    @Override
    public String getDescription(){
        return decoratedPizza.getDescription()+toString();
    }
    @Override
    public long getCookingTime(){
        return decoratedPizza.getCookingTime()+this.cookingTime;
    }

    public String toString(){ return "\tPepperoni\n";}
}
