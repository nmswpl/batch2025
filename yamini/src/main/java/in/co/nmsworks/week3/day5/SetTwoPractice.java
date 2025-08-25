package in.co.nmsworks.week3.day5;

import java.awt.*;
import java.util.*;
import java.util.List;

public class SetTwoPractice {
    public static void main(String[] args) {
        SetTwoPractice sp = new SetTwoPractice();
        sp.sumOfElements();
        sp.findIndex(5);
        int arr1[]={1,2,3};
        int[]arr2={2,3,4};
        sp.findEvenPairs(arr1,arr2);
        System.out.println();
        sp.sumOfCubeOfDiagonals(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

        Map<String,Integer[]> map = new HashMap<>();
        map.put("John",new Integer[]{8,9,7,8});
        map.put("Alice",new Integer[]{9,9,8,9});
        map.put("Bob",new Integer[]{7,8,7,7});

        Map<String,Integer[]> grade = new HashMap<>();
        map.put("John",new Integer[]{85,90,88});
        map.put("Alice",new Integer[]{90,91,8,9});
        map.put("Bob",new Integer[]{7,8,7,7});
        sp.calculateTotalHours(map);
        sp.calculateAverage(map);


    }

    private void sumOfElements() {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of Elements in a 2D Array:" + sum);
    }

    private void findIndex(int number) {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(0, 1);
        l1.add(1, 2);
        l1.add(2, 3);
        List<Integer> l2 = new ArrayList<>();
        l2.add(0, 4);
        l2.add(1, 5);
        l2.add(2, 6);

        List<Integer> l3 = new ArrayList<>();
        l3.add(0, 7);
        l3.add(1, 8);
        l3.add(2, 9);
        matrix.add(l1);
        matrix.add(l2);
        matrix.add(l3);
        int index=-1;
        for(int i=0;i<matrix.size();i++){
            System.out.println("inside for" + matrix.get(i));
            for(int j=0;j<matrix.get(i).size();j++){
                index= matrix.indexOf(number);
                break;
            }

        }
        System.out.println(index);
    }

    private void findEvenPairs(int[] arr1, int[] arr2) {
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j< arr1.length;j++){
                if((arr1[i]+arr2[j]) % 2==0){
                    System.out.print("("+arr1[i] + ","+ arr2[j]+"),");
                }
            }
        }
    }

    private void sumOfCubeOfDiagonals(int [][]arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==arr[0][0]||arr[i][j]==arr[0][2]||arr[i]==arr[j]||arr[i][j]==arr[2][0]){
                    sum+=arr[i][j]*arr[i][j]*arr[i][j];
                }
            }
        }

        System.out.println("The sum of cube of diagonal elements : "+sum);
    }

    private void calculateTotalHours(Map<String,Integer[]> attendance) {
        int sum = 0;
        String maxKey=null;
        int max=Integer.MIN_VALUE;
        for (Map.Entry<String, Integer[]> entry : attendance.entrySet()) {
            Integer[] array = entry.getValue();
            sum = 0;
            for (Integer num : array) {
                    sum += num;
                if (sum > max) {
                    max = sum;
                    maxKey = entry.getKey();
                }
            }
        }
        System.out.println(maxKey+" has the highest working hours of : "+sum);

    }
    private void calculateAverage(Map<String,Integer[]> map){
        int sum;
        int avg=0;
        String maxKey=null;
        int max=0;
        for (Map.Entry<String, Integer[]> entries : map.entrySet()) {
            Integer[] arr = entries.getValue();
            sum=0;
            for(Integer items : arr ){
                sum+=items;
                avg=sum/arr.length;
                if(avg>max){
                    max=avg;
                    maxKey=entries.getKey();
                }
            }
        }
        System.out.println("The highest average is: "+avg+" for "+maxKey);
    }
    public  void findCommonElement(List<List<Integer>> list){


    }

    public  void groupingStringsByAnagram(){
        List<String>strings=new ArrayList<>();
        strings.add("eat");
        strings.add("tea");
        strings.add("tan");
        strings.add("ate");
        strings.add("nat");
        strings.add("bat");


    }

}
