package in.co.nmsworks.week2.day3.payment;

public class Person {
    private String name;
    private PaymentGateway preferedGW;

    public Person() {
    }

    public Person(String name, PaymentGateway preferedGW) {
        this.name = name;
        this.preferedGW = preferedGW;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentGateway getPreferedGW() {
        return preferedGW;
    }

    public void setPreferedGW(PaymentGateway preferedGW) {
        this.preferedGW = preferedGW;
    }

    public void makePayment(double amount){
        System.out.println("Name : "+this.name + " --- Amount: " + amount + " --- Preferred Gateway : "+preferedGW);
    }
}
