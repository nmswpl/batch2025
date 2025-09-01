package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int first = 0, second = 1, third;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n <= 0)
        {
            System.out.println("Invalid Input");
        }
        if (n == 1)
        {
            System.out.println(first);
        }
        if (n >= 2)
        {
            System.out.print(first + " " + second + " ");
        }
        for (int i = 2; i < n; i++)
        {
            third = first + second;
            first = second;
            second = third;
            System.out.print(third + " ");
        }
    }
}
