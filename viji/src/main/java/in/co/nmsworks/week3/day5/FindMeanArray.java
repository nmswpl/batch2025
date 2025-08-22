package in.co.nmsworks.week3.day5;

import java.util.Scanner;

/*  Write a program to find the mean of an array.
        The mean is the result of dividing the sum of the elements by the number of elements. */
public class FindMeanArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int n = scan.nextInt();

        System.out.println("Enter the number in the array : ");

        int[] inputArray = new int[n];

        for(int i = 0 ; i < inputArray.length ; i++){
            inputArray[i] = scan.nextInt();
        }

       int sumOfElements =  sumOfElements(inputArray);

        int length = inputArray.length ;

       int meanOfAnArray =  findMeanArray(sumOfElements, length);
       System.out.println("The mean of an array is " + meanOfAnArray);

    }


    private static int sumOfElements(int[] inputArray) {
        int sum = 0 ;
        for(int i = 0 ; i < inputArray.length ; i++){
            sum += inputArray[i] ;
        }
        return sum ;
    }

    private static int  findMeanArray(int sumOfElements , int length) {

         int answer = sumOfElements / length ;

         return answer ;
    }

}
