package in.co.nmsworks.week2.day3;

public class CreditPayment implements PaymentGetWay {
    public CreditPayment() {
    }


    @Override
    public double processPayment(double amount) {
        System.out.println("credit  payment amount resseved" + amount);

        return amount;
    }
}
