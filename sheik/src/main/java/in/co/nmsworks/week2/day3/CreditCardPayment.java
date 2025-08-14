package in.co.nmsworks.week2.day3;

public class CreditCardPayment implements PaymentGateWay
{

    @Override
    public void processPayment(double amount)
    {
        System.out.println("Rs " + amount + "credited through Credit card");
    }


}
