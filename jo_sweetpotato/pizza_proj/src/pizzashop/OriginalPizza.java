package pizzashop;

public class OriginalPizza extends PizzaOrTopping {
    private double cost;
    private long cookingTime;

    public OriginalPizza(int orderNum){
        super(orderNum);
        super.setDescription("Original Pizza\n");
        this.cost = 3.75;
        this.cookingTime = 10000;
    }

    public long getCookingTime(){
        return this.cookingTime;
    }

    public double cost(){
        return this.cost;
    }

}