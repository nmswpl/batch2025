package in.co.nmsworks.week3.day5;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PracticeQuestion {
    public static void main(String[] args) {
        PracticeQuestion practiceQuestion = new PracticeQuestion();

        practiceQuestion.practiceQuestion1(1,101);

        practiceQuestion.practiceQuestion2(2024);

        practiceQuestion.practiceQuestion3(286);

        practiceQuestion.practiceQuestion4(new int[]{3,7,1,0,2,7,3,8});

        practiceQuestion.practiceQuestion5(new int[]{9,3,2,37,0});

        practiceQuestion.practiceQuestionCountWord("/home/nms-training/Downloads/countWords.txt");

          practiceQuestion.practiceQuestionGCD(100,17);

        practiceQuestion.practiceQuestionMean(new int[]{2,7,5,4,3,1});

        practiceQuestion.practiceQuestionMedian(new int[]{3,7,4,2,2,0,1,8});

        practiceQuestion.practiceQuestionMode(new int[]{4, 7, 7, 7, 1, 1, 8});


    }

    private void practiceQuestionCountWord(String fileName) {


        int count = 0;

        try (BufferedReader br = new BufferedReader((new FileReader(fileName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] countWord = line.split(" ");
                count = countWord.length;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(count);

    }


    private void practiceQuestionGCD(int a, int b) {
        while (b > 0) {
            int r = a % b;
            System.out.println("a: " + a + ", b: " + b + ", remainder: " + r);
            a = b;
            b = r;
        }
        System.out.println("GCD is :: " + a);
    }


    private void practiceQuestionMode(int[] arr) {


        Map<Integer,Integer> integerIntegerMap = new HashMap<>();

        for (int i=0; i<arr.length; i++) {
            if (!integerIntegerMap.containsKey(arr[i])) {
                integerIntegerMap.put(arr[i],1);
            }
            else  {
                integerIntegerMap.put(arr[i],integerIntegerMap.get(arr[i]) + 1);
            }
        }


        int mode = arr[0];
        int max = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : integerIntegerMap.entrySet()) {
            if (integerIntegerEntry.getValue() > max) {
                max = integerIntegerEntry.getValue();
                mode = integerIntegerEntry.getKey();
            }

        }
        System.out.println("Mode :: " + mode);


    }

    private void practiceQuestionMedian(int[] arr) {
        int n = arr.length;

        if (n%2 != 0) {
            System.out.println(arr[arr.length/2]);
        }
        else {
            int firstM = arr[arr.length/2 -1] ;
            int secondM = arr[arr.length/2];

            int median = (firstM + secondM) / 2;
            System.out.println(median);
        }

    }

    private void practiceQuestionMean(int[] arr) {
        int n = arr.length;
        int total = 0;

        for (int i=0; i<n; i++) {
            total = total + arr[i];
        }
        int mean = total/3;
        System.out.println("Mean :: " + mean);
    }

    private void practiceQuestion5(int[] arr) {

        for (int i=0; i<arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        System.out.println(arr[arr.length-2]);

    }

    private void practiceQuestion4(int[] arr) {

        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length-1; j++) {
                if (arr[i] > arr[j+1]) {
                    int temp = arr[j +1];
                    arr[j + 1] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        System.out.println("Min :: " + arr[0]);
        System.out.println("Max :: " + arr[arr.length-1]);

    }

    private void practiceQuestion3(int integer) {
        int total = 0;


        while (integer > 0) {
            int temp = integer%10;
            total = total + temp;
            integer = integer/10;
        }

        System.out.println(total);



    }

    private void practiceQuestion2(int year) {

        if ((year % 4 == 0 && year % 100 == 0) || year % 400 == 0) {
                    System.out.println("The given year is leap year :: " + year);
            }
        else {
            System.out.println("The given year is not a leap year :: " + year);
        }



    }

    private void practiceQuestion1(int start, int end) {

        for (int i=start; i<end; i++) {
            if ((i%3 == 0) && (i%5 == 0)) {
                System.out.println("FizzBuzz");
            }
            else if (i%3 == 0) {
                System.out.println("Fizz");
            }
            else if (i%5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }



        }

    }
}
