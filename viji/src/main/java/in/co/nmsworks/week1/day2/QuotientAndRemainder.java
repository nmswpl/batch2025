
/*
Write a program to compute Quotient and Remainder in Java
Output:
Quotient=6
Remainder=1
 */
package in.co.nmsworks.week1.day2;

public class QuotientAndRemainder{

    public static void main(String[] args){
         quotientRemainder(19,3);
    }

    public static void quotientRemainder(int a,int b){
        System.out.println("Quotient = "+(a/b));
        System.out.println("Remainder = "+(a%b));
    }

}



