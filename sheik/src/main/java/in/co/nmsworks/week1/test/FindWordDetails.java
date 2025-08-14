package in.co.nmsworks.week1.test;

public class FindWordDetails
{
    public static void main(String[] args) {
        String sentence = "Java is a popular program";
        String word = "Popular";
        printWordDetails(sentence , word);
    }
    public static void printWordDetails(String sentence , String word)
    {

        System.out.println("Word found at index : " + sentence.indexOf(word.toLowerCase()));
        System.out.println("First Char Of Word: " + sentence.charAt(sentence.indexOf(word.toLowerCase())));
        int i = sentence.indexOf(word.toLowerCase());
        while(sentence.charAt(i) != ' '){
            i++;
        }
        i=i-1;
        System.out.println("Last Char of Word :" + sentence.charAt(i));


    }
}
