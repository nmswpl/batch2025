package in.co.nmsworks.week2.day1.day4;

public class SecondLargestInAnArray {

    public static void main(String[] args) {

        int arr[] = new int[]{89, 7, 9, 30, 55, 33, 989, 66, 77, 78};
        secondlargest(arr);
    }

    public static void secondlargest(int arr[])
    {
        int firstMax=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>firstMax)
                firstMax=arr[i];
        }
        int secondMax=arr[0];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>secondMax && arr[i]!=firstMax)
            {
                secondMax=arr[i];
            }
        }
        System.out.println(secondMax);
    }

}
