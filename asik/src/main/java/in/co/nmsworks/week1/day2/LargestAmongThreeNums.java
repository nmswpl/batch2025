package in.co.nmsworks.week1.day2;

//5) Write a program to Find Largest Among Three numbers using if..else statement
public class LargestAmongThreeNums
{

    public static void main(String[] args)
    {

        int a = 25, b = 32, c = 90;
        printLargest(a, b, c);
    }

    public static void printLargest(int a, int b, int c)
    {
        if ( ( a > b ) && ( a > c) )
        {
            System.out.println("a is the largest among the three numbers");
        }
        else if ( (b > a) && ( b > c) )
        {
            System.out.println("b is the largest among the three numbers");
        }
        else
        {
            System.out.println("c is the largest among the three numbers");
        }
    }
}
