package in.co.nmsworks.week3.day1.set2;

import java.util.Arrays;

public class DetailsOfAParagraph {

    public static int[] printDetailsOfAParagraph(String input) {

        String[] statements = input.trim().split("\\.");

        String[] words = input.trim().split(" ");


        int letterCount = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }

        int[] arr = new int[3];
        arr[0] = statements.length;
        arr[1] = words.length;
        arr[2] = letterCount;

        System.out.println("Statements: " + arr[0]);
        System.out.println("Words: " + arr[1]);
        System.out.println("Letters: " + arr[2]);

        System.out.println(Arrays.toString(arr));

        return arr;


    }

    public static void main(String[] args) {
        String input = "The early morning sun cast a golden hue over the quiet village,where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        printDetailsOfAParagraph(input);
    }
}
