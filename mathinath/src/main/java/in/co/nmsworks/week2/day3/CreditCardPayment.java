package in.co.nmsworks.week2.day3;

public class CreditCardPayment implements PaymentGateway{

    public CreditCardPayment() {
    }

    @Override
    public double makePayment(double amount) {
        System.out.println(amount+" paid through credit card payment");
        return amount;
    }

}
