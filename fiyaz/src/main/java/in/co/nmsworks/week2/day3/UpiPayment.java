package in.co.nmsworks.week2.day3;

public class UpiPayment implements PaymentGateway {

        @Override
        public void processPayment(double amount) {
            System.out.println("Amount recivied through Upi Payment : " + amount);
            System.out.println();
        }
}
