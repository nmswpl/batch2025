package in.co.nmsworks.week1.day2.string;

public class FindLongestWordInString {
    //Write a program to print longest word present in the string
    public void findLongestWordInString(String s){
        String s1[] = s.split(" ");
        String result = "";
        for (int i = 0; i < s1.length; i++) {
            if(s1[i].length() >= result.length()){
                result = s1[i];
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        FindLongestWordInString lg = new FindLongestWordInString();
        lg.findLongestWordInString("The quick brown fox jumps over the lazy dog");
    }
}
