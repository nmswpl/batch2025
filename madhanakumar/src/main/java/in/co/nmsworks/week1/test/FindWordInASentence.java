package in.co.nmsworks.week1.test;

public class FindWordInASentence {
    public void isWordPresent(String s, String word){
        String[] s1 = s.split(" ");
        char[] ch = s.toCharArray();
        char[] ch1 = word.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals(word.toLowerCase())){

            }
        }
    }

    public static void main(String[] args) {
        FindWordInASentence sentence = new FindWordInASentence();
        sentence.isWordPresent("Java is a popular programming language.", "Popular");
    }
}
