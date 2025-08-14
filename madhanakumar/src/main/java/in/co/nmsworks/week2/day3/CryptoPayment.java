package in.co.nmsworks.week2.day3;

public class CryptoPayment implements PaymentGateway{
    double amount;

    public CryptoPayment() {
        this.amount = amount;
    }

    @Override
    public String processPayment(double amount) {
        return amount + " rupees paid through CryptoCurrency" ;
    }
}
