package in.co.nmsworks.week3.day1.exam.set2;

import java.util.Arrays;

public class PrintPosition {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new PrintPosition().position()));
    }

    public int[] position() {
        String str1 = "The quick brown fox jumped over the lazy dog. It was a sunny day. The dog barked loudly.";
//        String[] str2 = new String[]{"Alice went to the market to buy fresh apples. Bob followed her. They chatted along the way."};
        String[] statements = str1.split("\\.");
        String[] words = str1.split(" ");
        int countWords = 0;
        int countStatement = 0;
        int countLetters = 0;
        for(int i=0;i<statements.length;i++)
        {
            countStatement++;
        }
        System.out.println("The count of statement: "+countStatement);
        for(int j=0;j<words.length;j++)
        {
            countWords++;
        }
        System.out.println("The count of words: "+countWords);
        String[] ch = str1.split("");
        countLetters=ch.length;
        System.out.println("The count of Letters: "+countLetters);
        int arr[]=new int[]{countStatement,countLetters,countWords};

        return arr;

    }
}
