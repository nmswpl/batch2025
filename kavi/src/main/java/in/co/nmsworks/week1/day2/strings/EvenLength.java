package in.co.nmsworks.week1.day2.strings;
//3.Given a string str, write a Java program to print all words with even length in the given
//string
public class EvenLength{
        public static void main(String[] args) {
            String s = "This is a java language";
            printEvenLength(s);
        }

        public static void printEvenLength(String str) {

            String[] words = str.split("");

            for (String word : words) {
                if (word.length() % 2 == 0) {
                    System.out.print(word + " ");
                }
            }
            System.out.println();
    }
}
