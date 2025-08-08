package in.co.nmsworks.week1.day2.strings;
/*
Write a Java program to remove duplicate characters from a string while preserving the
order of the first occurrences.
Input: "aabbcc"
Output: "abc"
 */
public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String input = "aabbcc";
        System.out.println(removeDuplicates(input));
    }
    public static String removeDuplicates(String s){
        String res = "";
        for(int i = 0; i < s.length();i++){
            char ele = s.charAt(i);
            if(res.indexOf(ele) == -1){
                res += ele;
            }
        }
        return res;
    }
}
