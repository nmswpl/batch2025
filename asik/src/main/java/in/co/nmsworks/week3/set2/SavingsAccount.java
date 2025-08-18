package in.co.nmsworks.week3.set2;

public class SavingsAccount implements Account
{
    private int amountLimit;
    private int initialAmount;
    private int totalAmount;

    public SavingsAccount()
    {}

    public SavingsAccount(int amountLimit, int initialAmount)
    {
        this.amountLimit = amountLimit;
        this.initialAmount = initialAmount;
        totalAmount = initialAmount;
    }

    @Override
    public int limit()
    {
        return amountLimit;
    }

    public int getAmountLimit()
    {
        return amountLimit;
    }

    public void setAmountLimit(int amountLimit)
    {
        this.amountLimit = amountLimit;
    }

    public int getTotalAmount()
    {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount)
    {
        this.totalAmount = totalAmount;
    }

    @Override
    public int withdraw(int amount) {
        if (amount <= limit())
        {
            totalAmount += amount;
            return totalAmount;
        }
        return -1;

    }

    @Override
    public int deposit(int amount) {
        if (amount <= limit())
        {
            totalAmount += amount;
            return totalAmount;
        }
        return -1;

    }
}
