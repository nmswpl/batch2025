package in.co.nmsworks.week3.day5;

/* Write a program to find the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
        Initial Step: Let a and b be the two numbers where a > b.
        Step 1: Compute the remainder of a divided by b (i.e., r = a % b).
        Step 2: Replace a with b and b with r.
        Repeat: Repeat the process until b becomes 0. The non-zero value of a at this point will be the GCD of the original two numbers.*/

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class GcdOfTwoIntegers {


    public static void main(String[] args) {



        int number1 = 18 ;
        int number2 = 3 ;

        findGcd(number1 , number2);

    }

    private static void findGcd(int a, int b) {

        while(b != 0) {
            int remainder = a % b ;
            int temp = a;
            a = b;
            b = remainder ;
        }
        System.out.println("The Gcd of the two integers : " +  a);

    }
}
