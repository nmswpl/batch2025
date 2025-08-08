/*
. Given a number as String, write a program that removes the leading 0
Input :0005640
output:5640
 */
package in.co.nmsworks.week1.day2.string;

public class RemovingLeadingZero {
    public static void main(String[] args) {
        String number = "005640";
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) != '0'){
                System.out.println("The Removed leading zeros in the given string :" + number.substring(i));
                break;
            }
        }
        //System.out.println("The string with removed leading zeros: "+ number.trim('0'));
    }
}
