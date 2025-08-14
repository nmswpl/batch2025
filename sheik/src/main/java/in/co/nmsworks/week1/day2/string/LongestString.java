package in.co.nmsworks.week1.day2.string;

import java.sql.SQLOutput;

public class LongestString
{
    public static void main(String[] args) {
        String str = "the quik brown fox";
        longestWord(str);
    }
    public static void longestWord(String str){
        String[] zs = str.split(" ");
        int index = 0;
        int len = 0 ;
        for(int i=0;i<zs.length;i++){
            if(zs[i].length() > len){
                len = zs[i].length();
                index = i;
            }
        }
        System.out.println(zs[index]);
    }
}

