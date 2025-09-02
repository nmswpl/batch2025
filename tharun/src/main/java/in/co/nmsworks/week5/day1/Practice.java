package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.commonMethod();
    }

    private void commonMethod() {
//        findGCD();
//        fibonaci();
        diagonalPattern();
    }

    private void diagonalPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            System.out.println((char)(97+i) );
        }
    }

    private void fibonaci() {

        int initialNumber = 0;
        int firstNumber = 1;

        System.out.println("Enter input : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.print(initialNumber + "\t");
        if (input > 1)
        {
            System.out.print(firstNumber + "\t");

        }

        for (int i = 3; i <= input; i++) {
            int sum = initialNumber + firstNumber;
            initialNumber = firstNumber;
            firstNumber = sum;
            System.out.print(sum + "\t");
        }
    }

    /*
    Write a program to find the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
        Initial Step: Let a and b be the two numbers where a > b.
        Step 1: Compute the remainder of a divided by b (i.e., r = a % b).
        Step 2: Replace a with b and b with r.
        Repeat: Repeat the process until b becomes 0.
         The non-zero value of a at this point will be the GCD of the original two numbers.
     */
    private void findGCD() {
        int a = 525 , b = 525;
        int r;
        if (b > a){
            int temp = a ;
            a = b;
            b = temp;
        }
        while (b > 0)
        {
            if (a >= b)
            {
                r = a % b;
                a = b;
                b = r;
            }
            else
            {
                System.out.println("Some Problem occur");
                return;
            }
        }
        System.out.println(a);
    }
}
