package in.co.nmsworks.week1.test;

public class DivisibleBy3
{
    public static void main(String[] args) {
        int start = 300, end = 400;
        printNumbersDivisibleBy3(start, end);
    }

    public static void printNumbersDivisibleBy3(int start, int end)
    {
        for(int i = start + 1; i < end; i++)
        {
            if(i % 3 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
