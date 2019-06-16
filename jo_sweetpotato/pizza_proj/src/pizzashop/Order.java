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
    public void update(PizzaOrTopping finishedPizza){
        System.out.println(finishedPizza.getDescription());
        if(finishedPizza.getOrderNum() == this.orderNum){
            System.out.println("here");
            this.collected = true;
            // and remove this form the pizzaOven's observers list
            System.out.println("in update before "+pizzaOven.countObserver());
            pizzaOven.removeObserver(this);

            System.out.println("in update after "+pizzaOven.countObserver());

        }
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
}
