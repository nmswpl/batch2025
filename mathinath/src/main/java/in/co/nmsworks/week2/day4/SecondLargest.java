package in.co.nmsworks.week2.day4;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]=new int[] {1,2,5,3,4};
        int maximum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maximum)
            {
                maximum=arr[i];
            }
        }
        int secMax=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<maximum && arr[i]!=maximum)
            {
                secMax=arr[i];
            }
        }
        System.out.println("The Second Largest is :"+secMax);



    }
}
