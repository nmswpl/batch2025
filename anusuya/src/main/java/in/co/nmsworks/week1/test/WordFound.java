package in.co.nmsworks.week1.test;

public class WordFound {

    public static void checkWordInSentence(String sentence, String searchWord){

        boolean isPresent = sentence.toLowerCase().contains(searchWord.toLowerCase());

        int index = 0;
        if(isPresent){
            index = sentence.toLowerCase().indexOf(searchWord.toLowerCase());
        }
        else{
            System.out.println("Word not found!!");
        }

        System.out.println(index);
        System.out.println("First Character of the word : " + searchWord.charAt(0));
        System.out.println("Last Character of the word : " + searchWord.charAt(searchWord.length()-1));
    }

    public static void main(String[] args) {

        String sentence = "Java is a popular programming language";
        String word = "Popular";

        checkWordInSentence(sentence, word);
    }
}
