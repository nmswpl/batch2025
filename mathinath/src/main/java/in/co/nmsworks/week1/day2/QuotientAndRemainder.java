package in.co.nmsworks.week1.day2;

//1) Write a program to compute Quotient and Remainder in Java
//Output:
//Quotient=6
//Remainder=1

public class QuotientAndRemainder{
    public static void main(String[] args)
    {
        new QuotientAndRemainder().printQuotientAndRemainder(10,2);

    }
    public void printQuotientAndRemainder(int a,int b)
    {
        int quot=a/b;
        int rem=a%b;
        System.out.println("Quotient : "+quot);
        System.out.println("Remainder : "+rem);
    }
}
