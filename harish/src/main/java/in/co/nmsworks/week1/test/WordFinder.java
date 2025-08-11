package in.co.nmsworks.week1.test;

public class WordFinder {

    public static void main(String[] args) {

        String sentences = "Java is a popular programming language";
        String word = "Popular";
        findPosition(sentences, word);

    }

    public static void findPosition(String sentences,String word){

        String fisrtLetter = "" + word.charAt(0);
        int length = word.length()-1;
        String lastLetter = "" + word.charAt(length);
        String caseIncensitive = fisrtLetter.toLowerCase();
        System.out.println("Word found at index :" +sentences.indexOf(caseIncensitive));
        System.out.println("Fist letter of the word :" +fisrtLetter);
        System.out.println("Last letter of the word :" +lastLetter);
    }

}
