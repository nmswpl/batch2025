package in.co.nmsworks.week1.day2.string;

public class ReverseTheWords {
    // Write a program to reverse the words in given string
    public void reverseWords(String s){
          String s1[] = s.split(" ");
          String result = " ";
          for (int i = s1.length-1 ; i >=0 ; i--) {
            result += s1[i]+" ";
          }
          System.out.println(result.trim());
    }
    public static void main(String[] args) {
        ReverseTheWords r = new ReverseTheWords();
        r.reverseWords("India is my country");

    }
}
