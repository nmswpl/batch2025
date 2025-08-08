package in.co.nmsworks.week1.day2.String;
//1. Write a program to reverse words in a Sentence.
//Input : India is my country.
//Output:country my is India.


public class ReverseWords {
    public static void main(String[] args)
    {
        System.out.print( new ReverseWords().printReverseWords("India is my country"));
    }
    public String printReverseWords(String str)
    {
        String reverseWords="";
        String str2[]=str.split(" ");
        for(int i=str2.length-1;i>=0;i--)
        {
            reverseWords=reverseWords+str2[i]+" ";
        }
        return reverseWords.trim();

    }
}
