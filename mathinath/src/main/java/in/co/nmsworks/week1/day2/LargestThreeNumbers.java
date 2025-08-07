package in.co.nmsworks.week1.day2;

// Write a program to Find Largest Among Three numbers using
//if..else statement

public class LargestThreeNumbers {

    public static void main(String args[])
    {
        new LargestThreeNumbers().largestNumber(1,2,3);
    }

    public void largestNumber(int a,int b,int c)
    {
        if(a >= b && a >= c)
        {
            System.out.println("A is greater");
        }
        else if (b >= a && b >= c)
        {
            System.out.println("B is greater");
        }
        else
        {
            System.out.println("C is greater");
        }
    }
}
