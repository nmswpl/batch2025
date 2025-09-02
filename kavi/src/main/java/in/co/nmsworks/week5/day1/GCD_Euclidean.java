package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class GCD_Euclidean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number b: ");
        int b = scanner.nextInt();

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println("The GCd is " + a);
    }
}

