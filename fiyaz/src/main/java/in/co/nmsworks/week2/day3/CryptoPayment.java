package in.co.nmsworks.week2.day3;

public class CryptoPayment implements PaymentGateway {

        @Override
        public void processPayment(double amount) {
            System.out.println("Amount recivied through Crypto Pay : " + amount);
            System.out.println();
        }
}
