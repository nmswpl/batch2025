package in.co.nmsworks.week1.day2.strings;

/*
Write a Java method to find the longest word in a given sentence.
Input: "The quick brown fox jumps over the lazy dog"
Output: "jumps"
 */

public class LongestWord {

    public static void printLongestWord(String sentence){

        String[] splittedSentence = sentence.split(" ");
        int maximumLength = splittedSentence[0].length();
        int maximumIndex = 0;

        for(int i = 1; i < splittedSentence.length; i++){
            int currentLength = splittedSentence[i].length();
            if(currentLength >= maximumLength) {
                maximumLength = currentLength;
                maximumIndex = i;
            }
        }
        System.out.println(" Input : " + sentence);
        System.out.println(" Output : " + splittedSentence[maximumIndex]);
    }

    public static void main(String[] args) {

        String sentence = "The quick brown fox jumps over the lazy dog";

        printLongestWord(sentence);
    }
}
