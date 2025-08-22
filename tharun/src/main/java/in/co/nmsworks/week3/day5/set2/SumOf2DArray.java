package in.co.nmsworks.week3.day5.set2;

/**
 * 1.Sum of 2D array:
 * Given a 2D array (matrix) of integers, write a Java program to find the sum of all the elements in the matrix.
 * Example:
 * Input:
 * matrix = [
 *     [1, 2, 3],
 *     [4, 5, 6],
 *     [7, 8, 9]
 * ]
 * Output:
 * The sum of all elements is: 45
 */
public class SumOf2DArray {
    public static void main(String[] args) {
        SumOf2DArray sum = new SumOf2DArray();
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("The sum of all elements is: "+sum.sumOfArray(matrix));
    }

    private int sumOfArray(int[][] matrix) {
        int count = 0 ;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                count += matrix[i][j];
            }
        }
        return count;
    }
}
