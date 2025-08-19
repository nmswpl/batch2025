package in.co.nmsworks.week3.set2;

public class SavingsAccount implements Account{
    private int balance;
    private int limit;

    public SavingsAccount(int initialBalance, int limit) {
        this.balance = initialBalance;
        this.limit = limit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public int limit() {
        return getLimit();
    }

    @Override
    public int withdraw(int amount) {
        if(amount > getLimit()) {
            System.out.println("Amount exceeds the limit!");
        }
        else if(amount > balance) {
            System.out.println("Amount exceeds the Balance!!");
        }
        else {
            setBalance(getBalance()-amount);
        }
        return getBalance();
    }

    @Override
    public int deposit(int amount) {
        if(amount > getLimit()) {
            System.out.println("Amount exceeds the limit!!");
        }
        else {
            setBalance(getBalance()+amount);
        }
        return getBalance();
    }
}
