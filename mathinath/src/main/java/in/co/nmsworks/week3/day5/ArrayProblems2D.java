package in.co.nmsworks.week3.day5;

import java.util.*;

public class ArrayProblems2D {
    public static void main(String[] args) {
        ArrayProblems2D ap = new ArrayProblems2D();
//        ap.sumOfMatrix();
//        ap.specificElement();
//        ap.groupingStringsByAnagram();
//        ap.listOfListOfInteger();
        ap.pairingElements();
    }

    private void pairingElements() {
        int arr1[] = {1,2,3};
        int arr2[] = {2,3,4};
        List<Integer>
    }

    private void listOfListOfInteger() {
        List<List<Integer>> list = new ArrayList<>();
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
        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(list);
        List<Integer> list4 = new ArrayList<>();
        if (list1.contains(list2))
        {}


    }

    private void groupingStringsByAnagram() {
        List<String> list1 = new ArrayList<>();
        list1.add("eat");
        list1.add("tea");
        list1.add("tan");
        list1.add("ate");
        list1.add("nat");
        list1.add("bat");
//        System.out.println(list1);
//        Collections.sort(list1);
//        System.out.println(list1);

        Map<String,List<String>> map = new HashMap<>();
        List<String> string1 = new ArrayList<>();
        for (String string : list1) {
            char[] ch = string.toCharArray();
            String str = new String(ch);
//            System.out.println(ch);
//            System.out.println(str);
            string1.add(str);
            for (String s : string1) {
//                if ()
            }
        }
        System.out.println(string1);
    }

    private void specificElement() {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        List<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(list);
        int target = 4;
        System.out.println(list.indexOf(target));

    }



    private void sumOfMatrix() {
        int arr[][] = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int sum = 0;
        for (int i = 0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("The sum of the array: "+sum);
    }
}
