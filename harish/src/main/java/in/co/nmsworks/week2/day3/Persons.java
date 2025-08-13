package in.co.nmsworks.week2.day3;

public class Persons {

    private String name;
    private PaymentGateway pgw;

    public PaymentGateway getPgw() {
        return pgw;
    }

    public void setPgw(PaymentGateway pgw) {
        this.pgw = pgw;
    }

    public void makePayment(double amount){
        System.out.println("The amount rupees " + amount + " is paid through " +pgw);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
