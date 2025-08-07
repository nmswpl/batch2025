package in.co.nmsworks.week1.day2;

// 1.Write a program to compute Quotient and Remainder in Java
//Output:
//Quotient=6
//Remainder=1

public class QuotientAndRemainder {


    public static void findQuotientAndRemainder(int dividend, int divisor) {
        int quotient = 0, remainder = 0;
        if (divisor == 0) {
            System.out.println("Divisor can't be a zero");
        } else {
            quotient = dividend / divisor;
            remainder = dividend % divisor;
        }
        System.out.println("quotient =" + quotient + " remainder = " + remainder);
    }

    public static void main(String[] args) {
        int dividend = 10, divisor = 5;

        findQuotientAndRemainder(dividend, divisor);




    }
}
