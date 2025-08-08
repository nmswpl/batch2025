package in.co.nmsworks.week1.day2.string;

public class CountVowelConsonants {

    public static void main(String[] args) {

        String str = "Hello World";
        printCountVowelConsonants(str);
    }

    private static void printCountVowelConsonants(String str)
    {
       int vowel = 0;
       int consonants = 0;
       String convertWord = str.toLowerCase();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = convertWord.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowel++;
                }
                else
                {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels :" + vowel);
        System.out.println("Consonants :" + consonants);
    }
}
