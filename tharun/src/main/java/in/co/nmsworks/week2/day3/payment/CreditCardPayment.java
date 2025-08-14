package in.co.nmsworks.week2.day3.payment;

public class CreditCardPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " rupees paid through Credit card");
    }

    @Override
    public String toString() {
        return "CreditCardPayment";
    }
}
