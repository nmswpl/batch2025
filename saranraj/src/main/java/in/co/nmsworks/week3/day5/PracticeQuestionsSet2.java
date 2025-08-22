package in.co.nmsworks.week3.day5;

import java.util.*;

public class PracticeQuestionsSet2 {
    public static void main(String[] args) {
        PracticeQuestionsSet2 pq = new PracticeQuestionsSet2();
        pq.calculateSumOfElementInArray();
        pq.trackAndPrintStudentGrades();
        pq.findSpecificElementInMatrix();
        pq.listOfElementInSpiralOrder();
        pq.groupTheStringOfAnagram();
        pq.findCommonElementInList();
        pq.calculateSumOfDiagonalInArray();
        pq.pairingElementFromTwoArray();
        pq.printHighestEmployeeHours();
    }

    private void printHighestEmployeeHours() {
        List<Integer> johnListOfHours = new ArrayList<>(Arrays.asList(8, 9, 7, 8));
        List<Integer> aliceListOfHours = new ArrayList<>(Arrays.asList(9, 9, 8, 9));
        List<Integer> bobListOfHours = new ArrayList<>(Arrays.asList(7, 8, 7, 7));
        int totalHoursOfJohnWork = 0;
        int totalHoursOfaliceWork = 0;
        int totalHoursOfBobWork = 0;

        for (int i : johnListOfHours) {
            totalHoursOfJohnWork += i;
        }
        for (int i : aliceListOfHours) {
            totalHoursOfaliceWork += i;
        }
        for (int i : bobListOfHours) {
            totalHoursOfBobWork += i;
        }
        Map<String, Integer> employeeAndWorkHours = new HashMap<>();
        employeeAndWorkHours.put("john", totalHoursOfJohnWork);
        employeeAndWorkHours.put("Alice", totalHoursOfaliceWork);
        employeeAndWorkHours.put("Bob", totalHoursOfBobWork);

        int maxHours = 0;
        for (Map.Entry<String, Integer> employee : employeeAndWorkHours.entrySet()) {
            if (employee.getValue() > maxHours) {
                maxHours = employee.getValue();
            }
        }
        for (Map.Entry<String, Integer> employee : employeeAndWorkHours.entrySet()) {
            if (employee.getValue() == maxHours) {
                System.out.println(employee.getKey() + " worked the most hours: " + employee.getValue() + " hours");
            }
        }
    }

    private void pairingElementFromTwoArray() {
        int[] arr = {1, 2, 3};
        int[] arr1 = {2, 3, 4};
        List<Integer[]> listOfElement = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr1.length;j++){
                if (((arr[i] + arr1[j]) % 2 )== 0) {
                    Integer[] value = {arr[i],arr1[j]};
                  listOfElement.add(value);
                }
            }
        }
        for (Integer[] i :listOfElement) {
            System.out.println(Arrays.toString(i));
        }
    }

    private void calculateSumOfDiagonalInArray() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == matrix[0][0]) {
                    sum += (matrix[i][j] * matrix[i][j] * matrix[i][j]);
                } else if (matrix[i][j] == matrix[0][2]) {
                    sum += (matrix[i][j] * matrix[i][j] * matrix[i][j]);
                } else if (matrix[i][j] == matrix[1][1]) {
                    sum += (matrix[i][j] * matrix[i][j] * matrix[i][j]);
                } else if (matrix[i][j] == matrix[2][0]) {
                    sum += (matrix[i][j] * matrix[i][j] * matrix[i][j]);
                } else if (matrix[i][j] == matrix[2][2]) {
                    sum += (matrix[i][j] * matrix[i][j] * matrix[i][j]);

                }
            }
        }
        System.out.println("Sum Of cube Of Diagonals : " + sum);
    }

    private void findCommonElementInList() {
        Map<Integer, Integer> countNoOfOccurances = new HashMap<>();
        int[][] matrix = {{1, 2, 3}, {2, 3, 4}, {2, 5, 6}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                countNoOfOccurances.put(matrix[i][j], countNoOfOccurances.getOrDefault(matrix[i][j], 0) + 1);
            }
        }
