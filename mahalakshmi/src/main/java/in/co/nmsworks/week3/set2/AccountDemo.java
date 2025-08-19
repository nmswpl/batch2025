package in.co.nmsworks.week3.set2;

public class AccountDemo {
    public static void transaction(Account account, int[] transactions) {
        for (int i : transactions) {
            if(i > 0) {
                System.out.println("After Deposit, Your Balance is " + account.deposit(i));
            }
            else {
                System.out.println("After Withdrawn, Your available balance is "+ account.withdraw(Math.abs(i)));
            }
        }
    }

    public static void main(String[] args) {
        Account wallet = new Wallet(3000,5000);
        Account savAccount = new SavingsAccount(5000,10000);
        int[] transactions = {1000,-2000,5000,-6000,2000};
        transaction(wallet,transactions);
        transaction(savAccount,transactions);
    }
}
