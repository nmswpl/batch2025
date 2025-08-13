package in.co.nmsworks.week2.day3;

public class UpiPayment implements PaymentGateWay
{

    @Override
    public void processPayment(double amount) {
        System.out.println("Rs " + amount + "credited through Upi Payment card");

    }

}
