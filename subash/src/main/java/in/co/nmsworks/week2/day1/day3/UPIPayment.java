package in.co.nmsworks.week2.day1.day3;

public class UPIPayment implements PaymentGateWay{


    @Override
    public void processPayment(double amount) {
        System.out.println("Received : " +amount+" through UPI");
    }
}

