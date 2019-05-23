package design.observer.in_hand;

import java.util.ArrayList;

public class ObserverPatternMain {
    public static void main(String[] args) {
        Person arpitPerson = new Person("Arpit");
        Person johnPerson = new Person("John");
        Person jeriPerson = new Person("Jeri");

        Product samsungMobile = new Product("Samsung", "Mobile", "Not available");

        //When you opt for option "Notify me when product is available".Below registerObserver method
        //get executed
        samsungMobile.registerObserver(arpitPerson);
        samsungMobile.registerObserver(johnPerson);
        samsungMobile.registerObserver(jeriPerson);

        samsungMobile.getObservers();
        samsungMobile.removeObserver(arpitPerson);
        samsungMobile.getObservers();
        //Now product is available
        samsungMobile.setAvailability("Available");

    }
}
