//Given a string str, write a Java program to print all words with even length in the given string.

package in.co.nmsworks.week1.day2.string;

public class EvenLengthStrings {
    public static void main(String[] args) {

        printEvenLengthString("This is java Language");
    }

    public static void printEvenLengthString(String input) {
        String[] arr = input.split(" ");
        for (String s : arr) {
            if (s.length() % 2 == 0) {
                System.out.println(s);
            }
        }
    }
}



