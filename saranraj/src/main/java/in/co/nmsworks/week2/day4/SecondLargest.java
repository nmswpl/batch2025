package in.co.nmsworks.week2.day4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargest {


    public static void main(String[] args) {
        int[] number = {2,3,4,5,6};
        Arrays.sort(number);
        printAndFindSecondLargestNumber(number);
    }

    private static void printAndFindSecondLargestNumber(int[] number) {
         int max = 0;
         int secondMax = 0;
         for(int num : number){
             if(num > max) {
                 secondMax = max;
                 max = num;
             }
             else if (num > secondMax && num < max) {
                  secondMax = max;
             }
         }
        System.out.println("The Second Largest Number : " + secondMax);
    }
}
