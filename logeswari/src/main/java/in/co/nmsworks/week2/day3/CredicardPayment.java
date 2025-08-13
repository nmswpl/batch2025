package in.co.nmsworks.week2.day3;

public class CredicardPayment implements PaymentGateWay{
    @Override
    public double processPayment(double amount) {
        return 2000;
    }

    public CredicardPayment() {
    }
}
