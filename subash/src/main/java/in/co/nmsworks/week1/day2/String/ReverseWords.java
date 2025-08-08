package in.co.nmsworks.week1.day2.String;

public class ReverseWords {
    public static void main(String[] args)
    {
        String word="This is my Country and am subash";
        ReverseWords.reverseWords(word);
    }
    public static void reverseWords(String word)
    {
        String arr[]=word.split(" ");
        String reverse=" ";
        for(int i=arr.length-1;i>=0;i--)
        {
            reverse=reverse+arr[i]+" ";
        }
        System.out.println(reverse);
    }
}
