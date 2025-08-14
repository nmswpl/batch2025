package in.co.nmsworks.week2.day3;

public class UPIPayment implements PaymentGetWay
{
    public UPIPayment(){

    }

    @Override
    public double processPayment(double amount) {
        System.out.println("UPI payment is reseved" + amount);
        return amount;
    }
}
