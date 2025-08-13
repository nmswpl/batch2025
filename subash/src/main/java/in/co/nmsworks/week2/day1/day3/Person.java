package in.co.nmsworks.week2.day1.day3;

public class Person {

    private String name;
    private PaymentGateWay preferredGateWay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentGateWay getPreferredGateWay() {
        return preferredGateWay;
    }

    public void setPreferredGateWay(PaymentGateWay preferredGateWay) {
        this.preferredGateWay = preferredGateWay;
    }

    public  void makePayment(double amount)
    {
        System.out.println("Name : "+ name);
        preferredGateWay.processPayment(amount);
    }
}





