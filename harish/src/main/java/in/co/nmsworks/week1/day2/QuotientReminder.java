/*) Write a program to compute Quotient and Remainder in Java
Output:
Quotient=6
Remainder=1*/
package in.co.nmsworks.week1.day2;

public class QuotientReminder {
    public static void main(String[] args) {
        int divisor = 5, divider = 3;
        System.out.println("The Quotient of the given number is :" + gEtQuotient(divisor,divider));
        System.out.println("The Reminder of the given number is :" + gEtReminder(divisor,divider));
    }
    public static int gEtQuotient(int divisor, int divider){
        return divisor/divider;
    }
    public static int gEtReminder(int divisor, int divider){
        return divisor%divider;
    }
}

