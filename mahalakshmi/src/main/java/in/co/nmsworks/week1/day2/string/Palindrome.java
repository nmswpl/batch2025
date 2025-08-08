package in.co.nmsworks.week1.day2.string;
public class Palindrome {
        //    2. Write a program to check if two words are palindrome
        //    Input : dad
        //    Output: Palindrome
    public static void main(String[] args) {
        String str = "dad";
        if(isPalindrome(str)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length()-1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
