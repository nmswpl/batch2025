
package in.co.nmsworks.week1.Test;


public class SentenceAndWord {
    public static void main(String[] args) {

        String str = "Java is a popular programming language";
        String word = "Popular";
        sentanceWord(str, word);
    }

    public static void sentanceWord(String s, String w) {

        String temp = w;
        char c = w.charAt(0);
        int n = w.length();
        if (s.toUpperCase().contains(temp.toUpperCase())) {
            System.out.println(s.indexOf(w.indexOf(c)));
            System.out.println("First character of the word :" + w.charAt(0));
            System.out.println("Last character of the word : " + w.charAt(n-1));
        }

    }
}
