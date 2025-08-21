package in.co.nmsworks.week3.day1.set2;

public class SavingsAccount implements Account{

    private int balance = 0;
    private int deposit_limit = 100000;
    private int withdrawal_limit = 20000;

    public SavingsAccount() {
    }

    public SavingsAccount(int balance, int withdrawal_limit, int deposit_limit) {
        this.balance = balance;
        this.withdrawal_limit = withdrawal_limit;
        this.deposit_limit = deposit_limit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getDeposit_limit() {
        return deposit_limit;
    }

    public void setDeposit_limit(int deposit_limit) {
        this.deposit_limit = deposit_limit;
    }

    public int getWithdrawal_limit() {
        return withdrawal_limit;
    }

    public void setWithdrawal_limit(int withdrawal_limit) {
        this.withdrawal_limit = withdrawal_limit;
    }

    @Override
    public int limit() {
        return getWithdrawal_limit();
    }

    @Override
    public int withdraw(int amount) {
        if(withdrawal_limit > amount && amount < getBalance()){
            balance -= amount;
        }
        return balance;
    }

    @Override
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
}
