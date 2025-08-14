package in.co.nmsworks.week2.day3;

public class UpiPayment implements PaymentGetWay{

    @Override
    public void ProcessPayment(double amount) {

        System.out.println(amount+"amonut received from creditcard\n");
    }

}
