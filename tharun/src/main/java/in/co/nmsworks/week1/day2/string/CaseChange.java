package in.co.nmsworks.week1.day2.string;

/**
 * Write a Java method to convert a every word in a sentance to title case, where the first letter of each word is capitalized.
 * Input : "the quick brown fox jumps over the lazy dog";
 * Output: "The Quick Brown Fox Jumps Over The Lazy Dog"
 */
public class CaseChange {
    static void capitalizeWord(String value){
        String[] valueArray=value.split(" ");
        String sentence="";
        for(int i=0;i<valueArray.length;i++){
            String firstLetter=valueArray[i].substring(0,1).toUpperCase();
            String remainingLetter=valueArray[i].substring(1).toLowerCase();
            String fullWord=firstLetter+remainingLetter;
            sentence+=fullWord +" ";
        }
        System.out.println(sentence.trim());
    }
    public static void main(String[] args) {
        String inputSentence="the quick brown fox jumps over the lazy dog";
        capitalizeWord(inputSentence);
    }
}
