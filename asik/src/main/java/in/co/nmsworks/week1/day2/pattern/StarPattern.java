package in.co.nmsworks.week1.day2.pattern;

/*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     * * * * * * *
*/

public class StarPattern
{
    public static void main(String[] args) {
        int n = 7;
        printStar(n);
    }

    public static void printStar(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
