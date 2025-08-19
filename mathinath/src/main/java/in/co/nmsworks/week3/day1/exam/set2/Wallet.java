package in.co.nmsworks.week3.day1.exam.set2;

public class Wallet implements Account{
    int walletInitialBalance ;
    int limit;

    public Wallet(int walletInitialBalance, int limit) {
        this.walletInitialBalance = walletInitialBalance;
        this.limit = limit;
    }

    public int getWalletInitialBalance() {
        return walletInitialBalance;
    }

    public void setWalletInitialBalance(int walletInitialBalance) {
        this.walletInitialBalance = walletInitialBalance;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public int limit() {
        return limit;
    }

    @Override
    public int withdraw(int amount) {
        if(amount <= limit && amount <= walletInitialBalance)
        {
            System.out.println("Withdraw Available");
            walletInitialBalance = walletInitialBalance - amount;
            return walletInitialBalance;
        }
        else
        {
            System.out.println("amount exceeds");
            return 0;
        }

    }

    @Override
    public int deposit(int amount) {
        if(limit >= amount)
        {
            System.out.println("Deposit available");
            walletInitialBalance+=amount;
            return walletInitialBalance;
        }
        else
        {
            System.out.println("not available");
            return 0;
        }
    }
}

