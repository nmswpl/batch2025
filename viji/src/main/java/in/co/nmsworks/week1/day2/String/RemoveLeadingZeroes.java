/*Given a number as String, write a program that removes the leading 0
Input :
0005640
output:
5640
*/
package in.co.nmsworks.week1.day2.String;


public class RemoveLeadingZeroes {
    public static void main(String[] args) {
        removeLeadingZeroes("0005640");
    }

    public static void removeLeadingZeroes(String input) {
        String output = "";
        boolean flag = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch=='0' && flag)
            {
                continue;
            }
            else{
                flag= false;
                output = output + ch;
            }
        }
        System.out.println(output);

    }
}
