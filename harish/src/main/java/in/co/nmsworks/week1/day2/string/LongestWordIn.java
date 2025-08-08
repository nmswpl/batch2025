/*
. Write a Java method to find the longest word in a given sentence.
  Input: "The quick brown fox jumps over the lazy dog"
  Output: jumps
 */
package in.co.nmsworks.week1.day2.string;

public class LongestWordIn {
    public static void main(String[] args) {
        String givenString = "The quick brown fox jumps over the lazy dog";
        getLargestWords(givenString);
    }
    public static void getLargestWords(String givenString) {
        String[] splittedStringArray = givenString.split(" ");
        int maximumLength = splittedStringArray[0].length();
        int maximumIndex = 0;
        for (int i = 1; i < splittedStringArray.length; i++) {

            if(splittedStringArray[i].length() >= maximumLength){
                maximumLength = splittedStringArray[i].length();
                maximumIndex = i;
            }
        }
        System.out.println(splittedStringArray[maximumIndex]);
    }
}
