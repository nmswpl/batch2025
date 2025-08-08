package in.co.nmsworks.week1.day2.string;

public class CheckPalindrome {

     public static void main(String[] args) {
         String word = "dad";
          checkWordsPalindrome(word);
    }

    private static void checkWordsPalindrome(String word)
    {
          if(isPalindrome(word))
          {
              System.out.println("Palindrome");

          }
          else
          {
              System.out.println("Not Palindrome");
          }
    }

    private static boolean isPalindrome(String word)
    {
         int left = 0; int right = word.length()-1;
         while(left < right)
         {
             if(word.charAt(left) != word.charAt(right))
             {
                 return false;
             }
             left++;
             right--;
         }
         return true;
    }
}
