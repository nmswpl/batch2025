package in.co.nmsworks.week2.day3.payment;

public class CryptoPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " rupees paid through Crypto Payment");

    }

    @Override
    public String toString() {
        return "CryptoPayment";
    }
}
