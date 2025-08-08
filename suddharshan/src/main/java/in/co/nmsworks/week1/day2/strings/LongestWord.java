package in.co.nmsworks.week1.day2.strings;
/*
Write a Java method to find the longest word in a given sentence.
Input: "The quick brown fox jumps over the lazy dog"
Output: "jumps"
 */
public class LongestWord {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(getLongest(s));
    }
    public static String getLongest(String s){
        String arr[] = s.split(" ");
        String res = "";
        for(String word: arr){
            if(word.length() >= res.length()){
                res = word;
            }
        }
        return res;
    }
}
