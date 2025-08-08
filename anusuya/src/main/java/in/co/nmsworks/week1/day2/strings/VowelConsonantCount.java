package in.co.nmsworks.week1.day2.strings;

/*
Write a Java program to count the number of vowels and consonants in a given string.
Input: "Hello World"
Output: Vowels: 3, Consonants: 7
 */

public class VowelConsonantCount {

    public static void printVowelConsonantCounting (String sentence){

        String vowels = "aeiouAEIOU";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        int vowelCount = 0;
        int consonantCount = 0;

        for(int i = 0; i <= sentence.length()-1; i++){

            if(vowels.indexOf(sentence.charAt(i)) != -1){
                vowelCount ++;
            }
            if (consonants.indexOf(sentence.charAt(i)) != -1){
                consonantCount++;
            }
        }

        System.out.println( " Vowels : " + vowelCount + ", Consonants : " + consonantCount);
    }

    public static void main(String[] args) {

        String sentence = "Hello World";

        printVowelConsonantCounting(sentence);
    }
}
