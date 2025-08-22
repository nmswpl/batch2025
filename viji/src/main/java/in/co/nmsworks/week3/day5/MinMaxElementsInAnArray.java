package in.co.nmsworks.week3.day5;

import java.util.Scanner;

public  class MinMaxElementsInAnArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] inputArray = new int[n];

        for(int i = 0 ; i < inputArray.length ; i++){
            inputArray[i] = scan.nextInt();
        }

        int minElement = minElementInArray(inputArray);
        System.out.println("The minimum element in anarray is :" + minElement);

        int maxElement = maxElementInArray(inputArray);
        System.out.println("The maximum element in an array is : "+ maxElement);

    }

    private static int minElementInArray(int[] inputArray) {

        int min = inputArray[0];
        for(int i =1 ; i < inputArray.length ; i++){
            if( inputArray[i] < min ){
                min = inputArray[i] ;
            }
        }
        return min;
    }
    private static int maxElementInArray(int[] inputArray) {

        int max = inputArray[0];
        for(int i =1 ; i < inputArray.length ; i++){
            if( inputArray[i] > max ){
                max = inputArray[i] ;
            }
        }
        return max;
    }
}

