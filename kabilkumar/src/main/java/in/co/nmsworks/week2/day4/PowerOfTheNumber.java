package in.co.nmsworks.week2.day4;

import java.util.Scanner;

public class PowerOfTheNumber
{
    public static void main(String[] args) {

        System.out.println("Enter the Base:");

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter the power:");
        int num2 = scanner.nextInt();
        int result=1;
        for (int i=1;i<num2;i++)
        {
            result =num1*num1;
            result=result*num1;

        }
        System.out.println(result);

    }
}
