package in.co.nmsworks.week1.day2.string;

//2. Write a program to check if two words are palindrome
public class Palindrome
{
    public static void main(String[] args)
    {
        String str = "dad";
        boolean ans = checkPalindrome(str);
        if(ans)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean checkPalindrome(String str)
    {
        int  start = 0, end = str.length()-1;
        while(start < end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
