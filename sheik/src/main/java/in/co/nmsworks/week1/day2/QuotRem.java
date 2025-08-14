package in.co.nmsworks.week1.day2;

public class QuotRem
{
    public static void main(String[] args)
    {
        //Quotient and remainder
        int a = 12;
        int b = 3;
        int Quot = quotOfnum(a,b);
        System.out.println("Quot = " + Quot);
        int Rem = remOfnum(a,b);
        System.out.println("Rem = " + Rem);
    }
    public static int quotOfnum(int a , int b)
    {
            int quot = a/b;
            return quot;
    }
    public static int remOfnum(int a , int b)
    {
        int rem= a%b;
        return rem;
    }
}
