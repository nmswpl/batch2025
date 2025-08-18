package in.co.nmsworks.week2.day2.exam.set2;

public class Wallet implements Account{


    int initialBalance;
    int LimitForWithdrawalsAndDeposits;
    int withdrawAmount;
    int depositAmount;

    public Wallet(int initialBalance, int getLimitForWithdrawals, int withdrawAmount, int depositAmount) {
        this.initialBalance = initialBalance;
        this.LimitForWithdrawalsAndDeposits = getLimitForWithdrawals;
        this.withdrawAmount = withdrawAmount;
        this.depositAmount = depositAmount;
    }

    @Override
    public int limit() {
        return LimitForWithdrawalsAndDeposits;
    }

    @Override
    public int withdraw(int amount) {
        return 0;
    }

    @Override
    public int deposit(int amount) {
        return 0;
    }
}
