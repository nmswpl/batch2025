package in.co.nmsworks.week1.day2.String;

public class FindLongestWord {
    public static void main(String args[])
    {
        new FindLongestWord().printLongestWord("The quick brown fox jumps over the lazy dog");
    }
    public void printLongestWord(String str)
    {
        String result="";
        String[] str2=str.split(" ");
        for(int i=0;i<str2.length;i++)
        {
            String word=str2[i];
            if(word.length() >= result.length())
            {
                result = word;
            }
        }
        System.out.print(result);
    }
}
