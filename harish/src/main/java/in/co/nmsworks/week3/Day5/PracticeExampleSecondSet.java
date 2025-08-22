package in.co.nmsworks.week3.Day5;

import javax.crypto.spec.PSource;
import java.util.*;

public class PracticeExampleSecondSet {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        PracticeExampleSecondSet functionCall = new PracticeExampleSecondSet();
        functionCall.sumOfElementsInTwoDArray(matrix);

        int[] jhonGrade = {85,90,88};
        int[] aliceGrade = {90,91,92};
        int[] bobGrade = {70,75,80};
        Students john = new Students("Jhon",jhonGrade);
        Students alice = new Students("Alice",aliceGrade);
        Students bob = new Students("Bob",bobGrade);
        List<Students> students = new ArrayList<>();
        students.add(john);
        students.add(alice);
        students.add(bob);
        functionCall.printAverageGradeOfEachStudentAndHighestAverage(students);

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        firstRow.add(2);
        firstRow.add(3);
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(4);
        secondRow.add(5);
        secondRow.add(6);
        List<Integer> thirdRow = new ArrayList<>();
        thirdRow.add(7);
        thirdRow.add(8);
        thirdRow.add(9);
        List<List<Integer>> rows = new ArrayList<>();
        rows.add(firstRow);
        rows.add(secondRow);
        rows.add(thirdRow);
        functionCall.searchElemen(rows,5);

        List<Integer> spiralMatrix = functionCall.spiralOrder(matrix);
        System.out.println(spiralMatrix);

        String[] words ={"eat","tea","tan","ate","nat","bat"};
        Map<String,String[]> stringMap = functionCall.anagarams(words);

        List<List<Integer>> integers = new ArrayList<>();

        List<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        List<Integer> integers2 = new ArrayList<>();
        integers2.add(2);
        integers2.add(3);
        integers2.add(4);
        List<Integer> integers3 = new ArrayList<>();
        integers3.add(2);
        integers3.add(5);
        integers3.add(6);
        integers.add(integers2);
        integers.add(integers1);
        integers.add(integers3);
        functionCall.printCommonELement(integers);
        functionCall.printSumOfSqaureOfDiagonal(matrix);

        int[] arr = {1,2,3};
        int[] arr2 = {4,5,6};
        List<Integer[]> pairs = new ArrayList<>();
        pairs.add(new Integer[]{arr[0],arr2[0]});
        pairs.add(new Integer[]{arr[0],arr2[1]});
        pairs.add(new Integer[]{arr[0],arr2[2]});
        pairs.add(new Integer[]{arr[1],arr2[0]});
        pairs.add(new Integer[]{arr[1],arr2[1]});
        pairs.add(new Integer[]{arr[1],arr2[2]});
        pairs.add(new Integer[]{arr[2],arr2[0]});
        pairs.add(new Integer[]{arr[2],arr2[1]});
        pairs.add(new Integer[]{arr[2],arr2[2]});

        functionCall.printEvenPairs(pairs);
        Map<String,List<Integer>> employess = new HashMap<>();
        List<Integer> johnWorkingHours = new ArrayList<>();
        johnWorkingHours.add(8);
        johnWorkingHours.add(9);
        johnWorkingHours.add(7);
        johnWorkingHours.add(8);
        employess.put("John",johnWorkingHours);
        List<Integer> aliceWorkingHours = new ArrayList<>();
        aliceWorkingHours.add(9);
        aliceWorkingHours.add(9);
        aliceWorkingHours.add(8);
        aliceWorkingHours.add(9);
        employess.put("Alice",aliceWorkingHours);
        List<Integer> bobWorkingHours = new ArrayList<>();
        bobWorkingHours.add(7);
        bobWorkingHours.add(8);
        bobWorkingHours.add(7);
        bobWorkingHours.add(7);
        employess.put("Bob",bobWorkingHours);
        functionCall.printHighestWorkingEmployee(employess);
    }

    private void printHighestWorkingEmployee(Map<String, List<Integer>> employess) {
        int maximumWorkingHour = 0 ;
        String employeeName = "";
        for (Map.Entry<String, List<Integer>> singleEmployee : employess.entrySet()) {
            int totalWorkingHours = 0;
            for (Integer i : singleEmployee.getValue()) {
                totalWorkingHours += i;
            }
            if (totalWorkingHours >= maximumWorkingHour){
                maximumWorkingHour = totalWorkingHours;
                employeeName = singleEmployee.getKey();
            }
        }
        System.out.println(employeeName +" Working the most working hours "+ maximumWorkingHour);
    }

    private void printEvenPairs(List<Integer[]> pairs) {
        for (Integer[] pair : pairs) {
            if((pair[0] + pair[1]) % 2 ==0){
                System.out.println("(" + pair[0] + "," + pair[1] + ")");
            }
        }
    }

    private void printSumOfSqaureOfDiagonal(int[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j || i + j == matrix.length-1){
                    sum = sum + Math.pow(matrix[i][j],3);
                }
            }
        }
        System.out.println("The sum of the cube of the diagnol :" + sum);
    }

    private void printCommonELement(List<List<Integer>> integers) {
        for (Integer i : integers.get(0)) {
            if (integers.get(1).contains(i) && integers.get(2).contains(i)) {
                System.out.println("The common value for all the element :" + i);
            }
        }
    }

    private Map<String, String[]> anagarams(String[] words) {
        Map<String,List<String>> map = new HashMap<>();
        List<String> eat = new ArrayList<>();
        for (String word : words) {
            char[] wordss = word.toCharArray();
            Arrays.sort(wordss);
            String key = new String(wordss);
            ArrayList strings = new ArrayList<>();
            map.putIfAbsent(key,strings);
            map.get(key).add(word);
        }

        System.out.println(map);
        return new HashMap<>();
    }

    private List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralMatrix = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                spiralMatrix.add(matrix[i][j]);
            }
        }
        return spiralMatrix;
    }


    private void searchElemen(List<List<Integer>> rows,int elementToSearch) {
        boolean condition = false;
        for (int i = 0; i < rows.size(); i++) {
            for(int j = 0 ; j < rows.get(i).size() ; j++){
                condition = rows.get(i).get(j) == elementToSearch;
                if (condition){
                    System.out.println("The Element found at : ("+ i + "," + j +")");
                }
            }
        }
        if(!condition){
            System.out.println("The element not found -1" );
        }
    }

    private void printAverageGradeOfEachStudentAndHighestAverage(List<Students> students) {
        int highestAverage = 0;
        String highestAverageName = "";
        int[] mark;
        for (Students student : students) {
            mark = student.getMark();
            int averageMark = mark[0] + mark[1] + mark[2];
            System.out.println("The average mark of " + student.getName() + ":" + averageMark);
            if (averageMark > highestAverage){
                highestAverage = averageMark;
                highestAverageName = student.getName();
            }
        }
        System.out.println("The Highest average :"+ highestAverageName + ":"+ highestAverage);
    }


    private void sumOfElementsInTwoDArray(int[][] matrix) {
        int sumOfNumbers = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sumOfNumbers = sumOfNumbers + matrix[i][j];
            }
        }
        System.out.println("the sum of the numbers :"+ sumOfNumbers);
    }
}
