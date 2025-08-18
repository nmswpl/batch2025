package in.co.nmsworks.week2.exam.set2;

public class SavingAccount implements Account{

    private static int startingBalance=1000;
    private int withdrawalLimit=10000;
    private int depositLimit=10000;

    @Override
    public int limit() {
            return 0;

    }

    @Override
    public int withdrawal(int amount) {
        if(withdrawalLimit<amount)
            return 0;
        else {
            startingBalance = startingBalance - amount;
            return startingBalance;
        }
    }

    @Override
    public int deposit(int amount) {
        if(depositLimit<amount)
            return 0;
        else {
            startingBalance = startingBalance + amount;
            return startingBalance;
        }
    }
}
