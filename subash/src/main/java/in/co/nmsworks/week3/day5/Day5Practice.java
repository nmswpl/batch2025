package in.co.nmsworks.week3.day5;

import java.io.*;
import java.util.*;

public class Day5Practice {

    public static void main(String[] args)
    {
        Day5Practice dp = new Day5Practice();
        dp.printWordsForInt();
        dp.findLeapYear(2020);
        dp.findSumOfDigits(245678);
        int arr[] = new int[]{5,67,3,3,3,3,3,3,7,8,89,9,9,10};
        dp.findMinandMax(arr);
        dp.secondLargest(arr);
        dp.countWords("/tmp/count.txt");
        dp.gcdFinder(50,20);
        dp.meanFinder(arr);
        dp.medianFinder(arr);
        dp.mostFrequentElement(arr);
    }

    private void mostFrequentElement(int[] arr)
    {
        List<Integer> numbers=new ArrayList<>();
        for(int i=0;i< arr.length;i++)
        {
            numbers.add(arr[i]);
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
        System.out.println("Max Frequency Element is : "+maxFrequencyElement);
    }

    private void medianFinder(int[] arr)
    {
        int mid=0;
        int length = arr.length;
        if(length%2!=0) {
            mid = length / 2;
            System.out.println(arr[mid]);
        }
        else
        {
            mid = length/2;
            int sum = arr[mid]+arr[mid-1];
            int avg = sum/2;
            System.out.println(avg);
        }
    }

    private void meanFinder(int[] arr)
    {
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            sum+=arr[i];
        }
        int mean = sum/ arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.println("Mean of the Array is : "+mean);
    }

    private void gcdFinder(int a, int b)
    {
        if(a>b) {
            int r = 0;
            while (true)
            {
                r = a % b;
                a = b;
                b = r;
                if(b<=0)
                    break;
            }
            System.out.println(a);
        }
        else
            System.out.println("Number 1 is Smaller than Number 2");


    }

    private void countWords(String filename)
    {
        try (BufferedReader bf = new BufferedReader(new FileReader(filename)))
        {
            String line;
            int length=0;
            while((line= bf.readLine())!=null)
            {
                String arr[] = line.split(" ");
                length+= arr.length;
            }
            System.out.println(length);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void secondLargest(int[] arr)
    {
        int firstMax=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>firstMax)
                firstMax=arr[i];
        }
        int secondMax=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>secondMax && arr[i]!=firstMax )
                secondMax=arr[i];
        }
        System.out.println(secondMax);
    }

    private void findMinandMax(int[] arr)
    {
        int min=arr[0];
        int max=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];

            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Min element in Array : "+min);
        System.out.println("Max element in Array : "+max);


    }

    private void findSumOfDigits(int number)
    {
        int sum=0;
        while (number>0)
        {
            int rem = number%10;
            sum=sum+rem;
            number=number/10;
        }
        System.out.println(sum);
    }


    private void findLeapYear(int year)
    {
        if((year%4==0 || year%400==0) && year%100!=0)
        {
            System.out.println(year+" is leap year");
        }
        else
            System.out.println(year+" is not a leap year");

    }

    public void printWordsForInt()
    {
        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0) {
                System.out.println(i+" Fizz And Buzz");
            }
            else if (i % 3 == 0)
                    System.out.println(i + " : Fizz");
            else if (i % 5 == 0) {
                    System.out.println(i + " : Buzz");
                }
            }
        }
    }

