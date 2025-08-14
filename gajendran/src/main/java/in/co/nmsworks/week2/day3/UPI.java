package in.co.nmsworks.week2.day3;

public class UPI implements PaymentGateway{

    @Override
    public String processPayment(double amount) {
        return "received Amount "+amount+ " Through "+getClass().getSimpleName();
    }
}
