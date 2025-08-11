package in.co.nmsworks.week1.test;

public class FindWordInASentence {
    public void isWordPresent(String s, String word){
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            String s2 = s1[i];
            if (s2.equalsIgnoreCase(word)){
                System.out.println("Word Found at the index of : "+s.indexOf(s2));
                System.out.println("First Character : "+word.charAt(0));
                System.out.println("Last Character : "+word.charAt(word.length()-1));
            }
        }
    }

    public static void main(String[] args) {
        FindWordInASentence sentence = new FindWordInASentence();
        sentence.isWordPresent("Java is a popular programming language.", "Popular");
    }
}
