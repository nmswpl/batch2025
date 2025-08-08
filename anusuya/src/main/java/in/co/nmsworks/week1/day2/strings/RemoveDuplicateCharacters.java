package in.co.nmsworks.week1.day2.strings;

/*
Write a Java program to remove duplicate characters from a string while preserving the
order of the first occurrences.
Input: "aabbcc"
Output: "abc"
 */

public class RemoveDuplicateCharacters {

    public static void removeDuplicateCharacters ( String word ){

        String wordWithoutDuplication = "";

        for(int i = 0; i < word.length(); i++){
            if(wordWithoutDuplication.indexOf(word.charAt(i)) == -1){
                wordWithoutDuplication += word.charAt(i);
            }
            else{
                continue;
            }
        }
        System.out.println(" Input : " + word);
        System.out.println(" Output : " + wordWithoutDuplication);
    }

    public static void main(String[] args) {

        String word = "aabbcc";

        removeDuplicateCharacters(word);
    }
}
