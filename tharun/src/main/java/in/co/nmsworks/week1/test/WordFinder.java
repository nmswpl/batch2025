package in.co.nmsworks.week1.test;

public class WordFinder {
    static void findingInputWord(String sentence , String word){
        String changeSentenceCase=sentence.toLowerCase(), changeWordCase=word.toLowerCase();
        if(changeSentenceCase.contains(changeWordCase)){
            System.out.println("Word found at index: "+changeSentenceCase.indexOf(changeWordCase));
            System.out.println("First character of the word: "+word.charAt(0));
            System.out.println("Last character of the word: "+word.charAt(word.length()-1));
        }
        else {
            System.out.println("Word Not Found");
        }

    }
    public static void main(String[] args) {
        String sentence="Java is a popular programming language.",wordToFind="Popular";
        findingInputWord(sentence,wordToFind);

    }
}
