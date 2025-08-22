package in.co.nmsworks.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice
{
    public static void main(String[] args)
    {
        Practice p = new Practice();
        p.printFizzAndBuzz();

        boolean isLeapYear = p.checkLeapYear(2024);
        System.out.println(isLeapYear ? "Leap Year" : "Not a Leap Year");

        p.printSumOfDigits(541);

        p.printMinMaxElementsFromTheArray(new int[] {92, 18, 56, 94, 8, 64, 78});

        p.printSecondLargestFromArray(new int[] {92, 18, 56, 94, 100, 8, 98, 64, 78});

        int wordCount = p.countWords("/home/nms-training/Downloads/count.txt");
        System.out.println("The Word Count From the Given File is " + wordCount);

        int gcd = p.findGcdOfTwoNumbers(100, 40);
        System.out.println("The GCD Of Numbers Given Two Numbers is " + gcd);

        double mean = p.findMeanOfTheArray(new int[] {92, 18, 56, 94, 8, 64, 78, 70});
        System.out.println("The Mean of The Given Array is " + mean);

        double median = p.findMedianOfTheArray(new int[] {92, 18, 56, 94, 8, 64, 78, 70});
        System.out.println("The Median Of The Given Array is " + median);

        int mode = p.findModeFromTheArray(new int[] {4,7,7,7,1,1,8});
        System.out.println("The Mode is " + mode);
    }

    private int findModeFromTheArray(int[] arr)
    {
        int mode = arr[0], freqCount = 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int element : arr)
        {
            frequency.put(element, frequency.getOrDefault(element, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> freq : frequency.entrySet())
        {
            if (freq.getValue() > freqCount)
            {
                freqCount = freq.getValue();
                mode = freq.getKey();
            }
        }
        return mode;
    }

    private double findMedianOfTheArray(int[] arr)
    {
        int median;
        Arrays.sort(arr);
        if (arr.length % 2 != 0)
        {
            median = arr[arr.length/2];
        }
        else
        {
            median = (arr[arr.length/2] + arr[(arr.length/2)-1])/2;
        }
        return median;
    }

    private double findMeanOfTheArray(int[] arr)
    {
        int sum = 0;
        for (int element : arr)
        {
            sum += element;
        }
        return sum/arr.length;
    }

    private int findGcdOfTwoNumbers(int num1, int num2)
    {
        while(num1 != num2)
        {
            if (num1 > num2)
            {
                num1 -= num2;
            }
            else
            {
                num2 -= num1;
            }
        }
        return num1;
    }

    private int countWords(String fileName)
    {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while((line = br.readLine()) != null)
            {
                String[] words = line.split(" ");
                wordCount += words.length;
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return wordCount;
    }

    private void printSecondLargestFromArray(int[] arr)
    {
        int firstLargest = arr[0], secondLargest = arr[0];

        for (int element : arr)
        {
            if (firstLargest < element)
            {
                secondLargest = firstLargest;
                firstLargest = element;
            } else if (firstLargest > element && secondLargest < element)
            {
                secondLargest = element;
            }
        }
        System.out.println("Second Largest Element From the Array : " + secondLargest);
    }

    private void printMinMaxElementsFromTheArray(int[] arr)
    {
        int min = arr[0], max = arr[0];

        for (int element : arr)
        {
            if (element > max)
            {
                max = element;
            }
            if (element < min)
            {
                min = element;
            }
        }

        System.out.println("Min Element from the Array : " + min);
        System.out.println("Max Element from the Array : " + max);
    }

    private void printSumOfDigits(int num)
    {
        int n = num, digit, sum = 0;
        while (n > 0)
        {
            digit = n % 10;
            sum += digit;
            n = n/10;
        }
        System.out.println("Sum Of Digits " + num + " is " + sum);
    }

    private boolean checkLeapYear(int year)
    {
        if ((year % 4 == 0) && (year % 100 != 0))
        {
            return true;
        }
        else if (year % 400 == 0)
        {
            return true;
        }
        return false;
    }

    private void printFizzAndBuzz()
    {
        for (int i = 1; i <= 100; i++)
        {
            if ((i % 3 == 0) && (i % 5 == 0))
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
