package in.co.nmsworks.week1.day2.string;

public class Palindrome {
    // Write a program to check Palindrome
    public void checkPalindrome(String s){
        String rev = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            char c = s.charAt(i);
            rev += c;
        }
        if (s.equals(rev)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.checkPalindrome("dad");
        System.out.println("================");
        p.checkPalindrome("madhan");

    }
}
