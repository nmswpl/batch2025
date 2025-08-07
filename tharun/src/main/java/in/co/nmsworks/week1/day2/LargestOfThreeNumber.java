package in.co.nmsworks.week1.day2;

/**
 *
 * Factorial Write a program to Find Largest Among Three numbers using if..else statement
 *
 */

public class LargestOfThreeNumber {
    static void largestNumber(int number1,int number2,int number3){
        if(number1>=number2 && number1>= number3){
            System.out.println("Number1 is greater than others");
        }
        else if (number2>=number1 && number2 >= number3) {
            System.out.println("Number2 is greater than others");

        }
        else{
            System.out.println("Number3 is greater than others");
        }
    }
    public static void main(String[] args) {
        largestNumber(25,16,30);

    }
}
