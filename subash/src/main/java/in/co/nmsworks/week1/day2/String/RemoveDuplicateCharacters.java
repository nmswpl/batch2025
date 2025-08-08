package in.co.nmsworks.week1.day2.String;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        String word="aabbcc";
        removeDplicates(word);
    }
    public static void removeDplicates(String word)
    {
        String result="";
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(result.indexOf(ch)==-1)
                result = result + ch;
        }
        System.out.println(result);
    }
}
