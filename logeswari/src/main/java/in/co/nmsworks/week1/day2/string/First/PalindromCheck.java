package in.co.nmsworks.week1.day2.string.First;

//Write a program to check if two words are palindrome
//Input : dad
//Output: Palindrome

public class PalindromCheck {

    static void palindromCheck() {
         String str="dad";
         String reverse=new StringBuilder(str).reverse().toString();
         if(str.equals(reverse)) {
             System.out.println("palindrom");
         }
         else {
             System.out.println("it is not palindrom");
         }



    }
    public static void main(String[] args) {
        palindromCheck();


        }
    }

