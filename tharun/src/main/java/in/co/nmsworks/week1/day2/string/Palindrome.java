package in.co.nmsworks.week1.day2.string;

public class Palindrome {

    static void isPalindrome(String value){
       boolean isCondition=true;
       int i=0 , valuelength=value.length()-1;
       while(isCondition && i<valuelength/2){
           if(value.charAt(i)!=value.charAt(valuelength-i)){
               isCondition=false;
               System.out.println("Not Palindrome");
               return;
           }
           //System.out.println(value.charAt(i)+" "+value.charAt(valuelength-i));
           i++;
       }
       if(isCondition){
           System.out.println("Palindrome");
       }
    }

    public static void main(String[] args) {
        isPalindrome("dad");

    }
}
