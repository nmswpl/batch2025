package in.co.nmsworks.week1.test;

public class SquareOfEveryElement {

    public static void main(String[] args) {
        int arr[] = new int[]{2,4,3,5,};
        squareElements(arr);

    }
    public static void squareElements(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]*arr[i]+" ");
        }
    }
}
