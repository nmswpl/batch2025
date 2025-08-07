//1. Write a program to reverse words in a Sentence.
package in.co.nmsworks.week1.day2.string;

public class ReverseOfWords {
    public static void main(String[] args) {
        reverseWords("India is my country");

    }

    public static void reverseWords(String input) {
        String[] arr = input.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }


}


