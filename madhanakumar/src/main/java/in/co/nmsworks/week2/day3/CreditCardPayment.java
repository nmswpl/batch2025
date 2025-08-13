package in.co.nmsworks.week2.day3;

public class CreditCardPayment implements PaymentGateway {

    double amount;
    public CreditCardPayment() {
        this.amount = amount;
    }



    @Override
    public String processPayment(double amount) {
        return amount + " rupees paid through CreditCard " ;
    }

}
