package in.co.nmsworks.week2.test.set2;

public class Runner {
    public static void main(String[] args) {

        Wallet w1 = new Wallet(20000,50000);
        SavingAccount s1 = new SavingAccount(300000, 100000);
        Wallet w2 = new Wallet(20000,50000);
        Wallet w3 = new Wallet(20000,50000);
        Wallet w4 = new Wallet(20000,50000);
        SavingAccount s2 = new SavingAccount(300000, 100000);
        SavingAccount s3 = new SavingAccount(300000, 100000);
        int[] transactionArray = {20,-5,-15,20};
    }
}
