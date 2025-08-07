package in.co.nmsworks.week1.day2;

//4) Factorial Program in Java
public class Factorial
{
    public static void main(String[] args)
    {
        int n = 5;
        fact(n);
    }

    public static void fact(int n)
    {
        int ans = 1;
        for(int i = n; i > 0; i--)
        {
            ans *= i;
        }
        System.out.println("Factorial of " + n + " is " + ans);
    }
}
