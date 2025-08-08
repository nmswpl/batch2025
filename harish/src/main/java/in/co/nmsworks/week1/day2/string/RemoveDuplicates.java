/*
Write a Java program to remove duplicate characters from a string while preserving the
order of the first occurrences.
  Input: "aabbcc"
  Output: "abc
 */
package in.co.nmsworks.week1.day2.string;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String givenString = "aabbbcccdd";
        removeDuplicate(givenString);
    }

    public static void removeDuplicate(String givenString){
        String result ="" + givenString.charAt(0);
        for(int i = 1; i < givenString.length(); i++){
            boolean isDuplicate = false;
            for(int j = 0; j < result.length(); j++){
                if(givenString.charAt(i) == result.charAt(j)){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                result = result + givenString.charAt(i);
            }
        }
        System.out.println(result);
    }
}
