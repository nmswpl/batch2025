package in.co.nmsworks.week1.day2;

//1) Write a program to compute Quotient and Remainder in Java
//Output:
//Quotient=6
//Remainder=1

public class QuotientAndRemainder {
    public static void main(String[] args) {

        int n = 37;
        int n1 = 6;
        qAndr(n, n1);
    }

    public static void qAndr(int num, int num1) {
        System.out.println("Quotient :" + num/num1);
        System.out.println("Remainder :" + num%num1);
    }

}
