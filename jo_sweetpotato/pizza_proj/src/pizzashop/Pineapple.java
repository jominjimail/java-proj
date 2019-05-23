package pizzashop;

public class Pineapple extends Topping {
    private PizzaOrTopping decoratedPizza;
    private double cost;
    private int cookingTime;

    public Pineapple(PizzaOrTopping decoratedPizza) {
        super(decoratedPizza.getOrderNum());
        cost = 2.00;
        cookingTime = 2500;
        this.decoratedPizza = decoratedPizza;

    }

    @Override
    public double getcost() {
        return decoratedPizza.getcost() + this.cost;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + toString();
    }

    @Override
    public long getCookingTime() {
        return decoratedPizza.getCookingTime() + this.cookingTime;
    }

    public String toString() {
        return "\tPineapple\n";
    }
}
