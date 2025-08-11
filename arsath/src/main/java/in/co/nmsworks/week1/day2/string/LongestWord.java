package in.co.nmsworks.week1.day2.string;

public class LongestWord {

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= longest.length()) {
                longest = words[i];
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println("Longest word: " + findLongestWord(input));
    }
}
