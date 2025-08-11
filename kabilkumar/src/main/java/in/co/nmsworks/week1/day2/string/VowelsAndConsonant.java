package in.co.nmsworks.week1.day2.string;

public class VowelsAndConsonant {
    public static void  main(String[] args)
    {
        String givenWord="apple";
       findVowelsAndConsonant(givenWord);
    }
    public static void findVowelsAndConsonant(String value)
    {
        value.toLowerCase();
        int vowels=0;
        int consonants=0;
        int i=0;

        while (i<value.length())
        {
            char ch=value.charAt(i);
            if (ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowels++;
            }
            else
            {
                consonants++;
            }
             i++;
        }
        System.out.println("Vowels :" +vowels);
        System.out.println("Consonants :"+consonants);
    }
}
