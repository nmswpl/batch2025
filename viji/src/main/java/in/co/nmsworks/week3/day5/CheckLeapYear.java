package in.co.nmsworks.week3.day5;

/* Problem-2: Write a program to check if a given year is a leap year.

        A year is considered a leap year if it meets one of the following conditions:
Condition 1:
Divisible by 4: A year must be divisible by 4 to be a leap year.
Not Divisible by 100: However, if the year is also divisible by 100, it is not a leap year
Condition 2:
Divisible by 400: The year is divisible by 400.*/

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isLeapYear = true ;
        isLeapYear = checkLeapYear(year);

        System.out.println("Enter the year : ");

        if(isLeapYear){
            System.out.println("The year " + year +" is Leap Year.");
        }
        else{
            System.out.println("The year "+ year + " is not a leap year.");
        }
    }

    private static boolean checkLeapYear(int year) {
         if(year % 4 == 0   && year % 100 != 0){
             return true;
         }
         else if(year % 400 == 0){
             return true ;
         }
         else{
             return false ;
         }

    }
}