//        for (Map.Entry<Integer, Integer> commonElement : countNoOfOccurance.entrySet()) {
//            System.out.println(commonElement.getKey() + " " + commonElement.getValue());
//        }
        int maxcount = 0;
        for (int i : countNoOfOccurances.values()) {
            if (i > maxcount) {
                maxcount = i;
            }
        }
        for (Map.Entry<Integer, Integer> commonElement : countNoOfOccurances.entrySet()) {
            if (commonElement.getValue() == maxcount) {
                System.out.println("The Common Value : " + commonElement.getKey());
            }
        }

    }

    private void groupTheStringOfAnagram() {
        Map<String, List<String>> hashListOfAnagram = new HashMap<>();

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<String> listOfWords1 = new ArrayList<>();
        List<String> listOfWords2 = new ArrayList<>();
        List<String> listOfWords3 = new ArrayList<>();

        for (String word : words) {
            if (isAnagram("aet", word)) {
                listOfWords1.add(word);
                hashListOfAnagram.put("aet", listOfWords1);
            }
        }
        for (String word : words) {

            if (isAnagram("ant", word)) {
                listOfWords2.add(word);
                hashListOfAnagram.put("ant", listOfWords2);
            }
        }
        for (String word : words) {
            if (isAnagram("abt", word)) {
                listOfWords3.add(word);
                hashListOfAnagram.put("abt", listOfWords3);
            }
        }
        for (Map.Entry<String, List<String>> anagram : hashListOfAnagram.entrySet()) {
            System.out.println(anagram.getKey() + "->" + anagram.getValue());
        }


    }

    private boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            freq[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            freq[word2.charAt(i) - 'a']--;
        }

        for (int i : freq) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    private void listOfElementInSpiralOrder() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> listOfElement = new ArrayList<>();


        int n = matrix.length - 1;
        int m = matrix[0].length - 1;
        int top = 0;
        int bottom = n;
        int left = 0;
        int right = m;


        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                listOfElement.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                listOfElement.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    listOfElement.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    listOfElement.add(matrix[i][left]);
                }
            }

            left++;
        }
        System.out.println("The Spiral Element : " +listOfElement);
    }

    private void findSpecificElementInMatrix() {
        int target = 5;
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean found = false;
        int rowCount = 0;
        int columnCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    found = true;
                    rowCount = i;
                    columnCount = j;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Found at (" + rowCount + "," + columnCount + ")");
        } else {
            System.out.println("-1");
        }
    }

    private void trackAndPrintStudentGrades() {


        List<Integer> john = new ArrayList<>(Arrays.asList(85, 90, 88));
        List<Integer> alice = new ArrayList<>(Arrays.asList(90, 91, 92));
        List<Integer> bob = new ArrayList<>(Arrays.asList(70, 75, 80));

        int johnMarks = 0;
        int aliceMarks = 0;
        int bobMarks = 0;
        for (int i : john) {
            johnMarks += i;
        }
        for (int j : alice) {
            aliceMarks += j;
        }
        for (int k : bob) {
            bobMarks += k;
        }
        double johnAvg = (double) (johnMarks) / john.size();
        double aliceAvg = (double) (aliceMarks) / alice.size();
        double bobAvg = (double) (bobMarks) / bob.size();


        Map<String, Double> studentMarks = new HashMap<>();
        studentMarks.put("John", johnAvg);
        studentMarks.put("Alice", aliceAvg);
        studentMarks.put("Bob", bobAvg);
        double maxAvg = 0;
        for (double i : studentMarks.values()) {
            if (i > maxAvg) {
                maxAvg = i;
            }
        }

        for (Map.Entry<String, Double> studentMark : studentMarks.entrySet()) {
            System.out.println(studentMark.getKey() + ": Average = " + studentMark.getValue());

        }
        for (Map.Entry<String, Double> studentMark : studentMarks.entrySet()) {
            if (studentMark.getValue() == maxAvg) {
                System.out.println("Highest Average : " + studentMark.getKey() + "(" + studentMark.getValue() + ")");
            }
        }

    }

    private void calculateSumOfElementInArray() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("The Sum of All Element is : " + sum);

    }
}
