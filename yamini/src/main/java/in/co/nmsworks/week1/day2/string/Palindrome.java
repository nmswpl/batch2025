//Write a program to check if two words are palindrome
package in.co.nmsworks.week1.day2.string;
public class Palindrome {
    public static void main(String[] args) {
        palindrome("dad");

    }
    public static void palindrome(String input) {
        String reversed="";
        for(int i=input.length()-1;i>=0;i--){
            reversed+=input.charAt(i);
        }
       if(reversed.equalsIgnoreCase(input)){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not Palindrome");
       }

    }
}
