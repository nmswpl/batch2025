package in.co.nmsworks.week2.exam.set2;

public class Wallet implements Account{
    int walletInitialBalance = 0;
    int limit=10000;


    @Override
    public int limit() {
        return limit;
    }

    @Override
    public int withdrawal(int amount) {
        if(amount<=limit)
        {
            if(amount<=walletInitialBalance)
            {
                walletInitialBalance = walletInitialBalance - amount;
                System.out.println("Amount Withdrawed is "+amount+" - Current balance in wallet = "+walletInitialBalance);
                return walletInitialBalance;
            }
            else
            {
                System.out.println("Withdraw amount is above Wallet Balance.\n Current balance in Wallet : "+walletInitialBalance);
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
        if(limit >= amount)
        {
            walletInitialBalance+=amount;
            System.out.println("Amount Deposited is "+amount +" - Current balance in Wallet = "+walletInitialBalance);
            return walletInitialBalance;
        }
        else
        {
            System.out.println("Deposit amount is above limit\n Enter the deposit amount below "+limit);
            return 0;
        }
    }
}


