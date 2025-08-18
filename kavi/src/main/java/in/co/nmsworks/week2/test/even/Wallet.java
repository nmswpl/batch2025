package in.co.nmsworks.week2.test.even;

public class Wallet implements  Account{
        private int balance;
        private int transactionLimit;

        public Wallet(int initialBalance, int transactionLimit) {
            this.balance = initialBalance;
            this.transactionLimit = transactionLimit;
        }

        @Override
        public int limit() {
            return transactionLimit;
        }

        @Override
        public int withdraw(int amount) {
            if (amount > transactionLimit) {
                System.out.println("Withdrawal amount exceeds.");
            }
            else if (amount > balance) {
                System.out.println("Insufficient balance.");
            }
            else {
                balance -=amount;
            }
            return balance;
        }

        @Override
        public int deposit(int amount) {
            if (amount > transactionLimit) {
                System.out.println("Deposit amount exceeds.");
            }
            else {
                balance += amount;
            }
            return balance;
        }

}
