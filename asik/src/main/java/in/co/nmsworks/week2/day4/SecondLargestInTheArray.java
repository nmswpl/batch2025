package in.co.nmsworks.week2.day4;

//7. Write a program to find the second largest number in an array.
public class SecondLargestInTheArray
{
    public static void main(String[] args)
    {
        int[] arr = {25, 68, 12, 55, 90, 10};
        new SecondLargestInTheArray().printSecondLargestElementInTheArray(arr);
    }

    public void printSecondLargestElementInTheArray(int[] arr)
    {
        int firstLargestElement = arr[0];
        int secondLargestElement = arr[0];
        for( int i : arr)
        {
            if( firstLargestElement < i )
            {
                secondLargestElement = firstLargestElement;
                firstLargestElement = i;
            }
            else if ( i < firstLargestElement && i > secondLargestElement )
            {
                secondLargestElement = i;
            }
        }
        System.out.println("Second Largest Element In The Array : " + secondLargestElement);
    }
}
