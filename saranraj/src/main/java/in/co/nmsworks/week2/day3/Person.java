package in.co.nmsworks.week2.day3;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private PaymentGateway preferedGateway;

    public PaymentGateway getPreferedGateway() {
        return preferedGateway;
    }

    public void setPreferedGateway(PaymentGateway preferedGateway) {
        this.preferedGateway = preferedGateway;
    }

    public void makePayment(double amount){
        System.out.print(this.name +" ");
        preferedGateway.processPayment(amount);
    }

}
