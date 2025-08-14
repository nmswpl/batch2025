package in.co.nmsworks.week1.test;

public class SentenceWord {

        public static void main(String[] args) {
            printSentenceWord();
        }
        public static void printSentenceWord(){

            String sentence = "java is a popular programming language";
            String word = "popular";

            String lowerCaseSentence = sentence.toLowerCase();
            String lowerCaseWord = word.toLowerCase();

            int index = lowerCaseSentence.indexOf(lowerCaseWord);

            if (index != -1) {
                System.out.println("word found at index " + index);
                System.out.println("first character of word: " + word.charAt(0));
                System.out.println("last character of word: " + word.charAt(word.length() - 1));
            } else {
                System.out.println("Word not found in the sentence.");
            }

        }
    }



