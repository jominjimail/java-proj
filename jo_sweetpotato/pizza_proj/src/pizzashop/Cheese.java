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
        System.out.println("Cheese Constr 1: "+decoratedPizza.description);
        //Cheese Constr 1: Deep Pan Pizza
        System.out.println("Chesse Constr 2: "+this.decoratedPizza.description);
        //Chesse Constr 2: Deep Pan Pizza

    }
    @Override
    public double cost(){
        return decoratedPizza.cost()+this.cost;
    }
    @Override
    public String getDescription(){
        decoratedPizza.setDescription(decoratedPizza.description+toString());
        System.out.println("here is problem 2 : "+decoratedPizza.description);
        //here is problem 2 : Deep Pan Pizza
        //	Cheese
        return decoratedPizza.description;
    }
    @Override
    public long getCookingTime(){
        return decoratedPizza.getCookingTime()+this.cookingTime;
    }

    public String toString(){ return "\tCheese\n";}
}
