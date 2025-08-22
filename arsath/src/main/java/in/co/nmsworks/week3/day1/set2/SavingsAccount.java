package in.co.nmsworks.week3.day1.set2;

public class SavingsAccount implements Account{

    private int balance;
    private int transactionLimit;

    public SavingsAccount(int balance, int transactionLimit) {
        this.balance = balance;
        this.transactionLimit = transactionLimit;
    }

    public int limit() {
        return transactionLimit;
    }

    public int withdraw(int amount) {
        if (amount > balance || amount > transactionLimit) {
            System.out.println("Amount exceeds the limit");
            return balance;
        }
        balance -= amount;
        return balance;
    }

    public int deposit(int amount) {
        if (amount > transactionLimit) {
            System.out.println("Amount exceeds the limit");
            return balance;
        }
        balance += amount;
        return balance;
    }
}
