package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class PracticeRunner
{
    public static void main(String[] args)
    {
        PracticeRunner practiceRunner = new PracticeRunner();
        practiceRunner.printSumOfGivenInLoop();
    }

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
