package in.co.nmsworks.week2.test.even;

public class Wallet implements AccountNew{
    @Override
    public int limit() {
        return 3000;
    }

    @Override
    public int withdraw(int amount) {
        return 200;
    }

    @Override
    public int deposit(int amount) {
        return 5000;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
