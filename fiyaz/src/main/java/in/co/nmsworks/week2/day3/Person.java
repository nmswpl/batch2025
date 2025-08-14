package in.co.nmsworks.week2.day3;

public class Person {

    String name;
    PaymentGateway perfferedPayment;
    //double makePayment;


    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentGateway getPerfferedPayment() {
        return perfferedPayment;
    }

    public void setPerfferedPayment(PaymentGateway perfferedPayment) {
        this.perfferedPayment = perfferedPayment;
    }

    public void makePayment(double d) {
        perfferedPayment.processPayment(d);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", perfferedPayment=" + perfferedPayment +
                '}';
    }
}
