package in.co.nmsworks.week2.day3;

public class UPI implements PaymentGateway{


    @Override
    public void processPayment(double amt) {
        System.out.println("Rs " + amt + " processed through UPI");
    }
}
