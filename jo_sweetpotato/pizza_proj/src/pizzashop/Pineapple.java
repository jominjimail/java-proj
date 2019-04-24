package pizzashop;

public class Pineapple extends Topping{
    private PizzaOrTopping decoratedPizza;
    private double cost;
    private int cookingTime;

    public Pineapple(PizzaOrTopping decoratedPizza){
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
        return decoratedPizza.getDescription()+"\tPineapple\n";
    }
    @Override
    public long getCookingTime(){
        return decoratedPizza.getCookingTime()+this.cookingTime;
    }
}
