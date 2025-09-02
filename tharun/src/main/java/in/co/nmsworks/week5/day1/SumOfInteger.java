package in.co.nmsworks.week5.day1;

/*
Write a program that reads integers from the user until the user enters `0`,
 then prints the sum of all entered integers.
 */

import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        SumOfInteger sumOfInteger = new SumOfInteger();
        sumOfInteger.getInput();
    }

    private void getInput() {
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        int sum = 0;
        while (input != 0){
            System.out.println("Enter input : ");
            input = scanner.nextInt();
            sum = findTotal(input , sum);
        }
        System.out.println(sum);
    }

    private int findTotal(int input , int total) {
        total += input;
        return total;

    }
}
