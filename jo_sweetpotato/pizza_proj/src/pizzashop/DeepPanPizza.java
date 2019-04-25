package pizzashop;

public class DeepPanPizza extends PizzaOrTopping {
    private double cost;
    private long cookingTime;

    public DeepPanPizza(int orderNum){
        super(orderNum);
        super.description="Deep Pan Pizza\n";
        this.cost = 4.50;
        this.cookingTime = 15000;
    }
    @Override
    public long getCookingTime(){
        return this.cookingTime;
    }
    @Override
    public double cost(){
        return this.cost;
    }
}
