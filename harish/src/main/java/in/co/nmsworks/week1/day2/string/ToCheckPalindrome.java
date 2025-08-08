/*2. Write a program to check if two words are palindrome
Input : dad
Output: Palindrome*/
package in.co.nmsworks.week1.day2.string;

public class ToCheckPalindrome {
    public static void main(String[] args) {
        String givenString = "Madam";
        iSpalindrome(givenString);
    }
    public static void iSpalindrome(String givenString){
        String reversedString = "";
        for(int i = givenString.length()-1; i >= 0; i--){
            reversedString = reversedString+givenString.charAt(i);
        }
        if (givenString.equalsIgnoreCase(reversedString)){
            System.out.println("The given string is Palindrome");
        }
        else{
            System.out.println("The given string is Not an Palindrome");
        }
    }
}
