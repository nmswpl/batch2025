package in.co.nmsworks.week1.day2.String;

//8. Write a Java method to convert a every word in a sentance to title case, where the first
//letter of each word is capitalized.
//        Input : "the quick brown fox jumps over the lazy dog";
//        Output: "The Quick Brown Fox Jumps Over The Lazy Dog"


public class ConvertTitleCase {
    public static void main(String args[])
    {
        new ConvertTitleCase().printConversion("the quick brown fox jumps over the lazy dog");
    }
    public void printConversion(String str)
    {
        String result="";
        String[] str2=str.split(" ");
        for(int i=0;i<str2.length;i++) {
            String word = str2[i];
            String firstletter = word.substring(0, 1).toUpperCase();
            String remainingLetters = word.substring(1).toLowerCase();
            result = result + firstletter + remainingLetters + " ";
        }
        System.out.print(result.trim());
    }
}
