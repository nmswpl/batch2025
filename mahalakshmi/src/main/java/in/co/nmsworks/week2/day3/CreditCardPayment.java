package in.co.nmsworks.week2.day3;

public class CreditCardPayment implements PaymentGateway {


    @Override
    public void processPayment(double amount) {
        System.out.println("RS " + amount + " received from Credit Card");
    }


}
