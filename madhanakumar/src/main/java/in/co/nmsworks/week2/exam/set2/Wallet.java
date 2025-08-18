package in.co.nmsworks.week2.exam.set2;

public class Wallet implements Account{
    int initialBalance = 30000;
    int limit = 10000;

    @Override
    public int limit() {
        return limit;
    }

    @Override
    public int withdraw(int amount) {
        if(amount <= limit){
            initialBalance = initialBalance - amount;
            System.out.println("Withdrawal Successfull. \n Remaining amount : ");
            return initialBalance;
        } else {
            System.out.println("Error : Withdrawal Limit Exceeded");
            return -1;
        }
    }

    @Override
    public int deposit(int amount) {
        return 0;
    }
}
