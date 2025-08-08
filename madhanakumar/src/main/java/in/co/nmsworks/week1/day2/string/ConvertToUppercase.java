package in.co.nmsworks.week1.day2.string;

import java.util.Arrays;

public class ConvertToUppercase {
    // Write a program to convert the Word's First letter into uppercase
    public void convertIntoUppercase(String s){
        String s1[] = s.split(" ");
        String result = "";
        for (int i = 0; i < s1.length; i++) {
            String s2 = s1[i];
            String firstletter = s2.substring(0,1).toUpperCase();
            String secondletter = s2.substring(1).toLowerCase();
            result += firstletter + secondletter + " ";
        }
        System.out.println(result.trim());


    }

    public static void main(String[] args) {
        ConvertToUppercase up = new ConvertToUppercase();
        up.convertIntoUppercase("the quick brown fox jump over the lazy dog");
    }
}
