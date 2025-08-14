package in.co.nmsworks.week2.day3;

public class Person implements PaymentGateway {
    private String name;
    private PaymentGateway preferredGw;


    public void makePayment(double amount, PaymentGateway preferredGw) {
        System.out.println("Amount " + amount + " paid through " + preferredGw.getClass().getSimpleName());
    }

    @Override
    public void processPayment(double amount) {

    }
}
