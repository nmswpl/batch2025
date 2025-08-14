package in.co.nmsworks.week2.day4;

public class FactorialOfNumber
{
    public static void main(String[] args) {
        int num = 10;
        findFactorial(num);
    }

    public  static void findFactorial(int getNumber)
    {
        int result =1;
        for (int i = 1; i <= getNumber; i++)
        {
            result = result * i;
            int  ans =result;
            System.out.println("The factorial of " +getNumber+" is " + ans);
        }

    }
}
