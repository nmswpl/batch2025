package in.co.nmsworks.week3.day1.test.set2;

public class SavingsAccount implements Account{
    private int balance;
    private int transactionLimit;

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
        if (amount > transactionLimit) {
            System.out.println("Error: Withdrawal amount exceeds limit!");
            return balance;
        }
        if (amount > balance) {
            System.out.println("Error: Insufficient balance!");
            return balance;
        }
        balance -= amount;
        return balance;
    }

    @Override
    public int deposit(int amount) {
        if (amount > transactionLimit) {
            System.out.println("Error: Deposit amount exceeds limit!");
            return balance;
        }
        balance += amount;
        return balance;
    }
}
