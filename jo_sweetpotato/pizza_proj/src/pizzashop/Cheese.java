package pizzashop;

public class Cheese extends Topping {
    private PizzaOrTopping decoratedPizza;
    private double cost;
    private int cookingTime;

    public Cheese(PizzaOrTopping decoratedPizza){
        super(decoratedPizza.getOrderNum());
        cost = 1.00;
        cookingTime=3000;
        this.decoratedPizza = decoratedPizza;

    }
    @Override
    public double cost(){
        return decoratedPizza.cost()+this.cost;
    }
    @Override
    public String getDescription(){
        return decoratedPizza.getDescription()+"\tChess\n";
    }
    @Override
    public long getCookingTime(){
        return decoratedPizza.getCookingTime()+this.cookingTime;
    }
}
