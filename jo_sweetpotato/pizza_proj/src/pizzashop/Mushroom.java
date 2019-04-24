package pizzashop;

public class Mushroom extends Topping {
    private PizzaOrTopping decoratedPizza;
    private double cost;
    private int cookingTime;

    public Mushroom(PizzaOrTopping decoratedPizza){
        super(decoratedPizza.getOrderNum());
        cost = 1.25;
        cookingTime=3000;
        this.decoratedPizza = decoratedPizza;

    }
    @Override
    public double cost(){
        return decoratedPizza.cost()+this.cost;
    }
    @Override
    public String getDescription(){
        return decoratedPizza.getDescription()+"\tMushroom\n";
    }
    @Override
    public long getCookingTime(){
        return decoratedPizza.getCookingTime()+this.cookingTime;
    }
}
