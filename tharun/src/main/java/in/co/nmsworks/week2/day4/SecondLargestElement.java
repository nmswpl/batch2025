package in.co.nmsworks.week2.day4;

/**
 * Write a program to find the second largest number in an array.
 */
public class SecondLargestElement {
    public static void secondLargestElement(int [] input){

        int largestNum = input[0] , secondLargest = 0 , temp;
        for (int i = 0 ; i < input.length ; i++){
            if (secondLargest < input[i] ){
                secondLargest = input[i];
                if (largestNum < secondLargest){
                    temp = largestNum;
                    largestNum = secondLargest;
                    secondLargest = temp;
                }
            }
        }
        System.out.println("Second Largest NUmber: " + secondLargest);

    }
    public static void main(String[] args) {
        secondLargestElement(new int[]{1,2,3,4,5,77});
    }
}