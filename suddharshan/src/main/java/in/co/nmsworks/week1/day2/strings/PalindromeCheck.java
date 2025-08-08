package in.co.nmsworks.week1.day2.strings;
/*
Write a program to check if two words are palindrome
Input : dad
Output: Palindrome
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        String StrOne = "malayalam";
        String StrTwo = getReverse(StrOne);
        boolean compare = StrOne.equals(StrTwo);
        if (compare){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static String getReverse(String x){
        int len = x.length()-1;
        String res ="";
        for(int i = len; i >=0;i--){
            char ele = x.charAt(i);
            res += ele;
        }
        return res;
    }
}
