package in.co.nmsworks.week3.day5;

import java.io.IOException;

public class PracticeRunner {
    public static void main(String[] args) throws IOException {
        Practice p = new Practice();
        p.printFizzBuzz();

        int year = 100;
        if(p.leapOrNot(year)) {
            System.out.println(year+" is Leap Year.");
        }
        else {
            System.out.println(year +" is not a Leap Year.");
        }
        int n = 280;
        int sum = p.sumOfInteger(n);
        System.out.println("The sum of digits of "+n+" is " + sum);

        int[] arr = {5,9,12,56,90,22};
        int[] res = p.findMinMax(arr);
        System.out.println("Minimum element: " + res[0] + "\nMaximum element: "  +res[1]);

        int secondLargest = p.finsSecondLargest(arr);
        System.out.println("The second Largest element in the array: " + secondLargest);

        String fileName = "/home/nms-training/countWords.txt";
        int count = p.wordCount(fileName);
        System.out.println("The Number of words in the text file is: " +count);

        int num1 = 81, num2 = 9;
        int gcd = p.findGCD(num1,num2);
        System.out.println("GCD of "+num1 +", " + num2 + " is " + gcd);

        int mean = p.findMeanOfArray(arr);
        System.out.println("The Mean of the array: " + mean);

        int median = p.returnMedianOfArray(arr);
        System.out.println("The Median of the array: "+ median);

        int[] array = {4,7,7,7,1,1,8};
        int mode = p.findMode(array);
        System.out.println("The mode is: " + mode);
    }
}
