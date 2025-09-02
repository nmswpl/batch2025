package in.co.nmsworks.week5;


import java.util.Scanner;

public class GcdTwoNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        gcdOfTwoNumber(num1 , num2);

    }

    private static void gcdOfTwoNumber(int a, int b) {

        if(a > b) {
            while (b != 0) {
                int r = a % b;
                int temp = a;
                a = b;
                b = r;
            }
            System.out.println("The Gcd of Two numbers : " + a);
        }
        else{
            while (a != 0) {
                int r = b % a;
                int temp = b;
                b = a;
                a = r;
            }
            System.out.println("The Gcd of Two numbers : " + b);
        }
    }
}
