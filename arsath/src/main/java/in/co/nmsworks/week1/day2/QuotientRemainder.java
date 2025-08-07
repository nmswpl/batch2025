package in.co.nmsworks.week1.day2;

public class QuotientRemainder {
    // Write a program to compute Quotient and Remainder in Java
    public static void quotientRemainder(int a,int b){
        System.out.println("Quotient: " + a/b);
        System.out.println("Remainder: " + a%b);
    }
    public static void main(String[] args) {
        int a = 37, b= 6;
        quotientRemainder(a,b);
    }
}
