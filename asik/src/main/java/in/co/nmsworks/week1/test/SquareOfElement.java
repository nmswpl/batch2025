package in.co.nmsworks.week1.test;

public class SquareOfElement
{
    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 3, 5};
        squareElements(arr);
    }

    public static void squareElements(int[] arr)
    {
        int[] result =  new int[arr.length];
        int index = 0;
        for(int i : arr)
        {
            result[index++] = i * i;
        }

        for(int i : result)
        {
            System.out.print(i + " ");
        }
    }
}
