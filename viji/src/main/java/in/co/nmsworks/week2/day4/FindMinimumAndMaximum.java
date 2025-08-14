/* 6. Implement the algorithm to find the min and max elements in an array of integers.
*/
package in.co.nmsworks.week2.day4;


import java.util.Arrays;

public class FindMinimumAndMaximum {
    public static void main(String[] args) {

        int[] array = new int[]{25,22,55, 56, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        minandMax(array);
    }

    public static void minandMax(int[] array){
        Arrays.sort(array);

        System.out.println("Maximum Element in an array : ");
        System.out.println(array[array.length - 1 ] );

        System.out.println("Minimum Element in an arary : ");
        System.out.println(array[0]);
    }

}
