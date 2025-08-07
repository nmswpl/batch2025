package in.co.nmsworks.week1.day2;

//4) Factorial Program in Java

public class Factorial {
    public static void main(String args[])
    {
        new Factorial().fact(5);
    }
    public void fact(int a)
    {
        int fact=1;
        for(int i=a;i>0;i--)
        {
            fact=fact * i;
        }
        System.out.println("Factorial of 5 is : "+fact);
    }
}
