package in.co.nmsworks.week3.day5;

import java.util.*;

public class MatrixPractice {
    public static void main(String[] args) {
        MatrixPractice mp = new MatrixPractice();
        int [][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        mp.sumOfElementsInMatrix(arr);
        Map<String, List<Integer>> markList = new HashMap<>();

        List<Integer> johnMarkList = new ArrayList<>();
        johnMarkList.add(85);
        johnMarkList.add(90);
        johnMarkList.add(88);
        markList.put("John",johnMarkList);

        List<Integer> aliceMarkList = new ArrayList<>();
        aliceMarkList.add(90);
        aliceMarkList.add(91);
        aliceMarkList.add(92);
        markList.put("Alice",aliceMarkList);

        List<Integer> bobMarkList = new ArrayList<>();
        bobMarkList.add(70);
        bobMarkList.add(75);
        bobMarkList.add(80);
        markList.put("Bob",bobMarkList);

        mp.findAvgOfStudents(markList);

        List<List<Integer>> numbers = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        numbers.add(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        numbers.add(list2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        numbers.add(list3);

        System.out.println(mp.findIndex(numbers,5));
        System.out.println(mp.getSpiralOrderList(arr));

    }
    public void sumOfElementsInMatrix(int arr[][]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of elements in 2D Array: " + sum);
    }
    public void findAvgOfStudents(Map<String, List<Integer>> scores){
        List <Integer> avgMarks = new ArrayList<>();
        for (Map.Entry<String, List<Integer>> entry : scores.entrySet()) {
            List <Integer> marks = entry.getValue();
            int sumMark = 0;
            for (Integer mark : marks) {
                sumMark += mark;
            }
            avgMarks.add(sumMark/marks.size());
            System.out.println(entry.getKey() +"'s avg mark is: " + sumMark/marks.size());
        }
        System.out.println("Highest Average Mark of Students: " + Collections.max(avgMarks));
    }
    public List <Integer> findIndex (List<List<Integer>> numbers, int number){
        List <Integer> pos = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            for(int j = 0; j < numbers.get(i).size(); j++){
                if(numbers.get(i).get(j) == number){
                    pos.add(0,i);
                    pos.add(1,j);
                }
            }
        }
        return pos;
    }
    public List <Integer> getSpiralOrderList(int numbers[][]){
        List <Integer> spiralOrder = new ArrayList<>();
        int top = 0, bottom = numbers.length-1;
        int left = 0, right = numbers[0].length-1;
        while (left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                spiralOrder.add(numbers[top][i]);
            }
            top++;
            for(int i = top; i <= bottom; i++){
                spiralOrder.add(numbers[i][right]);
            }
            right--;
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    spiralOrder.add(numbers[i][left]);
                }
                left++;
            }
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    spiralOrder.add(numbers[bottom][i]);
                }
                bottom--;
            }
        }
        return spiralOrder;
    }
}
