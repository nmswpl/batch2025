package in.co.nmsworks.week2.examset1;

//Question 3
//Write a method that converts a given Statement to title case. In title case, the first letter of each
//word is capitalized, and all other letters are in lowercase.

public class TitleCase {

    static String str = "i love java";
    static String[] strarr = str.split(" ");


    public static void main(String[] args) {
        for (String s : strarr) {
            System.out.print(s.substring(0,1).toUpperCase() + s.substring(1) + " ");
        }
    }
}
