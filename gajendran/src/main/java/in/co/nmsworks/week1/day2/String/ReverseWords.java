package in.co.nmsworks.week1.day2.String;

//1. Write a program to reverse words in a Sentence.
//Input : India is my country.
//Output:
//country my is India.


public class ReverseWords {


    public static void printSentenceInReverse(String str){

        String[] temp = str.trim().split(" ");
        int len = Integer.parseInt(String.valueOf(temp.length));
        for (int i = len - 1; i >= 0; i-- ){
            System.out.printf(temp[i] + " ");
        }

    }
    public static void main(String[] args) {
        String name= "Gajendran Working at NMS";
        printSentenceInReverse(name);

    }
}
