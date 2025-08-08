package in.co.nmsworks.week1.day2.string;

//9. Write a Java method to find the longest word in a given sentence.
class LongestWord {

    public static void main(String[] args)
    {
        String str =  "the quick brown fox jumps over the lazy dog";
        System.out.println(findLongestWord(str));
    }

    public static String findLongestWord(String str)
    {
        String[] string = str.split(" ");
        int maxWordLen = 0;
        String maxWord = "";
        for(String s : string)
        {
            if(s.length() >= maxWordLen)
            {
                maxWordLen = s.length();
                maxWord = s;
            }
        }
        return maxWord;
    }
}

