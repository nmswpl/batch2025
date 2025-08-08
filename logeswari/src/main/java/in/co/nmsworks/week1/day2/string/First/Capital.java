package in.co.nmsworks.week1.day2.string.First;
//
//Write a Java method to convert a every word in a sentance to title case, where the first
//letter of each word is capitalized.
//Input : "the quick brown fox jumps over the lazy dog";
//Output: "The Quick Brown Fox Jumps Over The Lazy Dog"

public class Capital {

    static void firstCaplital(){
        String input="the quick brown fox jumps over the lazy dog";
        String [] words=input.split(" ");
//        String result="";
        for(String word:words){
            System.out.print(word.substring(0,1).toUpperCase());
            System.out.print(word.substring(1)+" ");
        }

    }

    public static void main(String[] args) {
        firstCaplital();
    }
}
