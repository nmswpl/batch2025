package in.co.nmsworks.week3.day5.set1;

/**
 * Problem-5: Write a program to find the second largest number in an array.
 */
public class SecondLargestElement {
    public static void main(String[] args) {
        SecondLargestElement secondLargestElement = new SecondLargestElement();
        int [] inputArray = {3,5,7,1,6,8,2};
        secondLargestElement.printSecondLargestElement(inputArray);
    }

    private void printSecondLargestElement(int[] inputArray) {
        int maxElement = 0;
        int secondMaxElement = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > secondMaxElement){
                secondMaxElement = inputArray[i];
                if (secondMaxElement > maxElement){
                    int temp = maxElement;
                    maxElement = secondMaxElement;
                    secondMaxElement = temp;
                }
            }
        }
        System.out.println("Second Largest Element : "+secondMaxElement);;
    }
}
