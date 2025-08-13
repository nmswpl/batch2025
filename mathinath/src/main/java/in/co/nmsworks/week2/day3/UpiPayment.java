package in.co.nmsworks.week2.day3;

public class UpiPayment implements PaymentGateway{


    public UpiPayment( ) {
    }

    @Override
    public double makePayment(double amount) {
        System.out.println(amount+" paid through Upi card payment");
        return amount;
    }
}
