package in.co.nmsworks.week1.day2.string;

public class FirstLetterCaptial {

    public static void main(String[] args) {

        String sentence = "the quick brown fox jumps over the lazy dog";
        printFirstLetterCaptial(sentence);

    }

    private static void printFirstLetterCaptial(String str)
    {
        String [] words = str.split(" ");
        String result = "";
        for(String word : words){
            if(word.length() > 0){
                String first = word.substring(0,1).toUpperCase();
                String last = word.substring( 1).toLowerCase();
                result += first + last + " ";
            }


        }
        System.out.println(result.trim());
    }
}
