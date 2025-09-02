package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter how many Fibonacci numbers to print: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter the positive number");
            return;
        }

        int a = 0, b = 1;

        System.out.println("First " + n + " Fibonacci Numbers::");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a=b;
            b=next;
        }
    }
}

