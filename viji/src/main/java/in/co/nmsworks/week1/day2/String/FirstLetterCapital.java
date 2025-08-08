/* Write a Java method to convert a every word in a sentance to title case, where the first
letter of each word is capitalized.
Input : "the quick brown fox jumps over the lazy dog";
Output: "The Quick Brown Fox Jumps Over The Lazy Dog"  */

package in.co.nmsworks.week1.day2.String;

public class FirstLetterCapital {
    public static void main(String[] args) {
        wordFirstLetterCapital("the quick brown fox jumps over the lazy dog");
    }

    public static void wordFirstLetterCapital(String input){
        String[] words = input.split(" ");
        String output = "";
        for(int i=0; i< words.length; i++){
               output =output + words[i].substring(0,1).toUpperCase() + words[i].substring(1, words[i].length())+ " ";
        }

        System.out.println(output);
        }
    }



