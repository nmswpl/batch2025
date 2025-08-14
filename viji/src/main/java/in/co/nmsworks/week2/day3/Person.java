package in.co.nmsworks.week2.day3;

public class Person {
    private String name ;
    private PaymentGateway preferredGw ;

    public Person(String name, PaymentGateway preferredGw) {
        this.name = name;
        this.preferredGw = preferredGw;
    }

    public String getName() {
        return name;
    }

    public PaymentGateway getPreferredGw() {
        return preferredGw;
    }

    public void makePayment(Double amount) {
        preferredGw.processPayment(amount);
    }

}
