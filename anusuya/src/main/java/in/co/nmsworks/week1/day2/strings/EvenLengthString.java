package in.co.nmsworks.week1.day2.strings;

/*
Given a string str, write a Java program to print all words with even length in the given
string.
Input
: s = "This is a java language"
Output
: This
is
java
language
 */
public class EvenLengthString {

    static void printEvenLengthString( String sentence ){

        String[] splittedSentence = sentence.split(" ");

        for(int i = 0; i <= splittedSentence.length-1; i++ ){
            if( (splittedSentence[i].length())%2 == 0){
                System.out.println(splittedSentence[i]);
            }
        }
    }

    public static void main(String[] args) {

        String sentence = "This is a java language";

        printEvenLengthString(sentence);
    }
}
