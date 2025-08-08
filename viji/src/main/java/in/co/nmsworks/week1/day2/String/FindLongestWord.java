/* Write a Java method to find the longest word in a given sentence.
Input: "The quick brown fox jumps over the lazy dog"
Output: "jumps"*/

package in.co.nmsworks.week1.day2.String;

public class FindLongestWord {
    public static void main(String[] args) {
        getLongestWordInSentence("The quick brown fox jumps over the lazy dog");

    }

    public static void getLongestWordInSentence(String string) {
        String[] words = string.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println(longestWord);
    }
}
