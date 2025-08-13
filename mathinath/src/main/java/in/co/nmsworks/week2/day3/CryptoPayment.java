package in.co.nmsworks.week2.day3;

public class CryptoPayment implements PaymentGateway{

    public CryptoPayment() {
    }

    @Override
    public double makePayment(double amount) {
        System.out.println(amount+" paid through Crypto card payment");
        return amount;
    }
}
