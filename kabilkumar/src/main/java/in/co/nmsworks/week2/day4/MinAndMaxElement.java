package in.co.nmsworks.week2.day4;

public class MinAndMaxElement
{
    public static void main(String[] args) {
        int [] arr ={1,2,77,4,};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
            if (arr[i] < smallest )
            {
                smallest = arr[i];
            }

        }
        System.out.println("Maximum number :"+largest);
        System.out.println("Minimum number : "+smallest);
    }
}
