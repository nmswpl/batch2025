package in.co.nmsworks.week1.day2.string;

/*
8. Write a Java method to convert every word in a sentence to title case, where the first letter of each word is capitalized.
*/
class CapitalizeFirstLetterOfWords {
    public static void main(String[] args)
    {
        String str =  "the quick brown fox jumps over the lazy dog";
        capitalizeFirstLettersOfWords(str);
    }
    public static void capitalizeFirstLettersOfWords(String str)
    {
        String[] string = str.split(" ");
        for(String s : string)
        {
            System.out.print(s.substring(0, 1).toUpperCase() + s.substring(1) + " ");
        }
    }
}
