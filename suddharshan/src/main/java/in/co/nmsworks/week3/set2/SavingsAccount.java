package in.co.nmsworks.week3.set2;

public class SavingsAccount implements Account{

    private int initialbalance;
    private int limit;

    public int getInitialbalance() {
        return initialbalance;
    }

    public void setInitialbalance(int initialbalance) {
        this.initialbalance = initialbalance;
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
        if(amount > limit()){
            System.out.println("Amount exceeds the limit");
            return 0;
        }
        else{
            initialbalance -= amount;
            return initialbalance;
        }
    }

    @Override
    public int deposit(int amount) {
        if(amount > limit()){
            System.out.println("Amount exceeds the limit");
            return 0;
        }
        else{
            initialbalance += amount;
            return initialbalance;
        }
    }
}