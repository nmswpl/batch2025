package in.co.nmsworks.week2.exam.set2;

public class Wallet implements Account{
    double initialBalance = 30000.0D;
    int limit = 10000;

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
