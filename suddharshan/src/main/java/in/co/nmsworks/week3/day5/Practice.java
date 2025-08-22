package in.co.nmsworks.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.printNumbers(1,100);
        practice.checkLeapYear(2028);
        practice.printSumOfDigits(345);
        practice.findMinAndMax(new int[] {12,5,8,19,22});
        practice.getSecondLargestNumber(new int[] {100,90,80,110,85});
        practice.getWordCount("/home/nms-training/Downloads/countWords.txt");
        practice.findGCD(24,12);
        practice.findMeanOfArray(new int[] {45,56,25,28,19});
        practice.findMedianOfArray(new int[] {1,2,3,4,5});
        practice.findMedianOfArray(new int[] {1,2,3,5,6,8});
        practice.findModeOfArray(new int[] {3,2,4,3,3,6,4});
    }
    public void printNumbers(int start, int end){
        for(int i = start; i < end+1; i++){
            if(i % 3 == 0){
                System.out.print("Fizz ");
            }
            else if (i % 5 == 0) {
                System.out.print("Buzz ");
            }
            else if ( i % 3 == 0  && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            }
            else{
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public void checkLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year +" is not a leap year");
        }
    }
    public void printSumOfDigits(int number){
        int sum = 0, rem;
        int x = number;
        while(number != 0){
            rem = number % 10;
            sum += rem;
            number = number / 10;
        }
        System.out.println("Sum of digits in " + x + " is " + sum);
    }
    public void findMinAndMax (int [] arr){
        int min = arr[0], max = arr[0];
        for (int i : arr) {
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        System.out.println("Minimum: " + min + " Maximum: " + max);
    }
    public void getSecondLargestNumber (int[] arr){
        int largest = arr[0], secondLargest = arr[0];
        for (int num : arr) {
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest)  {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest in Array: " + secondLargest);
    }
    public void getWordCount (String fileName){
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String row, res= "";
            while((row = br.readLine()) != null){
                res += row;
            }
            String[] arr =  res.split(" ");
            System.out.println("No. of Words in File: " + arr.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void findGCD(int a, int b){
        if(a > b){
            while(b != 0){
                int rem =  a % b;
                a = b;
                b = rem;
            }
            System.out.println("The GCD is " + a);
        }
        else{
            System.out.println("Can't find GCD with " + a + " and " + b);
        }
    }
    public void findMeanOfArray (int [] arr){
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("The mean of array is: " + sum/arr.length);
    }
    public void findMedianOfArray (int[] arr){
        if(arr.length % 2 == 0){
            int mid = arr.length / 2;
            System.out.println("The median is: " + (arr[mid-1]+arr[mid]) / 2);
        }
        else{
            int newMid = (arr.length - 1) / 2;
            System.out.println("The median is: " + arr[newMid]);
        }
    }
    public void findModeOfArray (int[] arr){
        HashMap<Integer,Integer> freqCount = new HashMap<>();
        for (int num : arr) {
            freqCount.put(num,freqCount.getOrDefault(num,0)+1);
        }
        int modeval = 0, freq = 0;
        for (Map.Entry<Integer, Integer> entry : freqCount.entrySet()) {
            if(entry.getValue() > freq){
                freq = entry.getValue();
                modeval = entry.getKey();
            }
        }
        System.out.println("Mode of the Array: " + modeval);
    }
}
