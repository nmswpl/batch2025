package in.co.nmsworks.week2.test.set2;

public class Wallet implements Account{
    private int balance ;
    private int limit;

    public Wallet(int initialBalance, int limit){
        balance = initialBalance;
        this.limit = limit;
    }

    @Override
    public int limit() {
        return limit;
    }

    @Override
    public int withdraw(int amount) {
        if ( amount < balance){
            System.out.println("There is no balance");
            return 0;
        }
        else if(amount >= limit){
            System.out.println("Amount exceed the limit");
            return 0;
        }
        else{
            System.out.println("Withdrwa succesfull");
            return  balance - amount;
        }
    }

    @Override
    public int deposit(int amount) {
        if(amount >= limit){
            System.out.println("Amount exceed the limit");
            return 0;
        }
        else{
            System.out.println("Deposit succesfull");
            return  balance + amount;
        }
    }
}
