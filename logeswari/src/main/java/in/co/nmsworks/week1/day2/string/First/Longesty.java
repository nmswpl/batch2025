package in.co.nmsworks.week1.day2.string.First;
//Write a Java method to find the longest word in a given sentence.
//        Input: "The quick brown fox jumps over the lazy dog"
//Output: "jumps

public class Longesty {
    static void longWord() {
        String sentence= "the quick brown fox jumps over the lazy dog";
        String[] words = sentence.split(" ");
        String result = "";

        for(String word: words){
            if(word.length()>result.length()){
                result=word;
            }
        }
        System.out.println("output:"+result);
    }

    public static void main(String[] args) {
        longWord();
    }

}
