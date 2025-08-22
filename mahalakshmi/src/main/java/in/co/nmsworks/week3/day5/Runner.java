package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        MatrixAndObject matobj = new MatrixAndObject();

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = matobj.findSumOfMatrix(arr);
        System.out.println("The sum of all elements is: " + sum);

        Map<String,Integer[]> studGrades = new HashMap<>();
        studGrades.put("John",new Integer[]{85,90,88});
        studGrades.put("Alice",new Integer[]{90,91,92});
        studGrades.put("Bob",new Integer[]{70,75,80});
        matobj.trackingStudentGrades(studGrades);

        int target = 5;
        List<List<Integer>> mat = new ArrayList<>();
        List<Integer> list1;
        list1 = new ArrayList<>(List.of(1,2,3));
        mat.add(list1);
        List<Integer> list2;
        list2 = new ArrayList<>(List.of(4,5,6));
        mat.add(list2);
        List<Integer> list3;
        list3 = new ArrayList<>(List.of(7,8,9));
        mat.add(list3);
        int[] pos = matobj.retrieveElementIn2DArray(mat,target);
        System.out.println("Found at (" + pos[0] + ", " + pos[1] + ")");

        List<Integer> spiral = matobj.printSpiral(arr);
        for (Integer i : spiral) {
            System.out.println(i + "  ");
        }

        List<String> strList= new ArrayList<>(List.of("eat", "tea", "tan", "ate", "nat", "bat"));
        List<Integer> intList = matobj.printSpiral(arr);
        Map<String, List<String>> anagrams = matobj.groupAnagrams(strList);
        for (Map.Entry<String, List<String>> entry : anagrams.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        List<List<Integer>> elements = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>(List.of(1,2,3));
        List<Integer> l2= new ArrayList<>(List.of(2,3,4));
        List<Integer> l3 = new ArrayList<>(List.of(2,5,6));
        elements.add(l1);
        elements.add(l2);
        elements.add(l3);
        matobj.findCommonElement(elements);

        int diagonalSum = matobj.findSumOfDiagonal(arr);
        System.out.println("Sum of Cube of diagonals: " + diagonalSum);

        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,4};
        List<List<Integer>> paired = matobj.pairingElements(arr1,arr2);
        System.out.println(paired);

        matobj.buildEmployeeAttendance();

    }

}
