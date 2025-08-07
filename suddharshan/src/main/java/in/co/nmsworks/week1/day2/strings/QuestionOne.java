package in.co.nmsworks.week1.day2.strings;
/*
1. Write a program to reverse words in a Sentence.
Input : India is my country.
Output: country my is India.
 */
public class QuestionOne {
    public static void main(String[] args) {
        String statements = "India is my country.";
        reverse(statements);
    }
    public static void reverse(String x){
        String arr [] =x.split(" ");
        String res = arr.toString();
        System.out.println(res);
    }
}
