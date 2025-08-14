package in.co.nmsworks.week2.day3;

public class Person
{
    private String name;
    private PaymentGateway preferredGateway;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentGateway getPreferredGateway() {
        return preferredGateway;
    }

    public void setPreferredGateway(PaymentGateway preferredGateway) {
        this.preferredGateway = preferredGateway;
    }

    public void makePayment(double amount)
    {
        this.preferredGateway.processPayment(amount);
    }
}
