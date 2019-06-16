package pizzashop;

abstract class PizzaOrTopping {
    protected String description;
    private boolean isFinished;
    private int orderNum;

    public PizzaOrTopping(int orderNum) {
        this.isFinished = false;
        this.description = "UnKnown Pizza";
        this.orderNum = orderNum;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getIsFinished() {
        return this.isFinished;
    }

    public int getOrderNum() {
        return this.orderNum;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public abstract long getCookingTime();

    public abstract double getcost();

    public void setFinished() {
        this.isFinished = true;
    }
}

