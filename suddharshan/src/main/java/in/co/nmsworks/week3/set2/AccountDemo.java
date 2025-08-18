package in.co.nmsworks.week3.set2;

import static java.lang.Math.abs;

public class AccountDemo {
    public static void main(String[] args) {
        Wallet w1 = new Wallet();
        w1.setInitialbalance(3000);
        w1.setLimit(3000);
        SavingsAccount s1 = new SavingsAccount();
        s1.setInitialbalance(5000);
        s1.setLimit(4000);
        transaction(w1, new int[] {2500,-3500,1500});
        transaction(s1, new int[] {2000,-4500,2500});
    }

    public static void transaction(Account account, int[] transactions){
        for(int i = 0; i < transactions.length; i++){
            if(transactions[i] > 0){
                System.out.println("Available Balance after Deposit: " + account.deposit(transactions[i]));
            }
            else{
                int amount = abs(transactions[i]);
                System.out.println("Available Balance after Withdraw: " + account.withdraw(amount));
            }
        }
    }
}
