package in.co.nmsworks.week2.exam.set2;

public class ParagraphDetails {
    public void paragraphDetails(String s){
        int [] a = new int[3];
        int countSentence = 0;
        int countWords = 0;
        int countLetters = 0;
        String [] s1 = s.split("\\.");

        for (int i = 0; i < s1.length ; i++){
            countSentence += 1;
        }

        a[0] = countSentence;

        String[] s2 = s.split(" ");
        for (int i = 0; i < s2.length ; i++){
            countWords += 1;
        }

        a[1] = countWords;

        String s3 = s2.toString();

        char[] ch = s3.toCharArray();
        for (int i = 0; i < ch.length ; i++){
            countLetters += 1;
        }

        a[2] = countLetters;

        for (int i = 0; i < a.length ; i++){
            System.out.println(a[i]);
        }

        System.out.println();
    }
}

class testRunner{
    public static void main(String[] args) {
        ParagraphDetails pd = new ParagraphDetails();

        pd.paragraphDetails("The quick brown fox jumped over the lazy dog. It was a sunny day. The dog barked loudly.");
        pd.paragraphDetails("Alice went to the market to buy fresh apples. Bob followed her. They chatted along the way.");

    }
}
