package pizzashop;

abstract class PizzaOrTopping {
    protected String description;
    private boolean isFinished;
    private int orderNum;

    public PizzaOrTopping(int orderNum){
        this.isFinished = false;
        this.description = "UnKnown Pizza";
        this.orderNum = orderNum;
    }

    public String getDescription(){
        return this.description;
    }

//    public PizzaOrTopping getDescription(){
//        return this;
//    }

    public boolean getIsFinished(){
        return this.isFinished;
    }

    public int getOrderNum(){
        return this.orderNum;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setIsFinished(boolean isFinished){
        this.isFinished = isFinished;
    }


    public abstract long getCookingTime();
    public abstract double cost();
}

