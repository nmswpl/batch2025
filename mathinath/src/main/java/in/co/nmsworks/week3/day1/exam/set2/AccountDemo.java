package in.co.nmsworks.week3.day1.exam.set2;

public class AccountDemo {
    public static void main(String args[])
    {
        Wallet w1 = new Wallet(4000,5000);
        SavingsAccount s1 = new SavingsAccount(3000,5000);
        new AccountDemo().transaction(w1,new int[]{1000,-1000});
        new AccountDemo().transaction(s1,new int[]{2000,-2000});
    }

    private void transaction(Account account , int[] transactions) {
        for(int i=0;i<transactions.length;i++)
        {
            if(transactions[i] > 0)
            {
                System.out.println("deposit Available "+account.deposit(transactions[i]));
            }
            else
            {
                int amount = -transactions[i];
                System.out.println("Withdraw Available "+account.withdraw(amount));
            }
        }
    }
}

