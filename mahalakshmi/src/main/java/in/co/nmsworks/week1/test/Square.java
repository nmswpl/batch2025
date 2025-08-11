// 1. Write a program to print the square of every element present in the array
package in.co.nmsworks.week1.test;
public class Square {
    public static void main(String[] args) {
        int[] arr1 = {2,4,3,5};
        int[] result = printSqaure(arr1);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] printSqaure(int[] arr) {
        int[] res = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++) {
            res[i] = arr[i] * arr[i];
        }
        return res;
    }
}
