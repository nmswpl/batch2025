/*
Write a program to reverse words in a Sentence.
Input : India is my country.
Output:country my is India.
 */

package in.co.nmsworks.week1.day2.String;

public class ReverseWords {

    public static void main(String[] args) {
        reverseWords("India is my country");
    }

    public static void reverseWords(String str){
        String[] words = str.split(" ");
        for(int i = words.length-1 ;i >= 0; i--){
            System.out.print(words[i] + " ");
        }
        
    }
}
