package in.co.nmsworks.week1.day2.String;

//2. Write a program to check if two words are palindrome
//Input : dad
//Output: Palindrome


public class IsPalindrome {

    public static boolean isPalindrome(String str){

        int i = 0, j = str.length()-1;

        while(i <= j){
            if (str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String Str = "Gaja1ajaG";
        System.out.println(isPalindrome(Str));

    }
}
