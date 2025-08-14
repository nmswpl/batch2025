package in.co.nmsworks.week2.day3;

public class Person
{
    private PaymentGateWay pGW;

    public void setPGW(PaymentGateWay pGW) {
        this.pGW = pGW;
    }

    public void makePayment(double amount){
        pGW.processPayment(amount);
    }

}
