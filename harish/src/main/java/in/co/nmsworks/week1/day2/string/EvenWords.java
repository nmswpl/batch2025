/*Given a string str, write a Java program to print all words with even length in the given
string.
Input: s = "This is a java language"
Output: This
is
java
language
*/
package in.co.nmsworks.week1.day2.string;


public class EvenWords {

    public static void main(String[] args) {
        String givenString = "This is a java language";
        getEvenWords(givenString);

    }

    public static void getEvenWords(String givenString) {
        String[] splittedStringArray = new String[20];
        //String space="  ";
        splittedStringArray = givenString.split(" ");
        for (int i = 0; i < splittedStringArray.length; i++) {

            if (splittedStringArray[i].length() % 2 == 0) {
                    System.out.println(splittedStringArray[i]);
            }
        }
    }
}

/*if (!splittedStringArray[i].equals(space)) {
}
 */