package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class SumOfInt
{
    public static void main(String[] args)
    {
        int sum = 0;
        do
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a Number : ");
            int num = sc.nextInt();
            sc.nextLine();

            if (num == 0)
            {
                System.out.println("Sum of All Integers : " + sum);
                sc.close();
                break;
            }
            sum += num;
        } while (true);
    }
}
