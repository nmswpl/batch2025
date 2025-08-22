package in.co.nmsworks.week3.day5;
/* Write a program to find the sum of digits of a given integer.*/

import java.util.Scanner;

public class SumOfDigitsInInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        int result = sumOfDigits(integer);
        System.out.println("The sum of the digits of the Integer  " + integer + "is :" + result);
    }

    private static int sumOfDigits(int integer) {
        int sum = 0;
        while (integer > 0) {
            int temp = integer % 10;
            sum = sum + temp;
            integer = integer / 10;
        }
        return sum;

    }
}

