package in.co.nmsworks.week1.day2.strings;
//2.Write a program to reverse words in a Sentence.
//Input : India is my country.
//Output:
//country my is India.
public class ReversWord {
    public static void main(String[] args) {
             printReverseWord();
    }
    public static void printReverseWord(){
        String input="India is my country";
        String[] words=input.split(" ");
        for(int i=words.length-1;i>=0;i--){
            System.out.println(words[i]);
            if(i>0){
                System.out.println(" ");
            }
        }
    }
}
