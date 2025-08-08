package in.co.nmsworks.week1.day2.strings;
//2.Write a program to check if two words are palindrome
//Input : dad
//Output: Palindrome
public class PalindromeCheck {
    public static void main(String[] args) {
       printPalindromeCheck();
    }
    public static void printPalindromeCheck(){
        String input="dad";
        String reverse="";
        for(int i=input.length()-1;i>=0;i--){
            reverse+=input.charAt(i);
        }
        if(input.equals(reverse)){
            System.out.println(reverse);
        }
        else{
            System.out.println("not palindrome");
        }
    }

}

