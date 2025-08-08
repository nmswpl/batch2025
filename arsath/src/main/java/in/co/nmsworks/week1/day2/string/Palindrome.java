package in.co.nmsworks.week1.day2.string;
//Write a program to check if two words are palindrome
public class Palindrome {
    public static void checkPalindrome(String str){
        char left = str.charAt(0);
        char right = str.charAt(str.length()-1);
        while(left<=right){
            if(left==right){
                System.out.println("Palindrome");
                left++;
                right--;
            }
            else{
                System.out.println("Not a Palindrome");
            }
        }
    }
    public static void main(String[] args) {
        String str = "dad";
        checkPalindrome(str);
    }
}
