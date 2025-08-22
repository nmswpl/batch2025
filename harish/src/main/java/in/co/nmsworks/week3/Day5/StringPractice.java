package in.co.nmsworks.week3.Day5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringPractice {
    public static void main(String[] args) {
        StringPractice stringPractice = new StringPractice();
        stringPractice.printTheMultiplesOf3And5(100);
        stringPractice.leapYear(2004);
        stringPractice.sumOfDigits(12345);
        int[] numbers = {2,4,6,12,1,7,80};
        int[] oddLengthNumbers = {1,2,3,5,6,7};
        stringPractice.minAndMax(numbers);
        stringPractice.secondLargestNumber(numbers);
        stringPractice.countTheWords("/home/nms-training/Downloads/countWords.txt");
        stringPractice.gcdOfTwoNumbers(40,20);
        stringPractice.meanOfAnArray(numbers);
        stringPractice.medianOfAnArray(numbers);
        stringPractice.medianOfAnArray(oddLengthNumbers);
        int[] numbersWithDuplicates = {1,2,2,2,3,3,3,3,1,4,5};
        stringPractice.mostFrequencyOfAnArray(numbersWithDuplicates);

    }

    private void mostFrequencyOfAnArray(int[] numbersWithDuplicates) {
        int maximumCount = 0;
        int maximumFrequencyNumber = 0;
        for (int numbers : numbersWithDuplicates) {
            int singleNumberCount = 0;
            for (int i = 0; i < numbersWithDuplicates.length; i++) {
                if (numbers == numbersWithDuplicates[i]){
                    singleNumberCount ++;
                }
                if (singleNumberCount > maximumCount){
                    maximumCount = singleNumberCount;
                    maximumFrequencyNumber = numbers;
                }
            }
        }
        System.out.println("The Number with Maximum Frequency :" + maximumFrequencyNumber);
    }

    private void medianOfAnArray(int[] numbers) {
        if(numbers.length % 2 != 0){
            System.out.println("The median of an array :" + numbers[numbers.length/2]);
        }
        else{
            int middleIndex = numbers.length/2;
            System.out.println("The median of an array :" + (numbers[middleIndex] + numbers[middleIndex -1])/2);
        }
    }

    private void meanOfAnArray(int[] numbers) {
        int sumOfNumbers = 0;
        for (int number : numbers) {
            sumOfNumbers += number;
        }
        System.out.println("The mean of an array :" + sumOfNumbers/numbers.length);
    }

    private void gcdOfTwoNumbers(int number1 ,int number2) {
        int reminder;
        if (number1 > number2) {
            while (number2 > 0){
                reminder =  number1 % number2;
                number1 = number2;
                number2 = reminder;
            }
        }
        System.out.println("The greatest common divisor of two numberrs :" + number1);
    }

    private void countTheWords(String filename) {
        String alphabet = "abcdefghijklmnopqrstuviwxyz";
        try (FileReader fileReader = new FileReader(filename)) {
            int ch;

            int count = 0;
            while ((ch = fileReader.read()) != -1 ){
                String letter = "" + (char)ch;
                if (alphabet.contains(letter.toLowerCase())){
                    count ++;
                }
            }
            System.out.println("The word count :" + count);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void secondLargestNumber(int[] numbers) {
        int largestNumber = numbers[0];
        int secondLargestNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > secondLargestNumber){
                if(numbers[i] > largestNumber){
                    secondLargestNumber = largestNumber;
                    largestNumber = numbers[i];
                }
                else {
                    secondLargestNumber = numbers[i];
                }
            }
        }
        System.out.println("Second Largest Number :" + secondLargestNumber);
    }

    private void minAndMax(int[] numbers) {
        int minimumValue = numbers[0];
        int maximumValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximumValue){
                maximumValue = numbers[i];
            }
            else if (numbers[i] < minimumValue) {
                minimumValue = numbers[i];
            }
        }
        System.out.println("Minimum Value :" + minimumValue);
        System.out.println("Maximum Value :" + maximumValue);
    }

    private void sumOfDigits(int num) {
        int digit = 0;
        int number = 0 ;

        while (num > 0){
            digit = num % 10;
            number = number + digit;
            num = num / 10;
        }
        System.out.println("Sum of digits " + number);

    }

    private void leapYear(int year) {

        if(year % 4 == 0 ){
            if(year % 400 == 0 || year % 100 != 0){
                System.out.println("The given year " + year + " is a leap year");
            }
            else{
                System.out.println("The given year is not an leap year");
            }
        }
        else {
            System.out.println("The given year is not an leap year");
        }
    }

    private void printTheMultiplesOf3And5(int limit) {
        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("The number " + i + " is divided by FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("This number " + i + " is Divided by Fizz ");
            }
            else if (i % 5 == 0) {
                System.out.println("This number " + i + "is divided by Buzz ");

            }
        }
    }
}
