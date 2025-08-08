/*
Write a program to reverse words in a Sentence.
Input : India is my country.
Output:country my is India.
 */
package in.co.nmsworks.week1.day2.string;

public class ReverseTheString {
    public static void main(String[] args) {
            String givenString = "My name is harish";
            reverseTheString(givenString);
    }
    public static void reverseTheString(String givenString){
        String reversedString = "";
        String[] splittedStringArray = new String[20];
        splittedStringArray=givenString.split(" ");
        for (int i = splittedStringArray.length - 1; i >= 0 ; i--){
            reversedString = reversedString + splittedStringArray[i] + " ";
        }
        System.out.println("The given string is :" + givenString);
        System.out.println("The reversed string is :" + reversedString);
    }

}
