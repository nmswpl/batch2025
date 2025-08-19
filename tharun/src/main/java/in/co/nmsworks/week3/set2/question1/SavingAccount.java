package in.co.nmsworks.week3.set2.question1;

public class SavingAccount implements Account{
    private int balance;
    private int limit;

    public SavingAccount(int balance, int limit) {
        this.balance = balance;
        this.limit = limit;
    }

    @Override
    public int limit() {
        return this.limit;
    }

    @Override
    public int withdraw(int amount) {
        if (amount <= limit()){
            if (amount <= this.balance){
                this.balance -= amount;
                return this.balance;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public int deposit(int amount) {
        if (amount <= limit() ){
            this.balance += amount;
            return this.balance;
        }
        return 0;
    }
}
