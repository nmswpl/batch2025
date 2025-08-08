package in.co.nmsworks.week1.day2.string;

public class EvenWords {

    public static void main(String[] args) {

        String sentence = "This is Java Language";
        printEvenWords(sentence);
    }

    private static void printEvenWords(String sentence)
    {

         String [] words = sentence.split(" ");
         for(String check : words)
         {
             if(check.length() % 2 == 0)
             {
                 System.out.println(check);
             }
         }
    }
}
