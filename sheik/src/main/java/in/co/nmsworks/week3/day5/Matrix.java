package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Matrix
{
    public static void main(String[] args) {
        Matrix mt =  new Matrix();
        int[][] mat = new int[][]{{1,2,3},
                                 {4,5,6},
                                 {7,8,9}};
        mt.sumOfArray(mat);
        int[][] student = new int[][]{{85,90,88},{90,91,92},{70,75,80}};
        List<List<Integer>> twoDList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        List<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(8);
        list2.add(9);
        twoDList.add(list);
        twoDList.add(list1);
        twoDList.add(list2);

        mt.averageAndHighest(student);
        mt.searchElementInTwoDList(twoDList);
        mt.spiralMat(mat);


        mt.commonElement();
    }

    public void sumOfArray(int[][] mat){
        int sum =0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                sum = sum + mat[i][j];
            }
           //System.out.println(" ");
        }
        System.out.println("The sum of Array : " + sum);
    }

    public void averageAndHighest(int[][] mat){
        int highestAvg = 0;
        List<String> name =new ArrayList<>();
        name.add("john");
        name.add("alice");
        name.add("bob");
        for(int i=0;i<mat.length;i++){
            int sum =0;
            int avg =0;
            for(int j=0;j<mat.length;j++){
                sum = sum + mat[i][j];
                avg = sum/mat.length;
            }
            System.out.println(name.get(i) + ": Average = " + avg);
            if(highestAvg<avg){
                highestAvg=avg;
            }
        }System.out.println("Highest Average : " + highestAvg);
    }

    public void searchElementInTwoDList(List<List<Integer>> twoDList){
        int target = 7;
        System.out.println(twoDList);
        for (int i = 0; i < twoDList.size(); i++) {
            List<Integer> n = twoDList.get(i);
            for (int j = 0; j < n.size(); j++) {
                if(target==n.get(j)){
                    System.out.println("Found at index (" + i +"," + j +")");
                }
            }
        }

    }

    public void spiralMat(int[][] mat){
        int top = 0;
        int right = mat[0].length-1;
        int bottom = mat.length-1;
        int left = 0;
        List<Integer> num = new ArrayList<>();

        /*while(top<bottom && left<right){
            for(int i=left;i<right;i++){
                num.add(mat[left][]);
            }
        }
         */
    }

    public void commonElement(){
        List<List<Integer>> twoDList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(5);
        list2.add(6);
        twoDList.add(list);
        twoDList.add(list1);
        twoDList.add(list2);


        int common = 0;
        List<Integer> ls = twoDList.get(0);
        for (int i = 0; i < ls.size(); i++) {
            boolean check = false;
            for(int j =1;j<twoDList.size();j++){
                    if(twoDList.get(j).contains(ls.get(i))){
                        check = true;
                    }
                    else {
                        check = false;
                        break;
                    }
            }
            if(check == true){
                common = ls.get(i);
            }
        }
        System.out.println("Common Element is : " +common);

    }
}
