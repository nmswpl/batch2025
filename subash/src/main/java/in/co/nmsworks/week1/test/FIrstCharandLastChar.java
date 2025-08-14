package in.co.nmsworks.week1.test;

public class FIrstCharandLastChar {

    public static void main(String[] args) {

        String sentence = "Java is a popular programming language";
        String word="popular";
        findingFirstCharAndLastChar(sentence,word);
    }

    public static void findingFirstCharAndLastChar(String sentence,String word)
    {
        String firstposition="";
        String lastposition="";
        int wordposition=0;
        if(sentence.contains(word))
        {
            wordposition=sentence.indexOf(word);
            firstposition = word.substring(0,1);
            lastposition = word.substring(word.length()-1);
            System.out.println("Word found at Index "+wordposition);
            System.out.println("First character of word :"+firstposition);
            System.out.println("Last character of word :"+lastposition);
        }
        else
            System.out.println("Word not Found");
    }
}
