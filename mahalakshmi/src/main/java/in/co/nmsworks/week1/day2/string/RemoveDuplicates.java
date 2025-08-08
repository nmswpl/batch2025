package in.co.nmsworks.week1.day2.string;

public class RemoveDuplicates {
    // 7. Write a Java program to remove duplicate characters from a string while preserving the
    //order of the first occurrences.
    public static void main(String[] args) {
        String str = "aabbcc";
        System.out.println(removeDuplicateLetter(str));
    }

    public static String removeDuplicateLetter(String str) {
        String result = "";
        for(int i = 0 ; i < str.length() ; i++) {
            char c = str.charAt(i);
            if(result.indexOf(c) == -1) {
                result += c;
            }
        }
        return result;
    }
}
