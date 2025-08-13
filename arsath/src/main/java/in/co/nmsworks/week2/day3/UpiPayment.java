package in.co.nmsworks.week2.day3;

public class UpiPayment implements PaymentGateway{


    @Override
    public void processPayment(double amount) {
        System.out.println("Rupees " + amount + " received through UPI Payment");
    }
}
