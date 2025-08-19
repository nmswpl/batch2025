package in.co.nmsworks.week3.day1.set2;

import java.util.Scanner;

public class SavingsAccount implements Account{

    public int balance;
    private int limit;

    public SavingsAccount(){
        System.out.println("--YOUR SAVINGS ACCOUNT");
        System.out.println();
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public int limit() {
        return limit;
    }

    @Override
    public int withdraw(int amount) {

        if (amount > balance) {
            System.out.println("You don't have sufficient amount to withdraw");
        }
        if (amount > limit()){
            System.out.println("You can only withdraw amount upto : " + limit());
        }
        if (amount < balance && amount < limit()){
            System.out.println("You can withdraw an amount : " + (-1)*amount);
            balance += amount;
            return balance;
        }
        return -1;
    }

    @Override
    public int deposit(int amount) {

        if (amount > limit()){
            System.out.println("Your deposited amount exceeds the limit...");
            System.out.println("You can only deposit amount upto " + limit());
        }
        else{
            System.out.println(amount + " successfully deposited !!!");
            balance += amount;
            return balance;
        }
        return -1;
    }
}
