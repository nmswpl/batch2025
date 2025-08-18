package in.co.nmsworks.week2.day2.exam.set2;

public class Wallet implements Account{


    int balance;
    int limitForWithdrawalsAndDeposits;
    int withdrawAmount;
    int depositAmount;

    public Wallet(int initialBalance, int getLimitForWithdrawals, int withdrawAmount, int depositAmount) {
        this.balance = initialBalance;
        this.limitForWithdrawalsAndDeposits = getLimitForWithdrawals;
        this.withdrawAmount = withdrawAmount;
        this.depositAmount = depositAmount;
    }

    @Override
    public int limit() {
        return limitForWithdrawalsAndDeposits;
    }

    @Override
    public int withdraw(int amount) {
        
        balance -= amount;
        return balance;
    }

    @Override
    public int deposit(int amount) {

        balance += amount;
        return balance;
    }
}
