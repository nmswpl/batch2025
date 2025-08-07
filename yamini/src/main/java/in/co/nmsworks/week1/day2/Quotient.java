//Write a program to compute Quotient and Remainder in Java


package in.co.nmsworks.week1.day2;

public class Quotient {
    public static void main(String[] args) {
        quotient(37 , 6);
    }

    public static void quotient(int a, int b) {

        System.out.println("Quotient " + a / b);
        System.out.println("Remainder " + a % b);

    }
}
