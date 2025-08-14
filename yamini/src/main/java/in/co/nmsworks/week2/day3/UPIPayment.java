package in.co.nmsworks.week2.day3;

public class UPIPayment implements PaymentGateWay{
    @Override
    public void processPayment(double amount) {
        System.out.println("Amount of rupees "+amount+" paid through UPI Payment");
    }
}
