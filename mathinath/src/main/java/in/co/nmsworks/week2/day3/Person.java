package in.co.nmsworks.week2.day3;

public class Person {
    private String name;
    private PaymentGateway preferredGateway;
    private double amount;

    public Person(String name, PaymentGateway preferredGateway) {
        this.name = name;
        this.preferredGateway = preferredGateway;
    }



    public void makePayment(double amount)
    {
        System.out.println(preferredGateway.makePayment(amount));
    }
}
