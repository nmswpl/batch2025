package in.co.nmsworks.week3.day5;

import java.util.Scanner;

/* Write a program to find the median of an array.
        If the number of elements is odd, the median is the middle element.
        If the number of elements is even, the median is the average of the two middle elements.*/

public class MedianOfAnArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = scan.nextInt();

        System.out.println("Enter the number in the array : ");

        int[] inputArray = new int[n];

        for(int i = 0 ; i < inputArray.length ; i++){
            inputArray[i] = scan.nextInt();
        }

        int length = inputArray.length ;

        medianOfAnArray(inputArray ,length);

    }

    private static void medianOfAnArray(int[] inputArray , int length ) {
        if(length % 2 != 0){
            System.out.println( "The median of the array is " + inputArray[length /  2] );
        }
        else{
          int ans =  ( inputArray[length / 2 ] + inputArray[(length /2 ) - 1] ) / 2 ;
          System.out.println("The median of the array is " + ans);
        }
    }
}
