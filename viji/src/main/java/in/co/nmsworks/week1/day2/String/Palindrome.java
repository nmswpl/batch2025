/*
Write a program to check if two words are palindrome
Input : dad
Output: Palindrome*/
package in.co.nmsworks.week1.day2.String;

public class Palindrome {
    public static void main(String[] args) {

        boolean isPalindrome=palindrome("dad");
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean palindrome(String input){
        int i=0,j=input.length()-1;
        while(i < j){
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
