package in.co.nmsworks.week2.day3;

public class CryptoPayment implements PaymentGateway {

    public CryptoPayment(){

    }

    @Override
    public void payment(double amount) {
        System.out.println("The " + amount + " is paid through Credit Card");
    }

    @Override
    public String toString() {
        return "CryptoPayment";
    }
}
