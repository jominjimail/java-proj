package pizzashop;

public class Order implements Observer{
    private int orderNum;
    private boolean collected;
    private Subject pizzaOven;

    public Order(int orderNum, Subject pizzaOven){
        super();
        this.orderNum = orderNum;
        this.pizzaOven = pizzaOven;
        this.collected = false;
    }

    @Override
    public void update(PizzaOrTopping pizza){
        if(pizza.getOrderNum() == this.orderNum){
            this.collected = true;
            // and remove this form the pizzaOven's observers list
        }
    }



}
