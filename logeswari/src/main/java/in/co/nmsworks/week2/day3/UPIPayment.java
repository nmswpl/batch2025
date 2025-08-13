package in.co.nmsworks.week2.day3;

public class UPIPayment implements PaymentGateWay{
    @Override
    public double processPayment(double amount) {
        return amount;
    }

    public UPIPayment() {
    }
}
