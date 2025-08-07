package in.co.nmsworks.week1.day2;

   // write a program to compute quotient and remainder
public class Remainder {
    public static void main(String[] args) {
        int num1=14;
        int num2=2;
        FindRemainderQuotient(num1,num2);
    }
    public static void FindRemainderQuotient(int a, int b){
        int quotient=a/b;
        int remainder=a%b;
        System.out.println("Quotient :"+quotient);
        System.out.println("Remainder :"+remainder);
    }
}
