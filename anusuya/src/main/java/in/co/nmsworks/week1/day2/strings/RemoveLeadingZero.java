package in.co.nmsworks.week1.day2.strings;

/*Given a number as String, write a program that removes the leading 0
Input :
0005640
output:
5640
 */

public class RemoveLeadingZero {

    public static void printStringRemoveLeadingZero (String word){

        int i = 0;
        while( i <= word.length()-1) {
            if (word.charAt(i) != '0') {
                System.out.println(word.substring(i));
                break;
            }
            i++;
        }
    }

    public static void main(String[] args) {

        String word = "0005040";

        printStringRemoveLeadingZero(word);
    }
}
