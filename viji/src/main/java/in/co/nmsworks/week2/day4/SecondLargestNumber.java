package in.co.nmsworks.week2.day4;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] array = new int[]{25,22,55, 56, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        secondLargestNumber(array);

    }

    public static void secondLargestNumber(int[] array) {
        Arrays.sort(array);
        System.out.println("Second Largest Number is " + array[array.length -2]);
    }


}
