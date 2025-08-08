package in.co.nmsworks.week1.day2.strings;
/*
Write a Java method to convert a every word in a sentance to title case, where the first
letter of each word is capitalized.
Input : "the quick brown fox jumps over the lazy dog";
Output: "The Quick Brown Fox Jumps Over The Lazy Dog"
 */
public class TitleCase {
    public static void main(String[] args) {
        String inp = "the quick brown fox jumps over the lazy dog";
        System.out.println(getTitleCaseString(inp));
    }
    public static String getTitleCaseString(String s){
        String arr[] = s.split(" ");
        String res = "";
        for(int i = 0; i < arr.length; i++){
            String word = arr[i];
            String mid = Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            res += mid;
        }
        return res;
    }
}
