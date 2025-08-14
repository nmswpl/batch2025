package in.co.nmsworks.week2.day4;

import java.util.Arrays;

public class MinMaxElement {

    public static void main(String[] args) {
        int[] element = {1,2,3,4,5};
        Arrays.sort(element);
        printMinAndMaxElement(element);
    }

    private static void printMinAndMaxElement(int[] element) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : element) {
            if(i > max ) {
                max =i ;
            }
            if ( i < min) {
                min = i;
            }
        }
        System.out.println("The Min Elements : "+ min + " The Max Elements : "+ max);
    }
}
