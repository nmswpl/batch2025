package in.co.nmsworks.week1.day2.string;

//1. Write a program to reverse words in a Sentence.
public class ReverseWords
{
    public static void main(String[] args)
    {
        String str = "India is my country";
        reverseWords(str);
    }

    public static void reverseWords(String str)
    {
        String[] string = str.split(" ");
        for(int i = string.length-1; i >= 0; i--)
        {
            System.out.print(string[i] + " ");
        }
    }
}
