//Write a Java method to find the longest word in a given sentence.
package in.co.nmsworks.week1.day2.string;

public class LongestWord {
    public static void main(String[] args) {
        longestWord("The quick brown fox jumps over the lazy dog");

    }

    public static void longestWord(String input) {
        String[] arr = input.split(" ");
        int index=0;
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>=maxLength) {
                maxLength = arr[i].length();
                index=i;
            }
        }
        System.out.println(arr[index]);

    }
}
