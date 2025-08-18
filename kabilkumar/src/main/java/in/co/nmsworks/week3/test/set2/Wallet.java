package in.co.nmsworks.week3.test.set2;

public class Wallet implements Account {


    int initialBalance;
    final int limit1 = 1000;
    final int   minimumBalance = 500;



    @Override
    public void limit()
    {
        System.out.println("the limit should be " + limit1);
    }

    @Override
    public void withdraw(int amount) {
        if (amount >= limit1 )
        {
            System.out.println("You can Withdraw" );
        }
        else {
            System.out.println("Maintains the Minimum Balance :" + minimumBalance);
        }
    }


    @Override
    public void deposite(int amount)
    {
        int totalAmount;
        totalAmount = minimumBalance + amount;
        System.out.println("your deposite amount " +totalAmount);

    }
}

