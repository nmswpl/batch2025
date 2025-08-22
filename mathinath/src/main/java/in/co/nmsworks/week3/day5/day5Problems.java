package in.co.nmsworks.week3.day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day5Problems {
    public static void main(String[] args) {
        day5Problems day5 = new day5Problems();
        day5.printNumbers();
        day5.leapYear();
        day5.sumOfDigits();
        day5.findMinAndMax();
        day5.secondLargestNumber();
        day5.findGcd();
        day5.meanOfArray();
        day5.medianOfArray();
        day5.countWords();
        day5.countFrequency();
    }

    private void countFrequency() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(1);
        list.add(1);
        list.add(8);
        Map<Integer,Integer> map = new HashMap<>();
        System.out.println(list);
        for (Integer list1 : list) {
            if(map.containsKey(list1))
            {
                map.put(list1,map.get(list1)+1);
            }
            else
            {
                map.put(list1,1);
            }
        }
        System.out.println(map);
        System.out.println(map.values());
        int mapValue = 0;
        int mod = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(mapValue < entry.getValue())
            {
                mapValue = entry.getValue();
                mod = entry.getKey();

            }
        }
        System.out.println(mapValue);
        System.out.println("The mod is: "+mod);
    }

    private void countWords() {
        String filename = "/home/nms-training/countWords.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null)
            {
                String[] words = line.split(" ");
                for (String word : words) {
                    count++;
                }
            }
            System.out.println("The count of words: "+count);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void medianOfArray() {
        int arr[]={1,2,3,4,5,6};
        int count = 0;
        for (int i : arr) {
            count++;
        }
        System.out.println(count);
        if(count % 2 ==0)
        {
            int res = (arr[(count/2)-1] + arr[(count/2)])/2;
            System.out.println("The median of an array: "+res);
        }
        else
        {
            System.out.println("The median od an array: "+arr[count/2]);
        }

    }

    private void meanOfArray() {
        int arr[] = {1,2,3,4,5};
        int sum = 0;
        int count  = 0;
        for(int i =0;i<arr.length;i++)
        {
            sum = sum +arr[i];
            count++;
        }
        int mean = sum/count;
        System.out.println("The mean of the array is: "+mean);
    }

    private void findGcd() {
        int a = 20;
        int b = 2;
        int r = a % b;
        while(b !=0)
        {
            a = b;
            b = r;
        }
        System.out.println("The gcd is "+a);
    }

    private void secondLargestNumber() {
        int arr[] = {1,2,3,4,5};
        int max = arr[0];
        int secMax = arr[0];
        for (int i = 0;i<arr.length;i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        for (int i = 0;i<arr.length;i++)
        {
            if(max > arr[i] && max != arr[i])
            {
                secMax = arr[i];
            }
        }
        System.out.println("The second largest number in the array: "+secMax);
    }

    private void findMinAndMax() {
        int arr[] = {1,3,2,4,5};
        int min = arr[0];
        int max = arr[0];
        for (int i =0 ;i< arr.length;i++)
        {
            if (min > arr[i])
            {
                min = arr[i];

            }
        }
        for (int i=0 ; i< arr.length;i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("The Minimum number in the array : "+min);
        System.out.println("The maximum number in the array :"+max);

    }

    private void sumOfDigits() {
        int number = 123;
        int sum = 0;
        while (number > 0)
        {
            int digit = number % 10;
            sum=sum+digit;
            number =number /10;
        }
        System.out.println("The sum is :"+sum);
    }

    private void leapYear() {
        int year = 2004;
        if((year % 4 ==0 && (year % 100 !=0)) || year % 400 == 0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }

    private void printNumbers() {
        for (int i = 1;i <= 100;i++)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i%3 == 0)
            {
                System.out.println("Fizz");
            }
            else
            {
                System.out.println("Buzz");
            }
        }
    }
}
