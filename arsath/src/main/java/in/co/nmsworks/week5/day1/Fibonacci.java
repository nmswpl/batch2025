package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        f.printFibonacci(n);
    }

    public void printFibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.println("The first " + n + " numbers in a fibonacci sequence are: ");
        for(int i = 0; i < n; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
