package in.co.nmsworks.week1.day2.strings;

/*Write a program to reverse words in a Sentence.
Input : India is my country.
Output:
country my is India.
*/

public class ReverseString {

    public static void displayStringReverse(String line){

        String[] splittedLine = line.split(" ");

        for(int i = splittedLine.length-1; i >= 0; i--){
            System.out.print(splittedLine[i] + " ");
        }
    }

    public static void main(String[] args) {

        String line = "India is my country";
        displayStringReverse(line);
    }
}
