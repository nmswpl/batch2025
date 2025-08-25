package in.co.nmsworks.week3.day5;

/* 1.Sum of 2D array:
Given a 2D array (matrix) of integers, write a Java program to find the sum of all the elements in the matrix.
Example:
Input:
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
Output:
The sum of all elements is: 45 */

import java.util.Scanner;

class TwoDarray{

    public int sumOfElementsFrom2dArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
        }
         return sum ;
    }
}


public class SumOfElementsFrom2dArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of the array :");
        int n = sc.nextInt();

        System.out.println("Enter the column size of the array : ");
        int m = sc.nextInt() ;

        int[][] input = new int[n][m];

        System.out.println("Enter the element of the array : ");


        for(int i = 0 ; i < input.length ; i++){
            for(int j = 0 ; j < input.length ; j++ ){
                input[i][j] = sc.nextInt();
            }
        }
        TwoDarray td = new TwoDarray();

       int sumOfElements =  td.sumOfElementsFrom2dArray(input);
       System.out.println("The sum of the elements in the 2d array is  : " + sumOfElements);
    }

}
