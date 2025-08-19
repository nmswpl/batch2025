package in.co.nmsworks.week3.day1.set2;

public class SavingsAccount implements Account{

    private int initial_balance = 0;
    private int withdarawal_limit = 20000;

    public SavingsAccount() {
    }

    public SavingsAccount(int initial_balance, int withdarawal_limit) {
        this.initial_balance = initial_balance;
        this.withdarawal_limit = withdarawal_limit;
    }

    @Override
    public int limit() {
        return 0;
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
