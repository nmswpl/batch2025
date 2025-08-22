package in.co.nmsworks.week3.day5;

//Write a program to find the second largest number in an array.

import java.util.Scanner;

public class SecondLargestElementInAnArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = scan.nextInt();

        System.out.println("Enter the number in the array : ");

        int[] inputArray = new int[n];

        for(int i = 0 ; i < inputArray.length ; i++){
            inputArray[i] = scan.nextInt();
        }

        printSecondLargestInAnArray(inputArray);
    }

    private static void printSecondLargestInAnArray(int[] array) {
        int firstLargest = 0;
        int secondLargest = 0 ;

        if( array[0] > array[1]){
            firstLargest = array[0] ;
            secondLargest = array[1] ;
        }
        else{
            firstLargest = array[1];
            secondLargest = array[0] ;
        }

        for(int i = 2 ; i < array.length ; i++){
            if(array[i] > firstLargest){
                secondLargest = firstLargest ;
                firstLargest = array[i] ;
            }
            else if (array[i] > secondLargest ){
                secondLargest = array[i] ;
            }

        }
        System.out.println("The second largest element is : " + secondLargest);
    }
}
