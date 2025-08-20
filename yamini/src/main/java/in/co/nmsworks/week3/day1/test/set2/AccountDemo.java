package in.co.nmsworks.week3.day1.test.set2;

public class AccountDemo {
        public void transaction(Account account, int[] transactions) {
            for (int t : transactions) {
                if (t > 0) {
                    int bal = account.deposit(t);
                    System.out.println("Deposited " + t + ", Balance = " + bal);
                } else {
                    int bal = account.withdraw(-t);
                    System.out.println("Withdrew " + (-t) + ", Balance = " + bal);
                }
            }
        }

    public static void main(String[] args) {
        Account wallet = new Wallet(1000, 10000);
        Account savings = new SavingsAccount(2000, 10000);

        AccountDemo demo = new AccountDemo();

        System.out.println(" Wallet Transactions ");
        int[] walletTransactions = {200, -100, 600, -1200, 400};
        demo.transaction(wallet, walletTransactions);

        System.out.println(" SavingsAccount Transactions ");
        int[] savingsTransactions = {800, -500, 1200, -2500, 700};
        demo.transaction(savings, savingsTransactions);
    }
}
