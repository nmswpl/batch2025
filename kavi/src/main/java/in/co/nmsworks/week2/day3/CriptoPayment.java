package in.co.nmsworks.week2.day3;

public class CriptoPayment implements PaymentGetWay {

    @Override
    public void ProcessPayment(double amount) {

        System.out.println(amount+"amount eceived from CreditcardPayment");
    }
}
