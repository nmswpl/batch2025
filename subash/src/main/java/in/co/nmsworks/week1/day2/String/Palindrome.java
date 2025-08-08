package in.co.nmsworks.week1.day2.String;

public class Palindrome {
    public static void main(String[] args)
    {
        String sentence="madam";
        String reverse = new Palindrome().reverseSentence(sentence);
        if(sentence.equals(reverse))
            System.out.println(sentence+" is a palindrome");
        else
            System.out.println(sentence+ " is not a palindrome");
    }
    public static String reverseSentence(String sentence)
    {
        String reversed = "";
        for(int i=sentence.length()-1;i>=0;i--)
        {
            reversed=reversed+sentence.charAt(i)+"";
        }
        return reversed;
    }

}
