package design.observer.in_hand;

public class Person implements Observer {
    String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void update(String availabiliy) {

        System.out.println("Hello "+personName+", Product is now "+availabiliy+" on flipkart");
    }
}
