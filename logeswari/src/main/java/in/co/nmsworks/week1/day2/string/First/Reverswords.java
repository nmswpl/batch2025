package in.co.nmsworks.week1.day2.string.First;

//1. Write a program to reverse words in a Sentence.
//        Input : India is my country.
//Output: country my is India.

public class Reverswords {

    static void reverseDisplay(){
        String input="india is my country";
        String [] words=input.split(" ");
        System.out.println("output: ");

        for(int i= words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }


    }
    public static void main(String[] args) {
        reverseDisplay();





        }
    }



