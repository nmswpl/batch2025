package in.co.nmsworks.week3.day5;

import java.util.*;

public class PracticeProblems {
    public static void main(String[] args) {
        PracticeProblems problem = new PracticeProblems();
        problem.printStringBetweenNumbers();
        System.out.println();

        problem.isALeapYear(2025);
        problem.isALeapYear(2020);
        System.out.println();

        problem.sumOfDigits(457);
        System.out.println();

        problem.minAndMaxOfArray();
        System.out.println();

        problem.secondLargestElement();
        System.out.println();

        problem.countNumberOfWords();
        System.out.println();

        problem.greatestCommonDivisor(15,10);
        System.out.println();

        problem.meanOfArray();
        System.out.println();

        problem.medianOfArray();
        System.out.println();

        problem.countFrequency();
    }

    public void printStringBetweenNumbers(){
        for (int i = 1; i <= 100 ; i++) {
            if((i % 3 == 0) && (i % 5 ==0)){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    public void isALeapYear(int year){
       if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
           System.out.println(year + " is a Leap Year");
       }
       else {
           System.out.println(year + " is not a Leap Year");
       }
    }

    public void sumOfDigits(int number){
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println(sum);
    }

    public void minAndMaxOfArray(){
        int[] arr = {4,6,2,3,7,9,1,5,8};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i]<=min){
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>=max){
                max = arr[i];
            }
        }

        System.out.println("Minimum of Array: " + min);
        System.out.println("Maximum of Array: " + max);
    }

    public void secondLargestElement(){
        int[] arr = {4,6,2,3,7,9,1,5,8};
        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>=max){
                secondMax = arr[i];
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>=secondMax){
                max = arr[i];
            }
        }
        System.out.println("Second Largest Element int the array: " + secondMax);
    }

    public void countNumberOfWords(){
        String input = "Hello, world! This is a test paragraph. It contains various punctuation marks: commas, periods, exclamation points, and question marks. How many words will be counted? Let's find out!In addition to punctuation, this paragraph also includes some numbers: 123, 456.7, and special characters like @, #, and $.The quick brown fox jumps over the lazy dog. This is a classic sentence used to display all the letters of the alphabet. It’s often used in typewriters and computer fonts to showcase typefaces.Programming languages such as Python, Java, and C++ are used to create software. Each language has its own syntax and rules, but they all serve the purpose of making computers perform tasks.Testing edge cases is important: consider phrases like hello-world, it's a test, and one-two-three.These examples help ensure the word count algorithm works correctly under various conditions.";
        String[] word = input.split("\\s+");
        System.out.println("No of Words: " + word.length);
    }

    public void greatestCommonDivisor(int a, int b){
        System.out.println("The Greatest Common Divisor of " + a + " and " + b + " is: ");
        while(b!=0){
            int r = a % b;

            int temp = a;
            a = b;
            b = temp;

            int temp1 = r;
            r = b;
            b = temp1;
        }
        System.out.println(a);
    }

    public void meanOfArray(){
        int[] arr = {4,6,2,3,7,9,1,5,8};
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of Elements in the array: " + sum);
        System.out.println("No of Elements in the array: " + arr.length);
        System.out.println("Mean of the Array: " + sum/arr.length);
    }

    public void medianOfArray(){
        int[] arr = {4,6,2,3,7,9,1,5,8,10};
        Arrays.sort(arr);
        int middle = arr.length/2;
        if(arr.length % 2 != 0){
            System.out.println("Median of the Array: " + arr[arr.length/2]);
        }
        else if(arr.length % 2 == 0){
            System.out.println("Median of the Array: " + (arr[middle-1]+arr[middle+1])/2);
        }
    }

    public void countFrequency(){
        int[] arr = {4,7,7,7,1,1,8};

        Map<Integer,Integer> countMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            countMap.put(arr[i],countMap.getOrDefault(arr[i],0)+1);
        }

        int maxFrequency = 0;
         for(int count: countMap.values()){
             if(count > maxFrequency){
                 maxFrequency = count;
             }
         }

         List<Integer> modes = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : countMap.entrySet()){
            if(entry.getValue() == maxFrequency){
                modes.add(entry.getKey());
            }
        }

        System.out.println("Highest Frequent Elements: " + modes);
    }
}
