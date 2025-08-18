package in.co.nmsworks.week3.set2;

public class AccountDemo
{
    public static void main(String[] args)
    {
        Wallet wallet = new Wallet(50000, 200000);
        SavingsAccount savingsAccount = new SavingsAccount(25000, 700000);
        transaction(wallet, new int[]{-20000, 35000});
        transaction(savingsAccount, new int[]{-10000, 75000});
    }

    public static void transaction(Account account, int[] transactions)
    {

        for (int t : transactions)
        {
            if (t < 0)
            {
                printCurrentBalance(account);
                int code = account.withdraw(t);
                System.out.println("Withdrawing Money Of Rs." + -(t));
                System.out.println(code == -1 ? "Withdraw Failed" : "Withdraw Successfull");
                printCurrentBalance(account);
                System.out.println();
            }
            else
            {
                printCurrentBalance(account);
                int code = account.deposit(t);
                System.out.println("Depositing Money Of Rs." + t);
                System.out.println(code == -1 ? "Deposit Failed" : "Deposit Successfull");
                printCurrentBalance(account);
                System.out.println();
            }
        }
    }

    public static void printCurrentBalance(Account account)
    {
        if (account instanceof Wallet)
        {
            Wallet w = (Wallet) account;
            System.out.println("Available Balance : " + w.getTotalAmount());
        }
        else if (account instanceof SavingsAccount)
        {
            SavingsAccount s = (SavingsAccount) account;
            System.out.println("Available Balance : " + s.getTotalAmount());
        }
    }

}
