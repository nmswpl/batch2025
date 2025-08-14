package in.co.nmsworks.week2.day1.day4;

public class MinAndMaxElement {

    public static void main(String[] args) {

        int arr[] = new int[]{89, 7, 9, 30, 55, 33, 989, 66, 77, 78};
        minAndMax(arr);

    }
    public static void minAndMax(int arr[])
    {
        int min=arr[0];
        int max=0;
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("MINIMUM ELEMENT : "+min);
        System.out.println("MAXIMUM ELEMENT : "+max);
    }
}
