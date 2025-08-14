package in.co.nmsworks.week2.day3;

public class Person {

    private String name;
    private PaymentGateway preferredGW;

    public Person(){

    }

    Person(String name, PaymentGateway preferredGW){
        this.name = name;
        this.preferredGW = preferredGW;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentGateway getPreferredGW() {
        return preferredGW;
    }

    public void setPreferredGW(PaymentGateway preferredGW) {
        this.preferredGW = preferredGW;
    }

    public void makePayment(double amount){
        preferredGW.processPayment(amount);
    }
}
