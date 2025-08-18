package in.co.nmsworks.week2.test.even;

public class AccountDemo{
        public static void transaction(Account account, int[] transactions) {
            for (int t : transactions) {
                if (t > 0) {
                    System.out.println("Depositing: "+t );
                    int updatedBalance = account.deposit(t);
                    System.out.println("Balance after deposit: " + updatedBalance);
                }
                else if (t < 0) {
                    System.out.println("Withdrawing: "+t );
                    int updatedBalance = account.withdraw(t);
                    System.out.println("Balance after withdrawal: " + updatedBalance);
                }
                else {
                    System.out.println("skip the transaction");
                }
            }
        }

        public static void main(String[] args) {
            Account wallet = new Wallet(1000, 500);
            Account savings = new SavingsAccount(1000,200);

            int[] walletTransactions = {300, -200, 600, -700};
            int[] savingsTransactions = {800, -300, 1500, -2500};

            System.out.println("Wallet Transactions:");
            transaction(wallet, walletTransactions);

            System.out.println("Savings Account Transactions:");
            transaction(savings, savingsTransactions);
        }

    }



