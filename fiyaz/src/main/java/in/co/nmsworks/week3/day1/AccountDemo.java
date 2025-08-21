package in.co.nmsworks.week3.day1;

public class AccountDemo {
    public void transaction(Account account, int transactions) {

            if (transactions > 0) {
                int balance = account.deposit(transactions);
                System.out.println("Deposited " + transactions + " | Balance: " + balance);
            } else if (transactions < 0) {
                int balance = account.withdraw(-transactions);
                System.out.println("Withdrew " + (-transactions) + " | Balance: " + balance);
            }

    }

    public static void main(String[] args) {
        Account wallet = new Wallet(500, 200);
        Account savings = new SavingsAccount(1000, 500);

        int walletTransactions = 100;
        int savingsTransactions = 200;

        AccountDemo demo = new AccountDemo();

        demo.transaction(wallet, walletTransactions);
        demo.transaction(savings, savingsTransactions);

    }
}

