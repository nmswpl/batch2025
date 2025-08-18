package in.co.nmsworks.week2.exam.set2;

public class SavingsAccount implements Account{
    double initialBalance = 300000.0D;
    int limit = 50000;

    @Override
    public int limit() {
        return limit;
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
