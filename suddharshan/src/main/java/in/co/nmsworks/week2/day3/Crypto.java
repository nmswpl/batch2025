package in.co.nmsworks.week2.day3;

public class Crypto implements PaymentGateway{


    @Override
    public void processPayment(double amt) {
        System.out.println("Rs " + amt + " processed through Crypto");
    }
}
