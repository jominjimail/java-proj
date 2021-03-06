package pizzashop;

public class DeepPanPizza extends PizzaOrTopping {
    private double cost;
    private long cookingTime;

    public DeepPanPizza(int orderNum) {
        super(orderNum);
        super.description = "Deep Pan Pizza\n";
        this.cost = 4.50;
        this.cookingTime = 15000;
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
