package in.co.nmsworks.week2.day4;

import java.util.Scanner;

public class TheNumberOfPowerUsingPow
{
    public static void main(String[] args) {

        System.out.println("Enter the Base:");

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter the power:");
        int num2 = scanner.nextInt();

        double res =  Math.pow(num1,num2);
        System.out.println("Answer : "+res);
    }
}
