// Write a Java program to remove duplicate characters from a string while preserving the order of the first occurrences.
package in.co.nmsworks.week1.day2.string;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        removeLeadingZeros("0005670");
    }

    public static void removeLeadingZeros(String input){
        int i=0;
        while(i<input.length() && input.charAt(i)=='0'){
            i++;
        }

        System.out.println(input.substring(i));

    }
}
