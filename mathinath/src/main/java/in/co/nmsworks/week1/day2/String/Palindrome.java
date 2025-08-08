package in.co.nmsworks.week1.day2.String;
//2. Write a program to check if two words are palindrome
//Input : dad
//Output: Palindrome
public class Palindrome {
    public static void main(String args[])
    {
        new Palindrome().checkPalindrome("dad");
    }
    public void checkPalindrome(String str)
    {
        String newword="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            newword+=ch;
        }
        if(str.equals(newword))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not A Palindrome");
        }
    }
}
