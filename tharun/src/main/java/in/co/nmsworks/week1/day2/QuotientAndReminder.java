package in.co.nmsworks.week1.day2;

/**
 * Write a program to compute Quotient and Remainder in Java
 * Output:
 * Quotient=6
 * Remainder=1
 */

public class QuotientAndReminder {
    static void arithmeticOperator(int value,int divisor){
        System.out.println("Quotient of "+value+" divided by "+divisor+" is "+value/divisor);
        System.out.println("Reminder of "+value+" divided by "+divisor+" is "+value%divisor);

    }
    public static void main(String[] args) {
        int value=13;
        int divisor=2;
        arithmeticOperator(value,divisor);

    }
}
