package in.co.nmsworks.week2.test.set2;

public class SavingsAccount implements Account{
    private int balance;
    private int depositLimit ;
    private int withdrawLimit;

    public int getDepositLimit() {
        return depositLimit;
    }

    public void setDepositLimit(int depositLimit) {
        this.depositLimit = depositLimit;
    }

    public int getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(int withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public int limit() {
        return 0;
    }

    @Override
    public int withdraw(int amount) {
        if( amount <= this.withdrawLimit) {
            this.balance -=amount;
        }
        return this.balance;
    }


    @Override
    public int deposit(int amount) {
        if (amount >= depositLimit) {
            this.balance +=amount;
        }
        return this.balance;
    }
}
