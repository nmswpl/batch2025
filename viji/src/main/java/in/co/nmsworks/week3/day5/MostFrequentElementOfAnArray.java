package in.co.nmsworks.week3.day5;


/* Write a program to find the mode (most frequent element) of an array.

    For e.g : [4,7,7,7,1,1,8]
        Count the Frequency:
            4 appears 1 time
            7 appears 3 times
            1 appears 2 times
            8 appears 1 time
        Identify the Most Frequent Element: 7 is the most frequent with 3 occurrences.
        Mode: The mode is 7. */

import java.util.Arrays;

public class MostFrequentElementOfAnArray {
    public static void main(String[] args) {
        int[] array = { 4, 7, 7, 7 ,1 ,1 , 8};
        modeOfAnArray(array);
    }

    private static void modeOfAnArray(int[] array) {

        int count ;
        int elementCount = 0;
        int frequentElement = 0;
        int n ;
        for(int i = 0 ; i < array.length ; i++){
            count = 0 ;
            for(int j = 1 ; j < array.length ; j++ ) {
                if (array[i] == array[j]) {
                    count++;
                    frequentElement = array[i];
                }
                else{
                    break;
                }
                if(elementCount < count) {
                    elementCount = count;
                    n = frequentElement;
                }
            }
        }
        System.out.println("The most frequent Element : " + frequentElement + " with "+elementCount + " occurences");
    }
}
