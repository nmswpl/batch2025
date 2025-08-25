package in.co.nmsworks.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Test pn = new Test();
        //pn.printNumOrFizzBuzz(1,100);
        System.out.println(pn.checkLeapYear(2100));
        pn.sumOfInteger(230223);
        int[] arr = new int[]{2, 3, 6, 1, 9, 4};
        pn.printMinMaxOfArray(arr);
        pn.secondLargest(arr);
        pn.countWord("/tmp/count.txt");
        pn.gcdOfTwoNumber(8,12);
        System.out.println("Mean of Array :" + pn.meanOfArray(arr));
        System.out.println("Meadian of Array : " + pn.mediaOfArray(arr));
        int[] modeArr = new int[] {4,7,7,7,1,8};
        pn.modeOfArray(modeArr);


    }


    public void printNumOrFizzBuzz(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public boolean checkLeapYear(int i) {
        boolean check;
        if ((i % 4 == 0 && i % 400 == 0) && (i % 100 == 0)) {
            return true;
        }
        return false;
    }

    public void sumOfInteger(int i) {
        int org = i;
        int sum = 0;
        while (i > 0) {
            int rem = i % 10;
            sum = sum + rem;
            i = i / 10;
        }
        System.out.println("Sum of digit " + org + ":" + sum);

    }

    public void printMinMaxOfArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            } else if (max < i) {
                max = arr[i];
            }
        }
        System.out.println("Max :" + max + " Min :" + min);
    }

    public void secondLargest(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int large = Integer.MIN_VALUE;
        int seconLarge = 0;
        for (int i = 0; i < arr.length; i++) {
            if (large < arr[i]) {
                seconLarge = large;
                large = arr[i];
            } else if ((large > arr[i]) && (seconLarge < arr[i])) {
                seconLarge = arr[i];
            }
        }
        System.out.println("second Largest : " + seconLarge);
    }

    public void countWord(String str) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(str));
        int count= 0;
        String line;
        while((line = br.readLine())!=null){
            String[] str1 = line.split(" ");
            count = count + str1.length ;
        }
        System.out.println( "count"+ count);

    }



    public void gcdOfTwoNumber(int a, int b) {
        if (a > b) {
            int temp = a;
            a =b ;
             b=a;
        }

            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }

        System.out.println("Gcd Of NUmbers : " + a);
    }

    public float meanOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }

    public float mediaOfArray(int[] arr) {
        Arrays.sort(arr);
        float median;
        if (arr.length % 2 == 0) {
            median = (arr[((arr.length) / 2) - 1] + arr[arr.length / 2]) / 2;
        } else {
            median = arr[arr.length / 2];
        }
        return median;
    }

    public void modeOfArray(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> arrList = new ArrayList<>();
        for (int i =0;i<arr.length;i++) {
            int  count = 0;
            if(!arrList.contains(arr[i])){
                arrList.add(arr[i]);
                for(int j=0;j<arr.length;j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
                map.put(arr[i],count);
            }
        }
        System.out.println(map);
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if(integerIntegerEntry.getValue()>maxCount){
                maxCount= integerIntegerEntry.getValue();
                System.out.println("Mode of Array :" + integerIntegerEntry.getKey());
            }
        }




    }
}