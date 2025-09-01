package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class AlphabetDiagonalPattern
{
    public static void main(String[] args)
    {
        int alphabetStart = 97;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n <= 0)
        {
            System.out.println("Invalid Input");
        }
        for (int i = 0; i < n; i++)
        {
            for (int space = 0; space < i; space++)
            {
                System.out.print(" ");
            }
            System.out.println((char)(alphabetStart + (i % 26)));
        }
    }
}
