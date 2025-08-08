package in.co.nmsworks.week1.day2.string;
public class TitleCaseConversion {
    // 9. Write a Java method to find the longest word in a given sentence.
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        printWordsInTitleCase(str);
    }

    public static void printWordsInTitleCase(String str) {
        String[] arr = str.split(" ");
        String res = "";
        for(String s : arr) {
            if(s.length() > 0) {
                res += s.substring(0,1).toUpperCase() + s.substring(1,s.length()).toLowerCase() + " ";

            }
        }
        System.out.println(res);
    }
}
