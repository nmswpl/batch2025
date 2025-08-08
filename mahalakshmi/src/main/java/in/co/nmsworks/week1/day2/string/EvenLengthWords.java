package in.co.nmsworks.week1.day2.string;
public class EvenLengthWords {
//    3. Given a string str, write a Java program to print all words with even length in the given
//    string.
    public static void main(String[] args) {
        String s = "This is a java language";
        printWordsWithEvenLength(s);
    }

    public static void printWordsWithEvenLength(String str) {
        String[] strarr = str.split(" ");
        for(String s : strarr) {
            if(s.length() % 2 == 0)
                System.out.println(s);
        }
    }
}
