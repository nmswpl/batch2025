package in.co.nmsworks.week2.day3;

public class CriptoPament implements PaymentGateWay{
    @Override
    public double processPayment(double amount) {
        return 8000;
    }

    public CriptoPament() {
    }
}
