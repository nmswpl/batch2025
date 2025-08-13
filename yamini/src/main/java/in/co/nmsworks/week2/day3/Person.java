package in.co.nmsworks.week2.day3;

public class Person {
    private String name;
    private PaymentGateWay preferredGW;

    public Person(){}

    public Person(String name,PaymentGateWay preferredGW){
        this.name=name;
        this.preferredGW = preferredGW;

    }


   public PaymentGateWay getPreferredGW() {
        return preferredGW;
    }

    public void setPreferredGW(PaymentGateWay preferredGW) {
        this.preferredGW = preferredGW;
    }

    public void makePayment(double amount){
        getPreferredGW().processPayment(amount);

    }
}
