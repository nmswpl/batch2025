package in.co.nmsworks.week1.day2.String;

public class CountOfVowelsAndConsonants {

    public static void main(String[] args)
    {
        String word="Hello World";
        CountOfVowelsAndConsonants.numberofVowelsAndConsonants(word);
    }
    public static void numberofVowelsAndConsonants(String word)
    {
        int count=0;
        int consonants=0;
        String lowercaseword=word.toLowerCase();
        for(int i=0;i<word.length();i++)
        {
            char ch=lowercaseword.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                count++;
            else if(ch==' ')
                continue;
            else
                consonants++;
            }
        System.out.println(count);
        System.out.println(consonants);
        }

    }


