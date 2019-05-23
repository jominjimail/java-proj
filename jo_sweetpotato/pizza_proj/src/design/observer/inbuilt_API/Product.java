package design.observer.inbuilt_API;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Product extends Observable {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String productName;
    private String productType;
    String availability;


    public Product(String productName, String productType, String availability) {
        super();
        this.productName = productName;
        this.productType = productType;
        this.availability = availability;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getAvailability() {
        return availability;
    }

    // 갱신할 새로운 데이터 여부의 플래그 값을 변경하고(setChanged())
    // 옵저버들에게 새로운 데이터를 전달한다. (notifyObservers())
    public void setAvailability(String availability) {
        if (!(this.availability.equalsIgnoreCase(availability))) {
            this.availability = availability;
            setChanged();
            notifyObservers(this, availability);
        }
    }

    public void notifyObservers(Observable observable, String availability) {
        System.out.println("Notifying to all the subscribers when product became available");
        for (Observer ob : observers) {
            ob.update(observable, this.availability);
        }

    }

    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }
}
