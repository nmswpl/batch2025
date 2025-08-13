package in.co.nmsworks.week2.day3;

public class UpiPayment implements PaymentGateway{

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "UPI Payment ";
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Rupees "+amount +" received by "+toString());

    }
}
