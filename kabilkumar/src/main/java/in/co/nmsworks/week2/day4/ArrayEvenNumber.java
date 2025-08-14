package in.co.nmsworks.week2.day4;

public class ArrayEvenNumber
{
    public static void main(String[] args) {


        int[] arr = {1, 2, 4,6,3,};
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2 == 0)
            {
                System.out.println("The even numbers: " +arr[i]);
                count++;
            }
        }
        System.out.println("the total even numbers: " +count);
    }
}
