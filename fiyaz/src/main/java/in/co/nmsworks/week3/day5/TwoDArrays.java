package in.co.nmsworks.week3.day5;

import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        TwoDArrays twoDArrays = new TwoDArrays();

//        question 1
        twoDArrays.sumOfAllElement(new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        });

//        question 2
        Map<String, List<Integer>> students = new HashMap<>();
        students.put("John", Arrays.asList(85, 90, 88));
        students.put("Alice", Arrays.asList(90, 91, 92));
        students.put("Bob", Arrays.asList(70, 75, 80));
          twoDArrays.averageGrades(students);

//          question 3
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1, 2, 3));
        matrix.add(Arrays.asList(4, 5, 6));
        matrix.add(Arrays.asList(7, 8, 9));
        String ans = twoDArrays.findTargetNum(matrix,5);
        System.out.println(ans);

//        question 9
        Map<String, List<Integer>> trackingEmployeeHours = new HashMap<>();
        trackingEmployeeHours.put("John", Arrays.asList(8,9,7,8));
        trackingEmployeeHours.put("Alice", Arrays.asList(9,9,8,9));
        trackingEmployeeHours.put("Bob", Arrays.asList(7,8,7,7));
        twoDArrays.trackHours(trackingEmployeeHours);

//        question 6
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,2,3));
        list.add(Arrays.asList(2,3,4));
        list.add(Arrays.asList(2,5,6));
        twoDArrays.findCommonElement(list);

//        question 5
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        twoDArrays.sortedVersion(input);

//        question 7
        twoDArrays.findTheDiagonalCube(new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        });


    }

    private void findTheDiagonalCube(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(matrix[i][i], 3);
            if (i != n - 1 - i) {
                sum += Math.pow(matrix[i][n - 1 - i], 3);
            }
        }
        System.out.println(sum);
    }


    private void sortedVersion(String[] input) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : input) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        System.out.println(map);
    }


    private void findCommonElement(List<List<Integer>> list) {

        Map<Integer, Integer> countMap = new HashMap<>();
        int totalLists = list.size();

        for (List<Integer> list1 : list) {
            Set<Integer> unique = new HashSet<>(list1);
            for (int num : unique) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == totalLists) {
                result.add(entry.getKey());
            }
        }
        System.out.println(result);
    }

    private void trackHours(Map<String, List<Integer>> trackingEmployeeHours) {

        String topEmployee = "";
        int maxHours = 0;

        for (Map.Entry<String, List<Integer>> entry : trackingEmployeeHours.entrySet()) {
            int total = entry.getValue().stream().mapToInt(Integer::intValue).sum();
            if (total > maxHours) {
                maxHours = total;
                topEmployee = entry.getKey();
            }
        }

        System.out.println(topEmployee + " worked the most hours: " + maxHours + " hours");

    }

    private void averageGrades(Map<String, List<Integer>> students) {
        String topStudent = "";
        double highestAvg = Double.MIN_VALUE;

        for (Map.Entry<String, List<Integer>> entry : students.entrySet()) {
            String name = entry.getKey();
            List<Integer> grades = entry.getValue();

            double sum = 0;
            for (int g : grades) {
                sum += g;
            }
            double avg = sum / grades.size();

            System.out.printf(" Average :: " +  name + avg);

            if (avg > highestAvg) {
                highestAvg = avg;
                topStudent = name;
            }
        }

        System.out.printf("Highest Average :: " +  topStudent + highestAvg);
    }



    private String findTargetNum(List<List<Integer>> matrix, int target) {

        for (int i = 0; i < matrix.size(); i++) {
            List<Integer> row = matrix.get(i);
            for (int j = 0; j < row.size(); j++) {
                if (row.get(j) == target) {
                    return "Found at (" + i + ", " + j + ")";
                }
            }
        }
        return "-1";

    }


    private void sumOfAllElement(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int sum = 0;

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                sum = sum + matrix[i][j];
            }
        }

        System.out.println("The sum of all elements is :: " + sum);
    }
}