package in.co.nmsworks.week2.day4;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        int arr[]=new int[] {1,2,5,3,4};
        int minimum=arr[0];
        int maximum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<minimum)
            {
                minimum=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maximum)
            {
                maximum=arr[i];
            }
        }
        System.out.println("The minimum element is "+minimum);
        System.out.println("The maximum element is "+maximum);

    }
}
