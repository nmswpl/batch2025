package in.co.nmsworks.week1.day2.string;

public class LargestWordInSentense
{
    public static void main(String[] args) {
        String givenName="this is my name is Kabilkumar";
        findLargestWord(givenName);
    }

    public static void findLargestWord(String getData)
    {
        String[] word=getData.split(" ");
        String first=word[0];
        for(int i=1;i< word.length;i++)
        {
            if (word[i].length() > first.length())
            {
                first=word[i];
            }
        }System.out.println(first);

        }
    }

