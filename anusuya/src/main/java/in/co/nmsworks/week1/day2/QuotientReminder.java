package in.co.nmsworks.week1.day2;

/*Write a program to compute Quotient and Remainder in Java
Output:
Quotient=6
Remainder=1*/

public class QuotientReminder {

    static void printQuotientRemainder(int num1, int num2){
        int quo = num1/num2;
        int rem = num1 % num2 ;
        System.out.println("Quotient : " + quo);
        System.out.println("Remainder : " + rem);
    }

    public static void main(String[] args) {
        int num1 = 37;
        int num2 = 6;
        printQuotientRemainder(num1, num2);
    }
}
