package in.co.nmsworks.week1.day2.string;
public class LongestWord {

    // 9. Write a Java method to find the longest word in a given sentence
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(findLongestWord(str));

    }

    public static String findLongestWord(String str) {
        String[] arr = str.split(" ");
        int index = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i].length() >= max) {
                max = arr[i].length();
                index = i;
            }
        }
        return arr[index];
    }
}
