package in.co.nmsworks.week3.day5;

import java.util.HashMap;
import java.util.Map;

public class PracticeQuestionsSet3 {
    public static void main(String[] args) {
        PracticeQuestionsSet3 pq = new PracticeQuestionsSet3();
        pq.findNonRepeatingCharacter();
//        pq.textFormatUtility();
    }

//    private void textFormatUtility() {
//        String sentence= "This book is a boring read,but the review was exciting.";
//        System.out.println("Reversed Text : "+reverse(sentence));
//    }




    private void findNonRepeatingCharacter() {
        String str = "swiss";
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {

            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (i == 1) {
                System.out.println("The First Non repeating Character : "+str.charAt(i));
            }
        }
    }
}
