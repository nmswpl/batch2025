package in.co.nmsworks.week2.day4;

import java.util.Scanner;

public class PrimeNumbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int value = scanner.nextInt();
        findPrimeNumber(value);
    }

    public static void findPrimeNumber(int isprime)
    {
        int count =0;
        for (int i = 2; i <=isprime/2; i++) {
            if (isprime % i == 0) {
                count++;
                break;

            }
        }
           if (count ==0)
           {
               System.out.println("is a prime");
           }
           else
           {
               System.out.println("not a prime");
           }

    }
}
