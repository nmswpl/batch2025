package in.co.nmsworks.week2.day4;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,4,6,3,8,20,13,25};
        findSecondLargestNumber(arr);
    }

    public static void findSecondLargestNumber(int[] arr) {


        int maxNumber = arr[0];
        int secondLargestNumber = 0;
        for (int i = 1 ; i < arr.length ; i++)
        {

            if (arr[i] > maxNumber ){
                secondLargestNumber = maxNumber;
                maxNumber = arr[i];

            }
            else if (arr[i] < maxNumber && arr[i] > secondLargestNumber){

                secondLargestNumber = arr[i];
            }
        }

        System.out.println("Second Largest number :" + secondLargestNumber);
    }
}
