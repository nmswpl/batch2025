package in.co.nmsworks.week3.day5;

import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        Arrays.sort(numbers);

        double median;
        int n = numbers.length;

        if (n%2==1) {

            median = numbers[n/2];
        } else {
            median = (numbers[n/2 -1] + numbers[n/2]) / 2.0;
        }
        System.out.println("median of the array is" + median);
    }
}

