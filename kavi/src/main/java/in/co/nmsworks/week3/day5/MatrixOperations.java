package in.co.nmsworks.week3.day5;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class MatrixOperations {

    public static void sumOf2DArray() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("sum of element is" + sum);
    }


    public static void findElementPosition(List<List<Integer>> matrix, int target) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                if (matrix.get(i).get(j) == target) {
                    System.out.println("Found at"+ i + " " + j);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
    public static void trackStudentGrades() {
        Map<String, int[]> students = new LinkedHashMap<>();
        students.put("John", new int[]{85, 90, 88});
        students.put("Alice", new int[]{90, 91, 92});
        students.put("Bob", new int[]{70, 75, 80});

        String highestAvgStudent = "";
        double highestAvg = 0;

        for (Map.Entry<String, int[]> entry : students.entrySet()) {
            String name = entry.getKey();
            int[] grades = entry.getValue();

            int sum = 0;
            for (int grade : grades) {
                sum +=grade;
            }

            double average = (double) sum / grades.length;
            int temp = (int) (average * 100);
            double roundedAvg = temp / 100.0;

            System.out.println(name + "Average" + roundedAvg);

            if (average > highestAvg) {
                highestAvg = average;
                highestAvgStudent = name;

            }

        }
        int tempHighest = (int) (highestAvg * 100);
        double roundedHighestAvg = tempHighest / 100.0;

        System.out.println("Highest Average" +highestAvgStudent +roundedHighestAvg );
    }

    public static void spiralOrderTraversal() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }
        System.out.println("Spiral Order" + result);
    }

    public static void groupAnagrams() {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);


            if (map.containsKey(sorted)) {
                map.get(sorted).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sorted, list);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
    public static void findCommonElements() {
        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);

        List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(5);
        list3.add(6);

        lists.add(list1);
        lists.add(list2);
        lists.add(list3);


        Set<Integer> commonElements = new HashSet<>(lists.get(0));

        for (int i = 1; i < lists.size(); i++) {
            commonElements.retainAll(lists.get(i));
        }

        System.out.println("Common elements" + commonElements);
    }
    public static void sumOfCubeOfDiagonals() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int primary = matrix[i][i];
            int secondary = matrix[i][n-1-i];

            sum += primary * primary * primary;

            if (i != n-1-i) {
                sum += secondary * secondary * secondary;
            }
        }
        System.out.println("Sum of Cube of diagonals" + sum);
    }
    public static void pairEvenSumElements() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 4};

        List<String> pairs = new ArrayList<>();

        for (int a : arr1) {
            for (int b : arr2) {
                if ((a + b) % 2 == 0) {
                    pairs.add("(" + a + ", " + b + ")");
                }
            }
        }

        System.out.println("Pairs with even sum" + pairs);
    }
    public static void trackEmployeeHours() {
        Map<String, List<Integer>> employees = new LinkedHashMap<>();

        List<Integer> johnHours = new ArrayList<>();
        johnHours.add(8);
        johnHours.add(9);
        johnHours.add(7);
        johnHours.add(8);
        employees.put("John", johnHours);

        List<Integer> aliceHours = new ArrayList<>();
        aliceHours.add(9);
        aliceHours.add(9);
        aliceHours.add(8);
        aliceHours.add(9);
        employees.put("Alice", aliceHours);

        List<Integer> bobHours = new ArrayList<>();
        bobHours.add(7);
        bobHours.add(8);
        bobHours.add(7);
        bobHours.add(7);
        employees.put("Bob", bobHours);

        String topEmployee = "";
        int maxHours = 0;

        for (Map.Entry<String, List<Integer>> entry : employees.entrySet()) {
            String name = entry.getKey();
            List<Integer> hours = entry.getValue();

            int total = 0;
            for (int h : hours) {
                total += h;
            }

            if (total > maxHours) {
                maxHours = total;
                topEmployee = name;
            }
        }

        System.out.println(topEmployee + " worked the most hours" + maxHours + " hours");
    }


    public static void main(String[] args) {
        sumOf2DArray();
        trackStudentGrades();

        List<List<Integer>> matrix = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        List<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);

        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);

        int target = 10;
        findElementPosition(matrix,target);
        spiralOrderTraversal();
        groupAnagrams();
        findCommonElements();
        sumOfCubeOfDiagonals();
        pairEvenSumElements();
        trackEmployeeHours();


    }
}
