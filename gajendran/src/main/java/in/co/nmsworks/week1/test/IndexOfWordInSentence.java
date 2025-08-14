package in.co.nmsworks.week1.test;

public class IndexOfWordInSentence {

    public void printIndexOfWordInSentence(String sentence, String word){
        System.out.println("Word found at index : " + sentence.toUpperCase().indexOf(word.toUpperCase()));
        System.out.println("First character of the word : "+word.charAt(0));
        System.out.println("Last character of the word : "+word.charAt(word.length() - 1));
    }

}
