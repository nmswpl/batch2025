package in.co.nmsworks.week3.day5;

import java.util.*;

public class PracticeProblemsSet2 {
    public static void main(String[] args) {
        PracticeProblemsSet2 ps2 = new PracticeProblemsSet2();
        ps2.sumOf2DArray();
        System.out.println();

        ps2.gradeBook();
        System.out.println();
        System.out.println();

        ps2.findElement(5);
        System.out.println();

        ps2.printSpiralOreder();
        System.out.println();

        ps2.anagram();
        System.out.println();

        ps2.findCommonElements();
        System.out.println();

        ps2.cubeOfElements();
    }

    public void sumOf2DArray(){
        int sum = 0;
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j=0; j< matrix.length; j++){
                sum += matrix[i][j];
            }
        }
        System.out.println("The sum of all elements is: " + sum);
    }

    private void gradeBook() {
        Map<String, List<Integer>> students = new HashMap<>();
        students.put("John", Arrays.asList(85, 90, 88));
        students.put("Alice", Arrays.asList(90, 91, 92));
        students.put("Bob", Arrays.asList(70, 75, 80));

        String topStudent = "";
        double highestAverage = 0f;

        for (String name : students.keySet()) {
            List<Integer> grades = students.get(name);
            double total = 0.0;
            for (int grade : grades) {
                total += grade;
            }
            double average = total / grades.size();
            System.out.println("- " + name + " Average = " + average);

            if (average > highestAverage) {
                highestAverage = average;
                topStudent = name;
            }
        }
        System.out.printf("- Highest Average: " + topStudent + " (" +  highestAverage+  ")" );
    }

    public void findElement(int target){
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j=0; j< matrix.length; j++){
               if(matrix[i][j]==target){
                   System.out.println("Found at: " + "(" + i + "," + j + ")");
               }
            }
        }
    }

    public void printSpiralOreder(){
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < matrix.length;i++) {
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j]);
            }
        }
    }

    public void anagram(){
        List<String> stringList = new ArrayList<>();
        stringList.add("eat");
        stringList.add("tea");
        stringList.add("tan");
        stringList.add("ate");
        stringList.add("nat");
        stringList.add("bat");

        Map<String,List<String>> anagram = new HashMap<>();

        for (String word : stringList) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String sortedString = new String(chars);

            if (!anagram.containsKey(sortedString)){
                anagram.put(sortedString,new ArrayList<>());
            }
            anagram.get(sortedString).add(word);
        }
        for (Map.Entry<String, List<String>> entry : anagram.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void findCommonElements(){
        List<List<Integer>> superList = new ArrayList<>();
        superList.add(Arrays.asList(1,2,3));
        superList.add(Arrays.asList(2,3,4));
        superList.add(Arrays.asList(2,5,6));

        Set<Integer> newSet = new HashSet<>();

        for (Integer i : superList.get(0)) {
            newSet.add(i);
        }

        for(int i =1; i < superList.size(); i++){
            newSet.retainAll(superList.get(i));
        }
        System.out.println(newSet);
    }

    public void cubeOfElements(){
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum =0;
        StringBuilder exp = new StringBuilder();

        for(int i =0; i< matrix.length; i++){
            for(int j=0; j< matrix.length; j++){
                if( (i==j) || (i==0 && j== matrix.length-1) || (j==0 && i== matrix.length-1)){
                    matrix[i][j] = (int) Math.pow(matrix[i][j],3);
                    sum += matrix[i][j];
                    exp.append(matrix[i][j]).append(" + ");
                }
                else{
                    continue;
                }
            }
        }

        if(exp.length()>3){
            exp = exp.deleteCharAt(exp.length()-2);
        }

        System.out.println("Sum of Cube of Diagonals: " + exp + "= " + sum);
    }



}
