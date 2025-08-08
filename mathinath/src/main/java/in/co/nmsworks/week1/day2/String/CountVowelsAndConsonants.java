package in.co.nmsworks.week1.day2.String;
//6. Write a Java program to count the number of vowels and consonants in a given string.
//        Input: "Hello World"
//        Output: Vowels: 3, Consonants: 7
public class CountVowelsAndConsonants {
    public static void main(String[] args)
    {
        new CountVowelsAndConsonants().printvowelsandconsonants("Hello World");
    }
    public void printvowelsandconsonants(String str)
    {
        int  vowels=0;
        int consonants=0;
        String str1=str.toLowerCase();
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u')
            {
                vowels++;
            }
            else if (ch==' ')
            {
                continue;
            }
            else
            {
                consonants++;
            }
        }
        System.out.println("vowels: "+vowels);
        System.out.println("consonants: "+consonants);


    }
}
