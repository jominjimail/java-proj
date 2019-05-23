package pizzashop;

public class OriginalPizza extends PizzaOrTopping {
    private double cost;
    private long cookingTime;

    public OriginalPizza(int orderNum) {
        super(orderNum);
        super.setDescription("Original Pizza\n");
        this.cost = 3.75;
        this.cookingTime = 10000;
    }

    @Override
    public long getCookingTime() {
        return this.cookingTime;
    }

    @Override
    public double getcost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCookingTime(long cookingTime) {
        this.cookingTime = cookingTime;
    }
}
