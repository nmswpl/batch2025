package in.co.nmsworks.week1.day2.string;

import java.sql.SQLOutput;

public class CountVowelConsonant
{
    public static void main(String[] args) {
        String str = "Hello world";
        //int vow =
        getCount(str.toLowerCase());
        //System.out.print(vow);
    }
    public static void getCount(String str)
    {

        int i =0;
        int vowcount =0 ;
        int concount =0 ;
        while(i<str.length()){

            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowcount++;
            }
            else if(ch == ' ')
            {
               System.out.print("");
            }
            else{
                concount++;
            }

            i++;
        }


        System.out.print("Vowels:"  + vowcount + "" + " Consonant:" + concount);

    }
}
