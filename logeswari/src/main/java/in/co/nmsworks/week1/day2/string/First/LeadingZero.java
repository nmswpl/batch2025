package in.co.nmsworks.week1.day2.string.First;
//given a number as String, write a program that removes the leading 0
//Input : 0005640
//output: 5640


public class LeadingZero {
    static void leadindZeroNum(){
        String input="0005640";
        String output=input.replaceFirst("^0+" , " ");
        System.out.println(output);
    }

    public static void main(String[] args) {
        leadindZeroNum();
    }
}
