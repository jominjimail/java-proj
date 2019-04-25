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
        System.out.println("in bacon constructor : "+ this.decoratedPizza.description);
        //in bacon constructor : Original Pizza

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

    public String toString(){ return "\tBacon\n";}

}
