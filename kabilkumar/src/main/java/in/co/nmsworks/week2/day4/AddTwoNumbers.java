package in.co.nmsworks.week2.day4;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {

        System.out.println("enter two numbers:");
        Scanner scanner = new Scanner(System.in);


       int value1 = scanner.nextInt();
       int value2 = scanner.nextInt();
        int c = value1 + value2;
        System.out.println("the sum is :" + c);
    }
}
