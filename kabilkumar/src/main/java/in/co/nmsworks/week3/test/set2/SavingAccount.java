package in.co.nmsworks.week3.test.set2;

public class SavingAccount implements  Account
{
    int savingAmount;
   final int miniumBalance = 500;

    public SavingAccount(int savingAmount) {
        this.savingAmount = savingAmount;
    }


    @Override
    public void limit() {
        System.out.println("The saving Amount :"+savingAmount);

    }

    @Override
    public void withdraw(int amount) {
        if (amount - savingAmount >= miniumBalance)
        {
            System.out.println("Withdraw you amount :" + amount);
        }
        else
        {
            System.out.println("withdraw amount is less than Minimum Balance :" + savingAmount);
        }

    }

    @Override
    public void deposite(int amount) {

    }
}
