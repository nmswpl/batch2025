package in.co.nmsworks.week3.day5;

import java.util.Scanner;

/* Problem-1: Write a program that prints numbers from 1 to 100. For multiples of 3, print "Fizz" instead of the number. For multiples of 5, print "Buzz". For multiples of both 3 and 5, print "FizzBuzz".

 */
public class PrintNumbers1To100 {
    public static void main(String[] args) {

     printNumbersFrom1To100();

    }

    private static void printNumbersFrom1To100() {

         for(int i = 0 ; i <= 100; i++ ){
            if(i% 3 == 0 && i % 5 == 0 ){
                System.out.println("The number " + i + " is multiples of both 3 and 5 : FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("The number " + i + " is multiples of  3  : Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("The number " + i + " is multiples of 5 : Buz");
            }
            else{
                System.out.println(i);
            }
        }


    }
}
