package in.co.nmsworks.week3.day1;

public class SavingsAccount implements Account {
     int balance;
     int transactionLimit;

    public SavingsAccount(int balance, int transactionLimit) {
        this.balance = balance;
        this.transactionLimit = transactionLimit;
    }

    @Override
    public int limit() {
        return transactionLimit;
    }

    @Override
    public int withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Withdrawal exceeds available balance of " + balance);
            return balance;
        }
        balance = balance + amount;
        return balance;
    }

    @Override
    public int deposit(int amount) {
        if (amount > transactionLimit) {
            System.out.println("Deposit exceeds limit of " + transactionLimit);
            return balance;
        }
        balance = balance + amount;
        return balance;
    }
}
