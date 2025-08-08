package in.co.nmsworks.week1.day2.String;
//3. Given a string str, write a Java program to print all words with even length in the given
//string.
//Input: s = "This is a java language"
//Output: This
// is
// java
// language
public class EvenLengthString {
    public static void main(String[] args)
    {
        new EvenLengthString().printEvenLengthString("This is a java Language");
    }
    public void printEvenLengthString(String str)
    {
        String[] str1=str.split(" ");
        for(int i=0;i<str1.length;i++)
        {

            if(str1[i].length()%2==0)
            {
                System.out.println(str1[i]);
            }

        }
    }
}
