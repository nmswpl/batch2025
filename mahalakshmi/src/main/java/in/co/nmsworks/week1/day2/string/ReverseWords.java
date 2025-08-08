package in.co.nmsworks.week1.day2.string;
public class ReverseWords {
    // 1) Write a program to reverse words in a Sentence.
    //  Input : India is my country.
    //  Output: country my is India.

    public static void main(String[] args) {
        String str = "India is my country";
        reverseTheWords(str);
    }

    public static void reverseTheWords(String str) {
        String[] res = str.split(" ");
        for (int i = res.length-1 ; i >= 0 ; i--) {
            System.out.print(res[i] + " ");
        }
    }
}

