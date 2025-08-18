package in.co.nmsworks.week2.test.set2;

public class AccountDemo {
    private static int[] transaction;

    public static void main(String[] args) {
        AccountDemo accountDemo = new AccountDemo();
        Wallet wallet = new Wallet();
        wallet.setDepositLimit(3000);
        wallet.setWithdrawLimit(3000);
        wallet.setBalance(2000);
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setBalance(2500);
        savingsAccount.setDepositLimit(4000);
        savingsAccount.setDepositLimit(3000);
        transaction(wallet,0);
    }

    private static void transaction(Wallet account, int i) {
        if (i > 0) {
            account.setWithdrawLimit(2000);
        }
    }


}
