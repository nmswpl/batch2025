package in.co.nmsworks.week1.day2;

// Factorial Program in java

public class Factorial {

    public static void main(String[] args)
    {
        int n = 6;
        int f = findFact(n);
        System.out.println("Factorial for " + n + " : " + f);
    }

    public static int findFact(int n)
    {
        if( n == 1 )
        {
            return 1;
        }
        else
        {
            return n*findFact(n - 1);
        }
    }
}
