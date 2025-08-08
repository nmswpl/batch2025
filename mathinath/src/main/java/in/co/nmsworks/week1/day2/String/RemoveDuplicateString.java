package in.co.nmsworks.week1.day2.String;
//7. Write a Java program to remove duplicate characters from a string while preserving the
//order of the first occurrences.
//Input: "aabbcc"
//Output: "abc"
public class RemoveDuplicateString {
    public static void main(String args[])
    {
        new RemoveDuplicateString().removeduplicate("aabbcc");
    }
    public void removeduplicate(String str)
    {
        String result="";
        for(int i=0;i<str.length();i++)
        {

            char ch = str.charAt(i);
            if(result.indexOf(ch)==-1)
            {
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
