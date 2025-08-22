package in.co.nmsworks.week3.day5.set2;

/**
 * 7. Diagonal Sum of a Matrix
 * Problem: Write a program that computes the sum of the cube of the diagonals in a square matrix.
 * Example:
 * matrix = [
 *     [1, 2, 3],
 *     [4, 5, 6],
 *     [7, 8, 9]
 * ]
 * Output: Sum of Cube of diagonals = 1 + 125 + 729 + 27 + 343 = 1225
 * Hint: Use Math.pow
 */

public class DiagonalMatrix {
    public static void main(String[] args) {

        DiagonalMatrix diagonalMatrix = new DiagonalMatrix();
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        diagonalMatrix.sumOfDiagonalElements(matrix);
    }

    private void sumOfDiagonalElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j){

                    sum += Math.pow(matrix[i][j],3);

                }
                else if (((matrix.length -1) - i) == j){

                    sum += Math.pow(matrix[i][j],3);

                }
            }

        }
        System.out.println("Sum of Cube of diagonals = " + sum);
    }
}
