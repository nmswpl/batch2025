package in.co.nmsworks.week3.day5;

import java.util.*;

public class PracticeSet2 {

    public static void main(String[] args)
    {
        PracticeSet2 p2 = new PracticeSet2();
//        p2.sumOfMatrix();
//        p2.findAverage();
//        p2.findIndexInMatrix();
//        p2.printAnagram();
//        p2.findCommonElements();
//        p2.findDiagonalSum();
          p2.pairUpElements();
//        p2.sumOfHours();

    }

    private void sumOfHours()
    {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(9);
        integerList.add(9);
        integerList.add(8);
        integerList.add(9);
        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(7);
        integerList1.add(8);
        integerList1.add(7);
        integerList1.add(7);
        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(8);
        integerList2.add(9);
        integerList2.add(7);
        integerList2.add(8);

        Map<String,List<Integer>> hoursMap = new LinkedHashMap<>();

        hoursMap.put("Alice",integerList);
        hoursMap.put("Bob",integerList1);
        hoursMap.put("John",integerList2);

        Map<String,Integer> hoursMap1 = new LinkedHashMap<>();

        int sum;
        int maxHours=0;
        String maxKey="";
        for (Map.Entry<String, List<Integer>> entry : hoursMap.entrySet())
        {
            sum=0;
            for (Integer i : entry.getValue())
            {
                sum=sum+i;
                hoursMap1.put(entry.getKey(), sum);
                if(sum>maxHours)
                {
                    maxHours = sum;
                    maxKey = entry.getKey();
                }
            }
        }
        System.out.println(maxKey+" worked the Most Hours : "+maxHours);
    }

    private void pairUpElements()
    {
        int arr1[] = new int[]{1,2,3};
        int arr2[] = new int[]{2,3,4};

    }

    private void findDiagonalSum()
    {
        int[][] matrix = {
                {1, 2, 3},
                {2, 3, 6},
                {2, 3, 3}};
        int sum=0;
        for(int i=0; i< matrix.length; i++)
        {
            for (int j=0; j< matrix.length; j++ )
            {
                if(i==j)
                    sum=sum+matrix[i][j];
                else if (i%2==0 && j%2==0)
                {
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    private void findCommonElements()
    {
        int[][] matrix = {
                {1, 2, 3},
                {2, 3, 6},
                {2, 3, 3}};

        List<Integer> numbers=new ArrayList<>();
        for(int i=0;i< matrix.length;i++)
        {
            for (int j=0; j< matrix.length; j++)
            {
                numbers.add(matrix[i][j]);
            }
        }

        Map<Integer,Integer> numberCount=new HashMap<>();

        for (Integer number : numbers) {
            numberCount.put(number,numberCount.getOrDefault(number,0)+1);
        }

        int maxFrequency = 0;
        int maxFrequencyElement = 0;

        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {

            if(maxFrequency<entry.getValue()) {
                maxFrequency = entry.getValue();
                maxFrequencyElement = entry.getKey();
            }
        }
        System.out.println("Comman Element is : "+maxFrequencyElement);
    }

    private List<Integer> spiralMatrix()
    {
         List<Integer> spiralMatrix = new ArrayList<>();

        return spiralMatrix;
    }

    private void printAnagram()
    {
        String arr[] = new String[]{"eat","tea","tan","ate","nat","bat"};
        Map<String,List<String>> anagramMap = new LinkedHashMap<>();
        String sorted = "";
        for (int i = 0; i < arr.length; i++)
        {
            char[] charArray = arr[i].toCharArray();
            Arrays.sort(charArray);
            sorted = new String(charArray);
            anagramMap.computeIfAbsent(sorted, k -> new ArrayList<>()).add(arr[i]);
        }
        System.out.println(anagramMap);

    }

    private void findIndexInMatrix()
    {
        List<Integer> innerList = new ArrayList<>();
        innerList.add(1);
        innerList.add(2);
        innerList.add(3);

        List<Integer> innerList1 = new ArrayList<>();
        innerList1.add(4);
        innerList1.add(5);
        innerList1.add(6);

        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(7);
        innerList2.add(8);
        innerList2.add(9);

        List<List<Integer>> matrix = new ArrayList<>();

        matrix.add(innerList);
        matrix.add(innerList1);
        matrix.add(innerList2);

        System.out.println(matrix);

        int target = 5;
        int i=0;
        int j=0;

        for (i=0; i<matrix.size(); i++)
        {
            for (j=0; j<matrix.get(i).size(); j++)
            {
                if(matrix.get(j).get(i)==target)
                    System.out.println("Found at ("+i+" , "+j+")");
            }
        }

    }

    private void findAverage()
    {
        List<Double> integerList = new ArrayList<>();
        integerList.add(85d);
        integerList.add(90d);
        integerList.add(88d);
        List<Double> integerList1 = new ArrayList<>();
        integerList1.add(90d);
        integerList1.add(91d);
        integerList1.add(92d);
        List<Double> integerList2 = new ArrayList<>();
        integerList2.add(70d);
        integerList2.add(75d);
        integerList2.add(80d);

        double avg1=0;
        double sum1=0;
        for (Double i : integerList) {
            sum1=sum1+i;
        }
        avg1=sum1/integerList.size();

        double avg2=0;
        double sum2=0;
        for (Double i : integerList1) {
            sum2=sum2+i;
        }
        avg2=sum2/integerList1.size();

        double avg3=0;
        double sum3=0;
        for (Double i : integerList2) {
            sum3=sum3+i;
        }
        avg3=sum3/integerList2.size();

        Map<String,Double> students = new LinkedHashMap<>();
        students.put("John",avg1);
        students.put("Alice",avg2);
        students.put("Bob",avg3);


        double maxAvg=0;
        String name="";
        for (Map.Entry<String, Double> entry : students.entrySet())
        {
            System.out.println(entry.getKey()+":"+" Average = "+entry.getValue());
            if(maxAvg< entry.getValue()) {
                maxAvg = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println("Highest Average : "+name+"("+maxAvg+")");
    }

    private void sumOfMatrix()
    {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int sum=0;

        for(int i=0;i<matrix.length;i++)
        {
            for (int j=0;j< matrix.length;j++)
            {
                sum=sum+matrix[i][j];
            }
        }
        System.out.println(sum);
    }


}
