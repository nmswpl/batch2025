package in.co.nmsworks.week2.day3;

public class CryptoPayment implements PaymentGateway{
    private int amount;
    @Override
    public void processPayment(Double amount) {
        System.out.println("Amount "+" "+ amount +" "+ "paid through Crypto Card");

    }
}
