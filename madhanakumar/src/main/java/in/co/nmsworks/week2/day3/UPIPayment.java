package in.co.nmsworks.week2.day3;

public class UPIPayment implements PaymentGateway{
    double amount;
    public UPIPayment() {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "UPIPayment{" +
                "amount=" + amount +
                '}';
    }

    @Override
    public String processPayment(double amount) {
        return amount + " rupees paid through UPI ";
    }

}
