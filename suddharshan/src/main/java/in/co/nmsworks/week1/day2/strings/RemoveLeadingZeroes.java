package in.co.nmsworks.week1.day2.strings;
/*
Given a number as String, write a program that removes the leading 0
Input :
0005640
output:
5640
 */
public class RemoveLeadingZeroes {
    public static void main(String[] args) {
        String str = "000005640";
        System.out.println(getString(str));
    }
    public static String getString(String s){
        int index = 0;
        while((index <= s.length()) && (s.charAt(index) == '0')){
            index ++;
        }
        return s.substring(index);
    }
}
