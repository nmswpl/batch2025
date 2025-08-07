package in.co.nmsworks.week1.day2;
public class QuotientRemainder {

    // 1) Write a program to compute Quotient and Remainder in Java
    public static void main(String[] args) {
        int a = 100, b = 40;
        int c = 31, d = 5;
        computeQR(a,b);
        computeQR(c,d);
    }

    public static void computeQR(int a , int b) {
        System.out.println("Quotient = " + (a / b));
        System.out.println("Remainder = " + (a % b));
    }
}
