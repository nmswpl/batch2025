package in.co.nmsworks.week2.day4;

//6. Implement the algorithm to find the min and max elements in an array of integers.
public class MinAndMaxInTheArray
{
    int min, max;
    public static void main(String[] args)
    {
        int[] arr = {54, 24, 8, 98, 10, 15};
        new MinAndMaxInTheArray().printMinAndMaxInTheArray(arr);
    }

    public void printMinAndMaxInTheArray(int[] arr)
    {
        min = arr[0];
        max = arr[0];

        for( int i : arr )
        {
            min = min > i ? i : min;
            max = max < i ? i : max;
        }
        System.out.println("Min Element in the Array : + " + min);
        System.out.println("Max Element in the Array : + " + max);
    }
}
