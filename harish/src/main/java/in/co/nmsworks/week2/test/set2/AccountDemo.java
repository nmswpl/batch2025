package in.co.nmsworks.week2.test.set2;

public class AccountDemo {
    public static void main(String[] args) {
        Wallet w1 = new Wallet(20000, 50000);
        SavingAccount s1 = new SavingAccount(300000, 100000);
        Wallet w2 = new Wallet(20000, 50000);
        Wallet w3 = new Wallet(20000, 50000);
        Wallet w4 = new Wallet(20000, 50000);
        SavingAccount s2 = new SavingAccount(300000, 100000);
        SavingAccount s3 = new SavingAccount(300000, 100000);
        int[] transactionArray = {20, -5, -15, 20};

        transaction(w1, transactionArray);
        transaction(s2, transactionArray);
        transaction(s3, transactionArray);
    }

    public static void transaction(Account account, int[] transcations) {

        for (int i = 0; i < transcations.length; i++) {
            if (transcations[i] > 0) {
                System.out.println(account.deposit(transcations[i]));
            } else {
                System.out.println(account.deposit(transcations[i]));
            }
        }
    }
}
