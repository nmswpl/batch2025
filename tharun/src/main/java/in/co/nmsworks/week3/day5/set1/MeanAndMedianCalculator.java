package in.co.nmsworks.week3.day5.set1;

import java.util.Arrays;

/**
 * Problem-8: Write a program to find the mean of an array.
 *         The mean is the result of dividing the sum of the elements by the number of elements.
 *
 * Problem-9: Write a program to find the median of an array.
 *         If the number of elements is odd, the median is the middle element.
 *         If the number of elements is even, the median is the average of the two middle elements.
 */

public class MeanAndMedianCalculator {
    public static void main(String[] args) {
        MeanAndMedianCalculator meanMedianCalculator = new MeanAndMedianCalculator();
        int [] inputArray = {2,4,1,3,5};
        System.out.println("Mean of given array : "+meanMedianCalculator.calculateMean(inputArray));
        System.out.println("Median of given array : "+meanMedianCalculator.calculateMedian(inputArray));
    }

    private int calculateMedian(int[] inputArray) {
        Arrays.sort(inputArray);
        int median ;
        int middleIndex = (inputArray.length)/2;
        if (inputArray.length % 2 ==0){
            median = (inputArray[middleIndex-1] + inputArray[middleIndex])/2;
            return median;
        }
        median = inputArray[middleIndex];
        return median;
    }

    private int calculateMean(int[] inputArray) {
        int mean  , divided = 0;
        int divisor = inputArray.length;
        for (int i : inputArray) {
            divided += i;
        }
        mean = divided / divisor;
        return mean;
    }
}
