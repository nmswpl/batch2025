package in.co.nmsworks.week1.day2.strings;
/*
Given a string str, write a Java program to print all words with even length in the given
string.
Input
s = "This is a java language"
Output
: This
is
java
language
 */
public class WordsWithEvenLength {
    public static void main(String[] args) {
        String str = "This is a java language";
        findEvenWords(str);
    }
    public static void findEvenWords(String s){
        String arr[] = s.split(" ");
        for(int i = 0 ; i < arr.length; i++){
            if (arr[i].length() % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}
