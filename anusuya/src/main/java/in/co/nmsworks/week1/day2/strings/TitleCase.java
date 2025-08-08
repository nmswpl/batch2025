package in.co.nmsworks.week1.day2.strings;

/*Write a Java method to convert a every word in a sentance to title case, where the first
letter of each word is capitalized.
Input : "the quick brown fox jumps over the lazy dog";
Output: "The Quick Brown Fox Jumps Over The Lazy Dog"
 */

public class TitleCase {

    public static void convertingEveryWordIntoTitleCase (String sentence){

        String[] splittedSentence = sentence.split(" ");
        System.out.println(" Input : " + sentence);
        System.out.print(" Output : ");

        for(int i = 0; i < splittedSentence.length; i++){
            String currentWord = splittedSentence[i];
            System.out.print(currentWord.substring(0,1).toUpperCase());
            System.out.print(currentWord.substring(1) + " ");
        }
    }

    public static void main(String[] args) {

        String sentence = "the quick brown fox jumps over the lazy dog";

        convertingEveryWordIntoTitleCase(sentence);
    }
}
