package in.co.nmsworks.week3.day1.set2;

public class AccountDemo {

    public static void main(String[] args) {

        SavingsAccount saccount = new SavingsAccount();
        saccount.setBalance(5000);
        saccount.setLimit(10000);
        int[] amountArray = {-5000,5000,3000,-1000};
        transaction(saccount, amountArray);

        System.out.println();
        Wallet wallet = new Wallet();
        wallet.setBalance(2000);
        wallet.setLimit(5000);
        transaction(wallet, new int[]{3000,-1000,5000});
    }

    private static void transaction(Account account, int[] transactions){

        for (int i = 0; i < transactions.length; i++){
            if (transactions[i] > 0){
                System.out.println("Your available balance is : " + account.deposit(transactions[i]));
            }
            else{
                System.out.println("Your available balance is : " + account.withdraw(transactions[i]));
            }
        }
    }
}
