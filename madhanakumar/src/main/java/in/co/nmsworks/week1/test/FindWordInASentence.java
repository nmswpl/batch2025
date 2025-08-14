package in.co.nmsworks.week1.test;

public class FindWordInASentence {
    public void isWordPresent(String s, String word){
        String str1 = s.toLowerCase();
        String str2 = word.toLowerCase();
        int index = str1.indexOf(str2);
        if (index != -1) {
            System.out.println("Word found at index: " + index);
            System.out.println("First character of the word: " + word.charAt(0));
            System.out.println("Last character of the word: " + word.charAt(word.length() - 1));
        } else {
            System.out.println("Word not found in the sentence.");
        }
    }

    public static void main(String[] args) {
        FindWordInASentence sentence = new FindWordInASentence();
        sentence.isWordPresent("Java is a popular programming language.", "Popular");
    }
}
