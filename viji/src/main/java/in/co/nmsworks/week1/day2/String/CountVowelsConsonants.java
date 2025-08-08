/*
Write a Java program to count the number of vowels and consonants in a given string.
Input: "Hello World"
Output: Vowels: 3, Consonants: 7 */

package in.co.nmsworks.week1.day2.String;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        printCountVowelsConsonants("Hello World");
    }

    public static void printCountVowelsConsonants(String string){
        int countVowels = 0;
        int countConsonants = 0;
        string = string.toUpperCase();
        for(int i = 0;i < string.length(); i++){
            char ch = string.charAt(i);
            if(ch == 'A' ||ch == 'E'||ch == 'I'||ch == 'O'|| ch == 'U'){
                countVowels++;
            }
            else if(ch >='A' && ch <= 'Z'){
                countConsonants++;
            }
        }
        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonants: " + countConsonants);

    }
}
