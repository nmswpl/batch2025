package in.co.nmsworks.week1.day2.String;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class ToFindLongestWord {

    public static void main(String[] args) {
        String sentence="The quick brown fox jumps over the lazy dog";
        findingLongestWord(sentence);
    }
    public static void findingLongestWord(String sentence)
    {

        String arr[]=sentence.split(" ");
        String maxLength=" ";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()>maxLength.length() || arr[i].length()==maxLength.length())
            {
                maxLength = arr[i];
            }
        }
        System.out.println(maxLength);
    }
}
