package in.co.nmsworks.week3.day5;

import in.co.nmsworks.week3.day3.Car;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Day4Practise
{
    public static void main(String[] args)
    {
        Day4Practise dp = new Day4Practise();
        int numbers = 100;
        dp. multipleInsteadOfPrint(numbers);

        int year = 2004;
        dp.leapYearOrNot(year);

        int[] sumNumber = {1,3,4};
       dp.sumOfDigits(sumNumber);

       int [] minAndMax = {1,2,5,4,7,};
       dp.findMinAndMax(minAndMax);

       int[] larNum = {1,3,5,55,77};
       dp.findSecondLargestNumber(larNum);

       dp.countWords("/home/nms-training/Documents/countWords.txt");

       int  a = 2;
       int b = 4;
       dp.gCD(a , b);

       int[] sumMeanNumber = {1,2,3,4};
       dp.meanSumOfDigits(sumMeanNumber);

       int[]  medianOddNumber = {1,2,7,3,5};
        int[] medianeven = {1,2,3,4};
       dp.findMedian(medianOddNumber ,medianeven);

       int[] freqNumber = {4,7,7,7,1,1,8};
       dp.findFrequency(freqNumber);

    }
    public  void  findFrequency(int[] frequencyNumber)
    {
        int count = 0;
        for (int i = 0;i<frequencyNumber.length;i++)
        {
            count++;
        }
        List<Integer> freq = Arrays.asList(4,7,7,7,1,1,8);
        System.out.println("4 frequency :"+ Collections.frequency(freq,4));
        System.out.println("7 frequency :"+ Collections.frequency(freq,7));
        System.out.println("1 frequency :"+ Collections.frequency(freq,1));
        System.out.println("8 frequency :"+ Collections.frequency(freq,8));

        Map<Integer,Integer> freq1= new HashMap<>();
        int count1 = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : freq1.entrySet())
        {

        }


    }
    public   void  findMedian(int[] medianNumber,int[] medianeven)
    {

        Arrays.sort(medianNumber);
        int length = medianNumber.length /2;
        System.out.println("Median in odd :"+medianNumber[length]);
        int length1 = medianeven.length / 2-1;
        System.out.println("median in even :"+medianeven[length1]);

    }

    public void  meanSumOfDigits(int[] meanSum)
    {
        int sum = 0;
        for (int i = 0; i < meanSum.length; i++)
        {
            sum =sum+meanSum[i];
        }
        System.out.println("Mean sum Of Digits :" + sum % meanSum.length);
    }
    public   void   gCD(int a , int b)
    {
      if (a > b)
      {
          while (b != 0) {
             int  rem = a / b;
              a = b;
              b = rem;
          }
      }
        System.out.println("GCD :" +a);
    }
    public  void  countWords(String filename)

    {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String Line;
            int count = 0;
            while ((Line = br.readLine()) != null)
            {
                String[]  s =Line.split(" ");
                count = count + s.length;
            }
            System.out.println("words  in the file :"+count);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public  void  findSecondLargestNumber(int [] secondLargest)
    {
        Arrays.sort(secondLargest);
        int secNum = secondLargest[secondLargest.length -2];
        System.out.println("Second Largest number :"+ secNum);
    }

    public  void  findMinAndMax(int[] miniAndMaximumNumber)
    {
        Arrays.sort(miniAndMaximumNumber);
        int min = miniAndMaximumNumber[0];
        int max = miniAndMaximumNumber.length-1;

        System.out.println("Minimum number "+min);
        System.out.println("Maximum number "+max);

    }
    public  void sumOfDigits(int[] sumOfResult) {

        int sum = 0;
        for (int i=0 ; i < sumOfResult.length ; i++)
        {
            sum =sum+sumOfResult[i];
        }
       // System.out.println("the Orginal number :"+sumOfResult);
        System.out.println("After sum of digits :"+sum);
    }


    public void leapYearOrNot(int year)
    {
        if (year % 4 == 0 &&  year%100 !=0)
        {
            System.out.println("This is Leap year :"+ year);
        }
        else if (year%400 == 0)
        {
            System.out.println("This is lep year :" +year);
        }
        else
            System.out.println("this year is not leap year");
    }


    public    void multipleInsteadOfPrint(int numbers)
    {
        for (int i=1;i<numbers ;i++) {
            if (i % 3 == 0) {
                System.out.println(" the number " + i + " multiple instead of Fizz");
            }
        }
        for (int i=1;i<numbers ;i++) {
            if (i % 5 == 0) {
                System.out.println("The number " + i + "multiple instead of buzz");
            }
        }
        for (int i=1;i<numbers ;i++)
        {
            if (i%3 == 0 && i%5 == 0)
            {
                System.out.println(" The number " +i+"and " +i+" multiple instead of FizzBuzz");
            }
        }
    }
}
