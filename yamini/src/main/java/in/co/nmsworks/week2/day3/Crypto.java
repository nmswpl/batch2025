package in.co.nmsworks.week2.day3;

public class Crypto implements PaymentGateWay{
    @Override
    public void processPayment(double amount) {
        System.out.println("Amount of rupees "+amount+" paid through Crypto Payment");
    }
}
