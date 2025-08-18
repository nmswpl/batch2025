package in.co.nmsworks.week3.set2;

import java.util.Arrays;

public class Question3 {

    public static void main(String[] args) {
        String input1 = "The quick brown fox jumped over the lazy dog. It was a sunny day. The dog barked loudly.";
        String input2 = "Alice went to the market to buy fresh apples. Bob followed her. They chatted along the way.";

        System.out.println(Arrays.toString(counter(input1)));
    }

    private static int [] counter(String input) {
        int [] counterArray = new int[3];
        int letterCounter = 0;
        counterArray[0]= input.split("\\.").length;
        counterArray[1]= input.split(" ").length;
        for (int i =0 ; i <input.length();i++){
            char tempChar = input.charAt(i);
            if (tempChar == ' ' || tempChar == '.'){
                letterCounter++;
            }

        }
        counterArray[2] = input.length()-letterCounter;
        return counterArray;
    }
}
