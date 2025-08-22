package in.co.nmsworks.week3.day5;

import com.mysql.cj.protocol.x.XProtocolRowInputStream;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.CollationKey;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.*;

public class Practice
{

    private void printFizzBuzz(int start, int end)
    {
        for (int i = start;i <= end; i++)
        {
            if ((i % 3 == 0) && (i % 5 == 0))
            {
                System.out.println(i+" : FizzBuzz");
            }
            else if (i % 5 == 0)
            {
                System.out.println(i+ " : Buzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println(i+" : Fizz");
            }
        }
    }

    private boolean isLeapYear(int year)
    {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        {
            return true;
        }
        return false;
    }

    private int sumOfDigits(int integer)
    {
        int resultSum = 0;
        while (integer >  0 )
        {
            resultSum += integer % 10;
            integer /= 10;
        }
        return resultSum;
    }


    private void printMinMax(int[] integerArray)
    {
        int temp = 0;
        for (int i : integerArray)
        {
            if (temp < i)
            {
                temp = i;
            }
        }


        System.out.println("max : "+ temp);

        for (int i : integerArray)
        {
            if (i < temp)
            {
                temp = i;
            }
        }

        System.out.println("Min : "+ temp);
    }

    private int secondLargestNumber(int[] integerArray)
    {
        int secondLargestNumber = 0,largest = 0;

        for (int i : integerArray)
        {
            if (i > largest)
            {
                secondLargestNumber = largest;
                largest = i;

            }
        }

        return secondLargestNumber;
    }

    private long countWordsInFile(String filePath) throws FileNotFoundException {
        long countOfWords = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath)))
        {
            String temp;
            while ((temp = bufferedReader.readLine()) != null)
            {
                countOfWords += temp.split(" ").length;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(countOfWords);

        return countOfWords;
    }


    private void greatestCommonDivisor(int a, int b)
    {
        if (a < b)
        {
            System.out.println("first value should greater then second value");
            return;
        }
        System.out.print("GCD of "+a+" , "+b+" is : ");
        int temp = 0;
        while (b != 0)
        {
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println(a);
    }

    private void printMeanOfArray(int[] integerArray)
    {
        float sumOfArray = (float) Arrays.stream(integerArray).sum();
        System.out.println("Mean of the given Array is : "+(sumOfArray/integerArray.length));
    }


    public static void main(String[] args) throws FileNotFoundException {
        Practice practice = new Practice();
        System.out.println("FizzBuzz ...................................");
        practice.printFizzBuzz(1,100);


        System.out.println();
        System.out.println("Find Leap year ...................................");
        if (practice.isLeapYear(2023)){
            System.out.println("Is leap year");
        }else {
            System.out.println("Not aL eap year");
        }


        System.out.println();
        System.out.println("sum of digits of a given integer. ...................................");
        int sumOfDigits = practice.sumOfDigits(245);
        System.out.println("int :  245 \nsum : "+sumOfDigits);

        int[] integerArray = {11, 1, 2, 3, 4, 5, 6, 11, 7, 8, 9, 10};

        System.out.println();
        System.out.println("min and max elements in an array of integers. ...................................");
        practice.printMinMax(integerArray);



        System.out.println();
        System.out.println("second largest number ...................................");
        int secondLargestNumber = practice.secondLargestNumber(integerArray);
        System.out.println(secondLargestNumber);


        System.out.println();
        System.out.println("second largest number ...................................");
        long countWords = practice.countWordsInFile("/home/nms-training/Documents/countWords.txt");
        System.out.println("number of words in file is : "+countWords);


        System.out.println();
        System.out.println("second largest number ...................................");
        practice.greatestCommonDivisor(19,5);


        System.out.println();
        System.out.println("Print Mean Of Array ...................................");
        practice.printMeanOfArray(integerArray);
        

        System.out.println();
        System.out.println("find the median of an array ...................................");
        practice.findTheMedianOfAnArray(integerArray);


        System.out.println();
        System.out.println("find the mode of an array ...................................");
        practice.findTheMode(integerArray);


    }

    private void findTheMode(int[] integerArray)
    {
        Map<Integer,Integer> array = new HashMap<>();


        for (int i : integerArray)
        {
            if (array.containsKey(i)){
                array.put(i,array.get(i)+1);
            }else {
                array.put(i,1);
            }
        }
        int max = 0;
        int temp = 0;
        for (Integer i : array.keySet())
        {
            if (max < array.get(i))
            {
                temp = i;
                max = array.get(i);
            }
        }
        System.out.println("Most Frequent Element : "+temp);
    }

    private void findTheMedianOfAnArray(int[] integerArray)
    {
        Arrays.sort(integerArray);

        int lengthOfArray = integerArray.length;
        if(lengthOfArray % 2 == 0)
        {
            System.out.println("Median of given array (even): "+(integerArray[lengthOfArray/2]+integerArray[(lengthOfArray/2)+1])/2);

        }else {
            System.out.println("Median of given array (odd): "+integerArray[(lengthOfArray+1)/2]/2);
        }


    }


}
