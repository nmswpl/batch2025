package in.co.nmsworks.week2.day4;

public class CountAndPrint {
    public static void main(String[] args) {
        int arr[]=new int[] {1,2,5,3,4};
        int count = 0;
        System.out.println("The even elements are :");
        for(int i=0;i<arr.length;i++)
        {
            count++;
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println("the count is "+count);
    }
}
