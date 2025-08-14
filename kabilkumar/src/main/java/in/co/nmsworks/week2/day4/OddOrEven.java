package in.co.nmsworks.week2.day4;

import java.util.Scanner;

public class OddOrEven
{
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner a = new Scanner(System.in);
        int value1 = a.nextInt();

        if (value1 % 2 == 0) {
            System.out.println("Enter number is even");
        } else {
            System.out.println("enter number is odd ");
        }
    }
}
