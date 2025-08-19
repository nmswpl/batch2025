package in.co.nmsworks.week3.set2.question1;

public class AccountDemo {

    private  void accountCreationMethod() {
        Account walletAccount = new Wallet(1000,1000);
        Account savingAccount = new SavingAccount(2000,1000);
        int [] transactions = {900,-500,900,-500};

        System.out.println("--------Wallet output--------");
        transaction(walletAccount,transactions);
        System.out.println("--------Saving Account output--------");
        transaction(savingAccount,transactions);
    }
    private void transaction(Account account, int[] transactions){
        for (int transaction : transactions) {
            if (transaction > 0){
                int balance = account.deposit(transaction);
                if(balance == 0){
                    System.out.println("Out of Limit");
                }
                else {
                    System.out.println("Rs."+ transaction +" is credited in your Account. Your current  balance is Rs." + balance);
                }
            }
            else if (transaction < 0) {
                int balance = account.withdraw(Math.abs(transaction));
                if(balance == 0){
                    System.out.println("Out of Limit");
                }
                else {
                    System.out.println("Rs."+ Math.abs(transaction) +" is Debited in your Account. Your current  balance is Rs." + balance);
                }

            }
        }
    }

    public static void main(String[] args) {
        AccountDemo demo = new AccountDemo();
        demo.accountCreationMethod();
    }

}
