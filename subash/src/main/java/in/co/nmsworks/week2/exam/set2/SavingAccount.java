package in.co.nmsworks.week2.exam.set2;

public class SavingAccount implements Account{
    int limit=10000;
    int walletInitialBalance=0;
    @Override
    public int limit() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int withdrawal(int amount) {
        // TODO Auto-generated method stub
        if(amount<=limit)
        {
            if(amount<=walletInitialBalance)
            {
                walletInitialBalance = walletInitialBalance - amount;
                System.out.println("Amount Withdrawed is "+amount+" - Current balance in Saving Account = "+walletInitialBalance);
                return walletInitialBalance;
            }
            else
            {
                System.out.println("Withdraw amount is above Wallet Balance.\nCurrent balance in Saving Account : "+walletInitialBalance);
                return 0;
            }
        }
        else
        {
            System.out.println("Withdraw amount exceeds "+walletInitialBalance);
            return 0;
        }
    }

    @Override
    public int deposit(int amount) {
        // TODO Auto-generated method stub
        if(amount<=limit)
        {
            walletInitialBalance+=amount;
            System.out.println("Amount Deposited is "+amount+" - Current balance in Saving Account = "+walletInitialBalance);
            return walletInitialBalance;
        }
        else
        {
            System.out.println("Deposit amount is above limit\nEnter the deposit amount below "+limit);
            return 0;
        }
    }

}

