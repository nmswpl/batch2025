package in.co.nmsworks.week2.day4;

/**
 * Given an array of integers, Write a Program to count and print number of even elements in the array.
 */
public class CountAndPrintEvenNumbers {
    public static void countAndPrintEvenNumbers(int[] input){
        int count=0;
        for (int i = 0 ; i < input.length ; i++){
            if(input[i]%2 == 0){
                System.out.print(input[i] + "\t");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count : "+count);
    }
    public static void main(String[] args) {
        countAndPrintEvenNumbers(new int[]{3, 5, 6, 7, 1, 9, 10, 4});
    }
}
