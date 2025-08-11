package in.co.nmsworks.week1.test;

public class WordInTheSentence
{
    public static void main(String[] args) {
        String str = "Java is a popular programming language";
        String word = "Popular";
        printRequiredInfo(str, word);
    }

    public static void printRequiredInfo(String str, String word)
    {
        System.out.println("Word found at index : " + str.toLowerCase().indexOf(word.toLowerCase()));
        System.out.println("First character of the word : " + word.charAt(0));
        System.out.println("Last character of the word : " + word.charAt(word.length() - 1));
    }
}
