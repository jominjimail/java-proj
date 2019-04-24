package pizzashop;

public class Bacon extends Topping {
    private PizzaOrTopping decoratedPizza;
    private double cost;
    private int cookingTime;

    public Bacon(PizzaOrTopping decoratedPizza){
        super(decoratedPizza.getOrderNum());
        cost = 0.75;
        cookingTime=2000;
        this.decoratedPizza = decoratedPizza;

    }
    @Override
    public double cost(){
        return decoratedPizza.cost()+this.cost;
    }
    @Override
    public String getDescription(){
        return decoratedPizza.getDescription()+"\tBacon\n";
    }
    @Override
    public long getCookingTime(){
        return decoratedPizza.getCookingTime()+this.cookingTime;
    }

}
