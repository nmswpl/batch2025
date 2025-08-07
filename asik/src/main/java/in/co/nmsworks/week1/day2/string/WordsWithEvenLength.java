package in.co.nmsworks.week1.day2.string;

/*
3. Given a string str, write a Java program to print all words with even length in the given string.
 */
public class WordsWithEvenLength
{
    public static void main(String[] args) {
        String str =  "This is a java language";
        printEvenLengthWords(str);
    }

    public static void printEvenLengthWords(String str)
    {
        String[] string = str.split(" ");
        for(String s : string)
        {
            if(s.length() % 2 == 0)
            {
                System.out.println(s + " ");
            }
        }
    }
}
