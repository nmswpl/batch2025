package in.co.nmsworks.week2.exam.set2;


public class AccountDemo {

    public static void main(String args[])
    {
        Account wallet=new Wallet();
        wallet.deposit(2000);
        wallet.withdrawal(1000);

        Account savingAccount=new SavingAccount();
        savingAccount.deposit(2000);
        savingAccount.withdrawal(1000);
        AccountDemo accDemo = new AccountDemo();
        accDemo.transaction(savingAccount, new int[] {1000,-1000});
    }

    private void transaction(Account account , int[] transactions) {
        for(int i=0;i<transactions.length;i++)
        {
            if(transactions[i] > 0)
            {
                System.out.println(account.deposit(transactions[i]));
            }
            else
            {
                int amount = -transactions[i];
                System.out.println(account.withdrawal(amount));
            }
        }
    }
}

