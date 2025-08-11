/*5. Write a Java program that takes the below sentence and a word:
If the word exists in the sentence (case-insensitive).
If it exists, print the position (index) of the word's first character in the sentence.
Also print the first and last character of the word.
E.g: Sentence: Java is a popular programming language.
Word: Popular
Output : Word found at index: 10
First character of the word: P
Last character of the word: r*/

package in.co.nmsworks.week1.test;

import java.sql.SQLOutput;

public class FindWordExist {
    public static void main(String[] args) {
        printExistWordPosition("Java is a popular programming language", "popular");
    }

    public static void printExistWordPosition(String input, String word){
         String[] inputArray = input.split(" ");

         for(int i=0 ;  i < inputArray.length ; i++){
             if(inputArray[i].length() == word.length()) {
                 String words = inputArray[i];
                 System.out.println("Word found at index: " );
                 for (int j = 0; i < words.length(); j++) {
                     if (words.charAt(j) == word.charAt(j)){
                         continue;
                     }
                 }
                 System.out.println("First character of the word: "+word.charAt(0));
                 System.out.println("Last character of the word: "+ word.charAt(word.length()-1));

             }
         }

        
    }
}
