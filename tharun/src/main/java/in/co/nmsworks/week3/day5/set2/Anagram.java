package in.co.nmsworks.week3.day5.set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 5. Grouping Strings by Anagram
 * Problem: Given a list of strings, group all anagrams together in a map. The key should be a sorted version of the string, and the value should be a list of strings that are anagrams.
 * Example:
 * Input = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output = {
 *     "aet" -> ["eat", "tea", "ate"],
 *     "ant" -> ["tan", "nat"],
 *     "abt" -> ["bat"]
 * }
 * Hint: Convert every word to char[] and sort. Use new String(char[]) to get the new sorted String.
 */

public class Anagram {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();

        List<String> inputList = anagram.createList();
        System.out.println(inputList);
    }

    private List<String> createList() {

        List<String> inputList = new ArrayList<>();
        String [] inputArray = {"eat", "tea", "tan", "ate", "nat", "bat"};
        inputList.add("eat");
        inputList.add(Arrays.toString(inputArray));

        return inputList;
    }

}
