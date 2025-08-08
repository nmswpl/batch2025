/* Write a Java program to remove duplicate characters from a string while preserving the
order of the first occurrences.
Input: "aabbcc"
Output: "abc"*/

package in.co.nmsworks.week1.day2.String;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicates("aabbcc");
    }

    public static void removeDuplicates(String input){
        String output = "";
        for(int i = 0; i < input.length(); i++){
           char ch = input.charAt(i);
           if(output.indexOf(ch) == -1){
               output = output + ch;
           }
        }
        System.out.println(output);
    }
}


