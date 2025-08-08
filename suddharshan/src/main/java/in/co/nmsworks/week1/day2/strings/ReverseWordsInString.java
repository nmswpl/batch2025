package in.co.nmsworks.week1.day2.strings;

import java.util.Arrays;

/*
1. Write a program to reverse words in a Sentence.
Input : India is my country.
Output: country my is India.
 */
public class ReverseWordsInString {
    public static void main(String[] args) {
        String statements = "India is my country.";
        System.out.println(getReverse(statements));
    }
    public static String getReverse(String x) {
        String arr [] = x.split(" ");
        int len = arr.length;
        String res = "";
        for(int i = len-1; i >=0 ; i--){
            if(i == len-1){
              res = arr[i].substring(0,arr[i].length()-1) + " " ;
            }
            else if (i == 0){
                res = res+arr[i];
            }
            else{
                res = res+arr[i]+" ";
            }
        }
        return res +".";
    }

}
