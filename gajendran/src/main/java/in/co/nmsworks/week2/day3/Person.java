package in.co.nmsworks.week2.day3;

public class Person {

    private String name;
    PaymentGateway preferredGateway;

    public void setName(String name) {
        this.name = name;
    }

    public void setPreferredGateway(PaymentGateway preferredGateway) {
        this.preferredGateway = preferredGateway;
    }

    public void makePayment(double amount){


        System.out.print(name + " ");
        System.out.println(preferredGateway.processPayment(amount));

    }


}
