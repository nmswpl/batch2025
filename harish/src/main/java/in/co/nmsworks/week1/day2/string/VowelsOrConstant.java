/*
Write a Java program to count the number of vowels and consonants in a given string.
Input: "Hello World"
Output: Vowels: 3, Consonants: 7
 */
package in.co.nmsworks.week1.day2.string;

public class VowelsOrConstant {
    public static void main(String[] args) {
        String givenString = "hello world";
        vowelsOrConstant(givenString);
    }

    public static void vowelsOrConstant(String givenString) {
        String vowels = "aeiou";
        String constants = "bcdfghjklmnpqrstvwxyz";
        givenString.toLowerCase();
        int vowelCount = 0;
        int constantCount = 0;

        for (int i = 0; i < givenString.length(); i++) {
            String singleCharecter = "" + givenString.charAt(i);
            if (vowels.contains(singleCharecter)) {
                vowelCount ++;
            } else if (constants.contains(singleCharecter)) {

                constantCount ++;
            }
        }

        System.out.println("The number of vowels in the given string is :" +vowelCount);
        System.out.println("The number of constants in the given string is :" +constantCount);
    }
}



