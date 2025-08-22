package in.co.nmsworks.week3.day5;

import java.util.Collections;

import static java.util.Collections.*;

public class MedianCalculator {

    public static void main(String[] args) {

        MedianCalculator mc = new MedianCalculator();

        mc.printMedianOfAnArray(new int[]{10,20,30,40,50});
        mc.printMedianOfAnArray(new int[]{10,20,30,40,50,60});
    }

    private void printMedianOfAnArray(int[] numbers) {

        if((numbers.length % 2) == 0){
            System.out.println("Median of an array is : " + (numbers[numbers.length/2]));
        }
        else{
            float median = (float) (numbers[(numbers.length / 2) + 1] + numbers[numbers.length / 2]) / 2;
            System.out.println("Median of an array is : " + median);
        }
    }
}
