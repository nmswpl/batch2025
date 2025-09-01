package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class PracticeRunner
{
    public static void main(String[] args)
    {
        PracticeRunner practiceRunner = new PracticeRunner();
        practiceRunner.printSumOfGivenInLoop();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value for A and B : ");
        long a = scanner.nextLong();//525
        long b = scanner.nextLong();//315
        System.out.println("GCD of given : "+practiceRunner.generateGCD(a,b));
        System.out.println("First N Fibonacci Series....");
        System.out.print("\nEnter the value for N :");

        practiceRunner.fibonacciSeries(scanner.nextInt());

    }


    //Get a number n from the console. Print first n Fibonacci numbers


    private void fibonacciSeries(int i)
    {
        int temp1 = 0;
        int temp2 = 1;
        if (i == 1)
        {
            System.out.println("0");
            return;
        }
        System.out.print("0 1 ");
        i -= 2;
        while (i > 0)
        {
            int temp3 = temp1 + temp2;
            temp1 = temp2;
            temp2 = temp3;
            System.out.print(temp3+" ");
            i--;
        }
    }


    /*    Write a program to find the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
    Initial Step: Let a and b be the two numbers where a > b.
        Step 1: Compute the remainder of a divided by b (i.e., r = a % b).
    Step 2: Replace a with b and b with r.
    Repeat: Repeat the process until b becomes 0. The non-zero value of a at this point will be the GCD of the original two numbers.*/

    private long generateGCD(long a, long b)
    {
        long tempRemainder = 0;
        if (a < b)
        {
            a = b;
            b = a - b;
        }
        else if (a == b)
        {
            System.out.println("A shoud be greater then B.");
            return 0;
        }

        while (b != 0)
        {
            tempRemainder = a % b;
            a = b;
            b = tempRemainder;
        }
        return a;
    }


    //Write a program that reads integers from the user until the user enters `0`, then prints the sum of all entered integers.
    private void printSumOfGivenInLoop()
    {
        long sum = 0;
        long input;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.print("Enter a element : ");
            input = scanner.nextLong();
            sum += input;
            System.out.println("Sum of entered Values : "+sum);
        }while (input != 0);
    }





}
