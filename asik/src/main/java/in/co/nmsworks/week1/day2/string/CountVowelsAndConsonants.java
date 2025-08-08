package in.co.nmsworks.week1.day2.string;

/*
6. Write a Java program to count the number of vowels and consonant in a given string.
*/
class CountVowelsAndConsonants {
    public static void main(String[] args)
    {
        String str = "Hello World";
        countVowelsAndConsonants(str);
    }
    public static void countVowelsAndConsonants(String str)
    {
        int vowelsCount = 0, consonantsCount = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e' || str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o' || str.toLowerCase().charAt(i) == 'u')
            {
                vowelsCount++;
            }
            else if(str.charAt(i) != ' ')
            {
                consonantsCount++;
            }
        }
        System.out.println("Vowels : " + vowelsCount + ", " + "Consonants : " + consonantsCount);
    }
}