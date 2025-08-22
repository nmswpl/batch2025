package in.co.nmsworks.week3.day1.set2;

public class AccountDemo {

    public static void transaction(Account account, int[] transactions) {
        for (int t : transactions) {
            int updatedBalance;
            if (t > 0) {
                updatedBalance = account.deposit(t);
            } else {
                updatedBalance = account.withdraw(-t);
            }
            System.out.println("Balance after transaction: " + updatedBalance);
        }
    }

    public static void main(String[] args) {
        Account wallet = new Wallet(1000, 500);
        Account savings = new SavingsAccount(2000, 1000);
        int[] walletTransactions = {200, -300, 600, -800};
        int[] savingsTransactions = {500, -1500, 1200, -500};

        System.out.println("Wallet Transactions:");
        transaction(wallet, walletTransactions);

        System.out.println("Savings Account Transactions:");
        transaction(savings, savingsTransactions);
    }
}
