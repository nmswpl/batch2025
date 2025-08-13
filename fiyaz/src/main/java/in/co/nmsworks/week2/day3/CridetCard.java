package in.co.nmsworks.week2.day3;

public class CridetCard implements PaymentGateway {

        public CridetCard() {
        }

        @Override
        public void processPayment(double amount) {;
            System.out.println("Amount recivied through Cridet Card : " + amount);
            System.out.println();
        }
    }
