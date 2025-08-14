package in.co.nmsworks.week2.day3.payment;

public class UPIPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " rupees paid through UPI payment");

    }

    @Override
    public String toString() {
        return "UPIPayment";
    }
}
