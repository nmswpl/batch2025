package in.co.nmsworks.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practice {
    public void printFizzBuzz() {
        for (int i = 1 ; i <= 100 ; i++) {
            if(i % 3 == 0) {
                System.out.println("Fizz");
                if(i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public boolean leapOrNot(int year) {
        if((year % 4 == 0) && (year % 100 != 0)){
            return true;
        }
        if(year % 400 == 0){
            return true;
        }
        return false;
    }

    public int sumOfInteger(int num) {
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public int[] findMinMax(int[] arr) {
        int[] res = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        res[0] = min;
        res[1] = max;
        return res;
    }

    public int finsSecondLargest(int[] arr) {
        int sLar = Integer.MIN_VALUE;
        int lar = Integer.MIN_VALUE;
        for(int i : arr) {
            if(i > lar) {
                sLar = lar;
                lar = i;
            }
            else if((i > sLar) && (i < lar)) {
                sLar = i;
            }
        }
        return sLar;
    }

    public int wordCount(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int count = 0;
        String line;
        while((line = br.readLine()) != null) {
            String[] strArr = line.split(" ");
            count += strArr.length;
        }
        return count;
    }

    public int findGCD(int num1, int num2) {
        while(num2 != 0) {
            if(num1 > num2) {
                int rem = num1 % num2;
                num1 = num2;
                num2 = rem;
            }
        }
        return num1;
    }

    public int findMeanOfArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum/arr.length;
    }

    public int returnMedianOfArray(int[] arr) {
        int n = arr.length;
        if(arr.length % 2 != 0) {
            return arr[n/2];
        }
        return (arr[((n/2)-1)] + arr[(n/2)])/2;
    }

    public int findMode(int[] arr) {
        int freq = 1;
        int mode = 0;
        HashMap<Integer,Integer> counter = new HashMap<>();
        for (int i : arr) {
            counter.put(i,counter.getOrDefault(i,0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > freq) {
                mode = entry.getKey();
            }
        }
        return mode;
    }
}
