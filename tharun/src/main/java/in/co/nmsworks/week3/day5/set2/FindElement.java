package in.co.nmsworks.week3.day5.set2;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Finding a Specific Element in a 2D List
 * Problem: Given a List<List<Integer>> representing a matrix of integers, find the position of a target element. If the element is not found, return -1.
 * Example:
 * matrix = [
 *     [1, 2, 3],
 *     [4, 5, 6],
 *     [7, 8, 9]
 * ]
 * target = 5
 * Output: "Found at (1, 1)"
 */
public class FindElement {
    public static void main(String[] args) {

        FindElement findElement = new FindElement();

        List<List<Integer>> matrix = findElement.createList();

        int target = 5;
        findElement.findElementIndex(matrix,target);
    }

    private void findElementIndex(List<List<Integer>> matrix, int target) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                if (target == matrix.get(i).get(j)){
                    System.out.println("Element found at (" + i + "," +  j +")");
                }
            }
        }
    }

    private List<List<Integer>> createList() {
        List<List<Integer>> matrix = new ArrayList<>();

        List<Integer> matrixRow1 = new ArrayList<>();
        matrixRow1.add(1);
        matrixRow1.add(2);
        matrixRow1.add(3);

        List<Integer> matrixRow2 = new ArrayList<>();
        matrixRow2.add(4);
        matrixRow2.add(5);
        matrixRow2.add(6);

        List<Integer> matrixRow3 = new ArrayList<>();
        matrixRow3.add(7);
        matrixRow3.add(8);
        matrixRow3.add(9);

        matrix.add(matrixRow1);
        matrix.add(matrixRow2);
        matrix.add(matrixRow3);

        return matrix;
    }
}
