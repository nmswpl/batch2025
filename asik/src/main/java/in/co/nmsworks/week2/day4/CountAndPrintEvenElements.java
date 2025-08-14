package in.co.nmsworks.week2.day4;

//5. Given an array of integers, Write a Program to count and print number of even elements in the array.

public class CountAndPrintEvenElements
{
    static int count = 0;
    public static void main(String[] args)
    {

        int[] arr = {12, 3, 31, 8 ,79, 80, 22};
        printEvenElements(arr);
        System.out.println("No Of Even Elements Present in the Array : " + count);
    }

    public static void printEvenElements(int[] arr)
    {
        for(int i : arr)
        {
            if( i % 2 == 0 )
            {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
