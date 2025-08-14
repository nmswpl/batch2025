package in.co.nmsworks.week2.day3;

public class UpiPayment implements PaymentGateway
{
    @Override
    public void processPayment(double amount)
    {
        System.out.println("Amount " + amount + " paid through " + toString());
    }

    @Override
    public String toString() {
        return "UpiPayment";
    }

    double amount;

    public static void main(String[] args)
    {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(500);

        UpiPayment upiPayment = new UpiPayment();
        upiPayment.processPayment(100);

        CryptoPayment cryptoPayment = new CryptoPayment();
        cryptoPayment.processPayment(10000);

        Person p1 = new Person();
        p1.setName("Ravi");
        p1.setPreferredGateway(new CreditCardPayment());
        p1.makePayment(2000);

        Person p2 = new Person();
        p2.setName("Rajini");
        p2.setPreferredGateway(new UpiPayment());
        p2.makePayment(5000);

        Person p3 = new Person();
        p3.setName("Kamal");
        p3.setPreferredGateway(new CryptoPayment());
        p3.makePayment(25000);
    }

}
