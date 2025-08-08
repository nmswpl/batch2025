package in.co.nmsworks.week1.day2.strings;

/*
Write a program to check if two words are palindrome
Input : dad
Output: Palindrome
 */
public class Palindrome {

    public static void checkPalindrome(String word){

        int length = word.length();
        int j = length-1;
        boolean isPalindrome = true;

        for(int i = 0; i <= length/2; i++){
            if(word.charAt(i) == word.charAt(j)){
                isPalindrome = true;
            }
            else{
                isPalindrome = false;
                break;
            }
            j--;
        }

        if(isPalindrome){
            System.out.println(word + " is a palindrome ");
        }
        else{
            System.out.println(word + " is not a palindrome ");
        }
    }

    public static void main(String[] args) {

        String word = "Madam";
        checkPalindrome(word);
    }
}
