package in.co.nmsworks.week1.day2.string;

public class LongestString {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        printLongestString(str);
    }

    private static void printLongestString(String str) {
        String [] words = str.split(" ");
        String longestWord = "";
        for(String word : words){
            if(word.length() >= longestWord.length()){
                longestWord = word;
            }
        }
        System.out.println(longestWord);
    }

}
