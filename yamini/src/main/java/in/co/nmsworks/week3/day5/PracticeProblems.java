package in.co.nmsworks.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeProblems {

    public static void main(String[] args) throws IOException {
        PracticeProblems pp = new PracticeProblems();
        //pp.printAlternateStrings();
        //pp.isLeapYear(100);
        // pp.sumOfDigits(343);
        // pp.findMinMa(new int[]{23, 12, 56, 34, 7, 18});
        pp.secondLargest(new int[]{11, 12, 13, 14, 15, 16});
        pp.findMean(new int[]{2, 5, 1, 8, 3, 7});
        pp.findMedian(new int[]{1, 2, 12, 10, 5, 6});
        pp.findGCD(30, 20);
        pp.countOfWords("/tmp/countWords.tt");
        pp.findMode(new int[]{4, 7, 7, 7, 1, 1, 8});
    }

    public void printAlternateStrings() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print("'FizzBuzz' ");
            } else if (i % 3 == 0) {
                System.out.print("'Fizz' ");
            } else if (i % 5 == 0) {
                System.out.print("'Buzz' ");
            } else System.out.print(i + " ");
        }

    }

    public void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    public void sumOfDigits(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int last = temp % 10;
            sum += last;
            temp = temp / 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }

    public void findMinMa(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element is: " + min + " ,The maximum element is: " + max);

    }

    public void secondLargest(int[] arr) {
        int large = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                second = large;
                large = arr[i];
            } else if (arr[i] < large && arr[i] > second) {
                second = arr[i];
            }
        }
        System.out.println("The second Largest is: " + second);

    }

    public void findMean(int[] arr) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            sum += arr[i];
        }
        int mean = sum / count;
        System.out.println("Mean of the Array: " + mean);
    }

    public void findMedian(int[] arr) {
        int median = 0;
        int mid = (arr.length - 1) / 2;
        System.out.println(mid);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        if (count % 2 == 0) {
            median = (arr[mid] + arr[mid + 1]) / 2;

        } else {
            median = arr[mid];
        }
        System.out.println("Median is: " + median);
    }

    public void findGCD(int number1, int number2) {
        int remainder = 0;
        int a = number1;
        int b = number2;
        while (b > 0) {
            remainder = a % b;
            a = b;
            b = remainder;
        }
        System.out.println("The GCD is: " + a);

    }

    public void findMode(int[] arr) {
        Map<Integer, Integer> result = new LinkedHashMap<>();
        int count = 0;
        int high = -1;
        for (int i = 0; i < arr.length; i++) {
            result.put(arr[i], result.getOrDefault(arr[i], 0) + 1);
        }

        for (var entry : result.entrySet()) {
            int val = entry.getKey();
            int freq = entry.getValue();
            if (count < freq || (freq == count && val > high)) {
                high = val;
                count = freq;
            }
        }
//        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
//            if (count < entry.getValue() || (entry.getKey() == count && entry.getKey() > high)) {
//                high = entry.getKey();
//                count = entry.getValue();
//            }
//
//        }
        System.out.println(high);

        System.out.println("The mode is: " + high + ": " + count);


    }

    public void countOfWords(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String result = "";
            String line;
            while ((line = br.readLine()) != null) {
                result += line;
            }
            String[] arr = result.split("\\W");
            int count = 0;
            for (String words : arr) {
                count++;
                //System.out.println(words);
            }
            System.out.println("Count of Words: " + count);
        }

    }

}
