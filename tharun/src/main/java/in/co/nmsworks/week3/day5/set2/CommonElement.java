package in.co.nmsworks.week3.day5.set2;

import java.util.*;

/**
 * 6. Finding Common Elements
 * Problem: Given a list of lists of integers, find the common elements across all lists.
 * Example:
 * lists = [
 *     [1, 2, 3],
 *     [2, 3, 4],
 *     [2, 5, 6]
 * ]
 * Output: [2]
 */

public class CommonElement {
    public static void main(String[] args) {
        CommonElement commonElement = new CommonElement();

        List<List<Integer>> lists = commonElement.createList();
        System.out.println(lists);
        
        commonElement.printCommonElement(lists);

    }

    private void printCommonElement(List<List<Integer>> lists) {

        Map<Integer,Integer> elements = new HashMap<>();

        for (List<Integer> list : lists) {
            for (Integer number : list) {
                elements.put(number,elements.getOrDefault(number,0)+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
            if (entry.getValue() == lists.size()){
                System.out.println("Common Element is each row : "+entry.getKey());
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
        matrixRow2.add(2);
        matrixRow2.add(3);
        matrixRow2.add(4);

        List<Integer> matrixRow3 = new ArrayList<>();
        matrixRow3.add(2);
        matrixRow3.add(5);
        matrixRow3.add(6);

        matrix.add(matrixRow1);
        matrix.add(matrixRow2);
        matrix.add(matrixRow3);

        return matrix;
    }

}
