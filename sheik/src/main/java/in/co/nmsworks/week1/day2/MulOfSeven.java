package in.co.nmsworks.week1.day2;

public class MulOfSeven
{
    public static void main(String[] args)
    {
        int n = 8;
        PrintMultiples(n);
    }
    public static void PrintMultiples(int n)
    {
        for (int i = 1; i < 11; i++) {
            int mul = n * i;
            System.out.println(n + "*" + i + "=" + mul);
        }
    }
}
