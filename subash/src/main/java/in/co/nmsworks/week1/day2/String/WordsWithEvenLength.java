package in.co.nmsworks.week1.day2.String;

public class WordsWithEvenLength {

    public static void main(String[] args)
    {
        String word="This is a Java Language";
        WordsWithEvenLength.evenLength(word);
    }
    public static void evenLength(String word)
    {
        String arr[]=word.split(" ");
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i].length()%2==0)
                System.out.println(arr[i]);
        }
    }
}
