package in.co.nmsworks.week1.day2.string;

/**
 * Write a Java method to find the longest word in a given sentence.
 * Input: "The quick brown fox jumps over the lazy dog"
 * Output: "jumps"
 */
public class LongestWord {
    static  void longestWord(String input){
        String [] inputArray=input.split(" ");
        String result="";
        for(int i=0;i< inputArray.length;i++){
            String word=inputArray[i];
            if (word.length() >= result.length()) {
                result=word;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String input ="The quick brown fox jumps over the lazy dog";
        longestWord(input);
    }
}
