package in.co.nmsworks.week2.day3;

public class Person {

    private String name;
    private  PaymentGetWay processPayment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentGetWay getProcessPayment() {
        return processPayment;
    }

    public void setProcessPayment(PaymentGetWay processPayment) {
        this.processPayment = processPayment;
    }

    public void makePayment(double amount)
    {
        processPayment.processPayment(amount);
    }
}
