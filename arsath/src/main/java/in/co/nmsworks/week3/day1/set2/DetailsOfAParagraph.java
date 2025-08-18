package in.co.nmsworks.week3.day1.set2;

public class DetailsOfAParagraph {

    public static int[] printDetailsOfAParagraph(String input){
        String[] statement = input.split("\\.");
        String[] word = input.split(" ");

        int[] arr = new int[3];
        arr[0] = statement.length;
        arr[1] = word.length;
        arr[2] = input.length();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        return arr;
    }
    public static void main(String[] args) {
        String input = "The early morning sun cast a golden hue over the quiet village,where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        printDetailsOfAParagraph(input);
    }
}
