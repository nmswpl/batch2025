package in.co.nmsworks.week3.day5.set2;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Spiral Matrix
 * Problem: Given an n x n 2D matrix, return a list of the elements of the matrix in spiral order.
 * Example:
 * matrix = [
 *     [1, 2, 3],
 *     [4, 5, 6],
 *     [7, 8, 9]
 * ]
 * Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
 */

public class SpiralMatrix {
    public static void main(String[] args) {

        SpiralMatrix spiralMatrix = new SpiralMatrix();

        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer> matrixList = spiralMatrix.listCreation(matrix);
        System.out.println(matrixList);
    }

    private List<Integer> listCreation(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
        }

        return list;
    }
}
