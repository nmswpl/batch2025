package in.co.nmsworks.week2.day3;

public class Person implements PaymentGateWay{
    public String name;
    public PaymentGateWay paymentGateWay;

    public double makePament(double pay){
        return pay;
    }

    public Person(String name, PaymentGateWay paymentGateWay) {
        this.name = name;
        this.paymentGateWay=paymentGateWay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", paymentGateWay=" + paymentGateWay +
                '}';
    }

    @Override
    public double processPayment(double amount) {
        return amount;
    }

    public void printName()
    {

    }

}
