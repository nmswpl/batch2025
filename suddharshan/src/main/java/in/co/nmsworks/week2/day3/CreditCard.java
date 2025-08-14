package in.co.nmsworks.week2.day3;

public class CreditCard implements PaymentGateway{
    @Override
    public void processPayment(double amt) {
        System.out.println("Rs " + amt + " processed through Credit Card");
    }
}
