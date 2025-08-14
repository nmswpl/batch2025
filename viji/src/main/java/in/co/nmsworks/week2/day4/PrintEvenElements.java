/* 5. Given an array of integers, Write a Program to count and print number of even elements in the array.
 */
package in.co.nmsworks.week2.day4;

public class PrintEvenElements {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       countAndPrintEvenNumbers(array);

    }
    public static void countAndPrintEvenNumbers(int array[]){
        int count = 0;
        for(int i = 0 ; i < array.length ; i++ ){
            if( array[i] % 2 == 0){
                System.out.print(array[i]+ " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);

    }
}
