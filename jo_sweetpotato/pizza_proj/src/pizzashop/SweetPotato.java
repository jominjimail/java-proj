package pizzashop;

public class SweetPotato extends Topping {
    private PizzaOrTopping decoratedPizza;
    private double cost;
    private int cookingTime;

    public SweetPotato(PizzaOrTopping decoratedPizza){
        super(decoratedPizza.getOrderNum());
        cost = 10.00;
        cookingTime=2500;
        this.decoratedPizza = decoratedPizza;

    }
    @Override
    public double cost(){
        return decoratedPizza.cost()+this.cost;
    }
    @Override
    public String getDescription(){
        return decoratedPizza.getDescription()+"\tSweetPotato\n";
    }
    @Override
    public long getCookingTime(){
        return decoratedPizza.getCookingTime()+this.cookingTime;
    }
}
