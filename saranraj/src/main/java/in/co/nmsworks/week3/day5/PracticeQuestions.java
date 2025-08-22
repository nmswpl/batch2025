package in.co.nmsworks.week3.day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PracticeQuestions {
    public static void main(String[] args) {
        PracticeQuestions pq = new PracticeQuestions();
        pq.printFizzBuzz();
        pq.checkLeapYearOrNot();
        pq.calculateAndPrintSumOfDigit();
        pq.findAndDisplayMinAndMax();
        pq.findSecondLargestNumber();
        String fileName = "/home/nms-training/git/batch2025/saranraj/src/main/java/in/co/nmsworks/week3/day5/CountWords.txt";
        pq.countWordsAndDisplay(fileName);
        pq.findGreatestCommonDivisor();
        pq.findMeanInArray();
        pq.findMedianInArray();
        pq.findModeInArray();
    }

    private void findModeInArray() {
        int[] arr={4,7,7,7,1,1,8};
         Map<Integer,Integer> findFrequency = new HashMap<>();

          for (int i:arr) {
              findFrequency.put(i, findFrequency.getOrDefault(i,0)+1);
          }
          int maxfreq=0;
          for (int frequency:findFrequency.values()) {
              if (frequency>maxfreq) {
                  maxfreq=frequency;
              }
          }
        System.out.println(maxfreq);
          int number =1;
          int frequency =1;
          for (Map.Entry<Integer,Integer> value :findFrequency.entrySet()) {

              if(value.getValue()==maxfreq) {
                  System.out.println("The number : "+value.getKey() +" "+"The Frequency: "+value.getValue());
              }


          }

    }

    private void findMedianInArray() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n=arr.length;

        if (n%2==0) {
            int number = (int) ((arr[(n-2)/2]+arr[(n-1)/2])/2.0);
            System.out.println(arr[number]);
        }else {
            System.out.println(arr[n/2]);
        }

    }

    private void findMeanInArray() {
        int[] arr = {1,2,3,4,5};
        int sum=0;
        for (int i: arr) {
            sum+=i;
        }
        System.out.println("The result : "+(sum/arr.length));
    }

    private void findGreatestCommonDivisor() {
        int a =9;
        int b =3;
        int r;
        while (b>0) {
                r=a%b;
                a=b;
                b=r;
        }
        System.out.println("The GCD Number : "+a);

    }

    private void countWordsAndDisplay(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line = "";
            String[] words = new String[]{};
            int countWords = 0;

            while ((line = br.readLine()) != null) {
                words = line.split(" ");
                for (String word : words) {
                    countWords++;
                }
            }
            System.out.println(countWords);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void findSecondLargestNumber() {
        int[] arr = {10, 21, 34, 66, 4, 54};
        int n = arr.length; //6
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The Second Largest Number in Array : " + arr[arr.length - 2]);
    }

    private void findAndDisplayMinAndMax() {
        int[] arr = {10, 21, 34, 66, 4, 54};
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i > maxNumber) {
                maxNumber = i;
            }
            if (i < minNumber) {
                minNumber = i;
            }
        }
        System.out.println("The Max Number : " + maxNumber + "&" + "The Min Number : " + minNumber);
    }

    private void calculateAndPrintSumOfDigit() {
        int number = 12345;
        int sum = 0;

        while (number > 0) {
            int eachNumber = number % 10;
            sum = sum + eachNumber;
            number = number / 10;
        }
        System.out.println("The Sum Of Digit : " + sum);
    }


    private void checkLeapYearOrNot() {

        int year = 2025;
        if ((year % 4) == 0) {
            System.out.println("leap year");

        } else if ( year % 100 == 0) {
            if (year % 400 == 0){
                System.out.println("leap year");
            }
        } else {
            System.out.println("Not leap year");
        }

    }

    public static void printFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
        }
    }
}
