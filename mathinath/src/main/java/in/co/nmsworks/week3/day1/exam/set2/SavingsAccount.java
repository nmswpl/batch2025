package in.co.nmsworks.week3.day1.exam.set2;

public class SavingsAccount implements Account{
    int savingsInitialBalance;
    int limit;
    public SavingsAccount(int savingsInitialBalance, int limit) {
        this.savingsInitialBalance = savingsInitialBalance;
        this.limit = limit;
    }

    public int getSavingsInitialBalance() {
        return savingsInitialBalance;
    }

    public void setSavingsInitialBalance(int savingsInitialBalance) {
        this.savingsInitialBalance = savingsInitialBalance;
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
        if(limit > amount)
        {
            System.out.println("Withdraw Available");
            savingsInitialBalance-=amount;
            return savingsInitialBalance;
        }
        else
        {
            System.out.println("not available");
            return 0;
        }
    }

    @Override
    public int deposit(int amount) {
        if(limit > amount)
        {
            System.out.println("Deposit Available");
            savingsInitialBalance+=amount;
            return savingsInitialBalance;
        }
        else
        {
            System.out.println("not available");
            return 0;
        }
    }
}
