package in.co.nmsworks.week5;

import java.util.Scanner;

public class FibonaaciNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        firstNfibonacci(n);
    }

    private static void firstNfibonacci(int n) {
        int first = 0;
        int second = 1;
        if (n == 1) {
            System.out.println("The first " + n + " fibonacci numbes is " + first);

        }
         else {
            System.out.print("The first " + n + " fibonacci numbers are  " + first + " " + second);
            for (int i = 2; i < n; i++) {
                int next = first + second;
                System.out.print(" " + next + " ");
                first = second;
                second = next;
            }

        }
    }
}
