package in.co.nmsworks.week1.day2.basicprograms;

/*
Write a program to compute Quotient and Remainder in Java
Output:
Quotient=6
Remainder=1
 */
public class QuotientAndRemainder {
    public static void main(String[] args) {
        int x = 12, y= 5;
        int u = 18, v = 6;
        System.out.println("Quotient =" +getQuotient(x,y));
        System.out.println("Remainder = " +getRemainder(x,y));
        System.out.println("Quotient =" +getQuotient(u,v));
        System.out.println("Remainder = "+getRemainder(u,v));
    }

    public static int getQuotient(int a, int b){
        return a / b;
    }
    public static int getRemainder(int a, int b){
        return a % b;
    }
}
