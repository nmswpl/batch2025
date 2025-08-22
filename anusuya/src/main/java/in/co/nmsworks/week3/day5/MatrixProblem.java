package in.co.nmsworks.week3.day5;

import java.util.*;

public class MatrixProblem {

    public static void main(String[] args) {

        MatrixProblem mp = new MatrixProblem();

        int[][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        mp.printSumOfElements(array);

        mp.findHighestAverageOfStudents();

        List<List<Integer>> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList<>(Arrays.asList(1,2,3)));
        arrayList.add(new ArrayList<>(Arrays.asList(4,5,6)));
        arrayList.add(new ArrayList<>(Arrays.asList(7,8,9)));
        mp.printPositionOfAnElement(arrayList,5);

        List<String> words = new ArrayList<>(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat"));
        mp.groupingAnagramsAndPrint(words);

        List<List<Integer>> arrayList1 = new ArrayList<>();
        arrayList1.add(new ArrayList<>(Arrays.asList(1,2,3)));
        arrayList1.add(new ArrayList<>(Arrays.asList(2,3,4)));
        arrayList1.add(new ArrayList<>(Arrays.asList(2,5,6)));
        mp.findAndPrintCommonElement(arrayList1);

        mp.printSumWithCubeOfDiagonals(arrayList);

        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{2,3,4};
        mp.printPairedElementsHavingSumEven(arr1, arr2);

        mp.printEmployeeHavingHighestWorkingHours();
    }

    private void printSumOfElements(int[][] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                sum += array[i][j];
            }
        }
        System.out.println("Sum of elements of 2D Array is : " + sum + "\n");
    }

    private void findHighestAverageOfStudents() {

        Map<String, List<Integer>> studentsListWithGrades = new HashMap<>();

        studentsListWithGrades.put("John", new ArrayList<Integer>(Arrays.<Integer>asList(85,90,80)));
        studentsListWithGrades.put("Alice", new ArrayList<Integer>(Arrays.<Integer>asList(91,90,92)));
        studentsListWithGrades.put("Bob", new ArrayList<Integer>(Arrays.<Integer>asList(70,75,80)));

        float maxGrade = 0f;
        String studentName = "";
        int sum = 0;
        for (Map.Entry<String, List<Integer>> student : studentsListWithGrades.entrySet()) {
            for (int i = 0; i < student.getValue().size(); i++){
                sum += student.getValue().get(i);
            }
            sum /= student.getValue().size();
            if (sum > maxGrade){
                maxGrade = sum;
                studentName = student.getKey();
            }
            sum = 0;
        }
        System.out.println(studentName + " has highest grade of : " + maxGrade + "\n");
    }

    private void printPositionOfAnElement(List<List<Integer>> array, int searchElement) {

        boolean found = false;
        int row = 0, column = 0;
        for (int i = 0; i < array.size(); i++){
            for(int j = 0; j < array.size(); j++){
                if(array.get(i).get(j) == searchElement){
                    found = true;
                    row = i;
                    column = j;
                    break;
                }
            }
        }

        if(found){
            System.out.println(searchElement + " found at : (" + row + "," + column + ")\n");
        }
        else{
            System.out.println(searchElement + " found at -1\n");
        }
    }

    private void groupingAnagramsAndPrint(List<String> words) {

        Map<String,List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] wordArray = word.toCharArray();
            for (int i = 0; i < wordArray.length; i++) {
                for (int j = 0; j < wordArray.length-i-1; j++) {
                    if (wordArray[j] < wordArray[j+1]) {
                        char temp = wordArray[j];
                        wordArray[j] = wordArray[j+1];
                        wordArray[j+1] = temp;
                    }
                }
            }
            String sortedWord = new String(wordArray);
            if (!anagramMap.containsKey(sortedWord)){
                anagramMap.put(sortedWord,new ArrayList<>());
            }
            anagramMap.get(sortedWord).add(word);
        }
        for (Map.Entry<String, List<String>> word : anagramMap.entrySet()) {
            System.out.print(word.getKey() + " -- > " + word.getValue());
            System.out.println();
        }
        System.out.println();
    }

    private void findAndPrintCommonElement(List<List<Integer>> arrayList1) {

        int k = 0;
        while(k < arrayList1.size()){
            int count = 0;
            int searchElement = arrayList1.getFirst().get(k);
            for (int i = 1; i < arrayList1.size(); i++){
                if (arrayList1.get(i).contains(searchElement)){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("Common Element is : " + searchElement + "\n");
                break;
            }
            k++;
        }
    }

    private void printSumWithCubeOfDiagonals(List<List<Integer>> arrayList) {

        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++){
            for (int j = 0; j < arrayList.size(); j++){
                if (((i == 0 || i == arrayList.size()-1) && (j == 0 || j == arrayList.size()-1)) || (i == j)){
                    sum += (int) Math.pow(arrayList.get(i).get(j), 3);
                }
            }
        }
        System.out.println("Sum of diagonals is : " + sum + "\n");
    }

    private void printPairedElementsHavingSumEven(int[] arr1, int[] arr2) {

        List<List<Integer>> evenPairedList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1.length; j++){
                List<Integer> tempList = new ArrayList<>();
                if((arr1[i]+arr2[j]) % 2 == 0){
                    tempList.add(arr1[i]);
                    tempList.add(arr2[j]);
                    evenPairedList.add(tempList);
                }
            }
        }
        System.out.println("Even Paired Elements are : " + evenPairedList + "\n");
    }

    private void printEmployeeHavingHighestWorkingHours() {

        Map<String, List<Integer>> employeeWithWorkingHours = new HashMap<>();

        employeeWithWorkingHours.put("John", new ArrayList<Integer>(Arrays.<Integer>asList(8,9,8,7)));
        employeeWithWorkingHours.put("Alice", new ArrayList<Integer>(Arrays.<Integer>asList(9,9,8,9)));
        employeeWithWorkingHours.put("Bob", new ArrayList<Integer>(Arrays.<Integer>asList(7,8,7,7)));

        int maxHours = 0;
        String employeeName = "";
        int sum = 0;
        for (Map.Entry<String, List<Integer>> employee : employeeWithWorkingHours.entrySet()) {
            for (int i = 0; i < employee.getValue().size(); i++){
                sum += employee.getValue().get(i);
            }
            if (sum > maxHours){
                maxHours = sum;
                employeeName = employee.getKey();
            }
            sum = 0;
        }
        System.out.println(employeeName + " is working vast number of hours of : " + maxHours);
    }
}
