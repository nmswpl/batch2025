package in.co.nmsworks.week1.test;

public class Sentence {

    public static void main(String[] args) {

        String sentence = "Java is a popular programming language";
        String findWord = "Popular";
        printIndexOfSentence(sentence,findWord);
    }

    private static void printIndexOfSentence(String sentence,String findWord) {
        System.out.println(sentence.indexOf(findWord.toLowerCase()));
        System.out.println(findWord.charAt(0));
        System.out.println(findWord.charAt(findWord.length()-1));
    }
}
