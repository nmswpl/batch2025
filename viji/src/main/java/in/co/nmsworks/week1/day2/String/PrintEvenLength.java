/* 3. Given a string str, write a Java program to print all words with even length in the given
string.
Input: s = "This is a java language"
Output: This
is
java
language
*/

package in.co.nmsworks.week1.day2.String;

public class PrintEvenLength {
    public static void main(String[] args) {
        printEvenLength("This is a java language");
    }

    public static void printEvenLength(String input){
        String[] words = input.split(" ");
        for(int i = 0;i < words.length ; i++){
            if(words[i].length() % 2 == 0){
                System.out.println(words[i] + " ");
            }
        }
    }
}
