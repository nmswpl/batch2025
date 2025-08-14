package in.co.nmsworks.week2.day3;

public class Person {
    private String name;
    private PaymentGetWay peferedGateWay;

    public Person(String name, PaymentGetWay peferedGateWay) {
        this.name = name;
        this.peferedGateWay = peferedGateWay;
    }
    public void ProcessPayment(double amount) {
        System.out.println(amount+"amount received from Person");
    }
}
