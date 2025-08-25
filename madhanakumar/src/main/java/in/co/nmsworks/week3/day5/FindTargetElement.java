package in.co.nmsworks.week3.day5;

import java.util.*;

public class FindTargetElement {
    public static void main(String[] args) {
        FindTargetElement findTargetElement = new FindTargetElement();
        findTargetElement.getPosition();
    }

    private void getPosition() {
        List<Integer> row1 = Arrays.asList(1,2,3);
        List<Integer> row2 = Arrays.asList(4,5,6);
        List<Integer> row3 = Arrays.asList(7,8,9);

        List< List<Integer>> matrix = new ArrayList<>();
        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);

        int target = 5;
        System.out.println("Target Element : "+target);
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                if (target == matrix.get(i).get(j)){
                    System.out.println("Element Found at the Index of ("+i+", "+j+")");
                }
            }
        }
    }
}
