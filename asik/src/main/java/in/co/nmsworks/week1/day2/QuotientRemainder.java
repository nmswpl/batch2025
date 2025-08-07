package in.co.nmsworks.week1.day2;

//1) Write a program to compute Quotient and Remainder in Java
public class QuotientRemainder
{

    public static void main(String args[])
    {
        int a = 10;
        int b = 3;

        System.out.println("Quotient = " + quotient(a,b));
        System.out.println("Remainder = " + remainder(a,b));
    }

    public static int quotient(int a, int b)
    {
        return a/b;
    }

    public static int remainder(int a, int b)
    {
        return a%b;
    }

}
