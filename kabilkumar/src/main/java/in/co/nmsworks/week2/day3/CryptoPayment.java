package in.co.nmsworks.week2.day3;

public class CryptoPayment implements  PaymentGetWay
{

    @Override
    public double processPayment(double amount) {
        System.out.println("crypto payment is reseved" + amount);
        return amount;
    }
}
