package in.co.nmsworks.week1.test;

public class SquareElement {
    public static void main(String args[])
    {
        int arr1[] = {2,4,3,5};
        int square[]=new int[10];
        for(int i=0;i<arr1.length;i++)
        {
            square[i]=arr1[i]*arr1[i];
            System.out.print(square[i]+" ");
        }

    }
}
