/*
 *
 **
 ***
 ****
 *****
 ******
 *******
 */
package in.co.nmsworks.week1.day2.pattern;

public class StarPattern {
    public static void main(String[] args) {
        int NoOfRows = 5;
        sTarPattern(NoOfRows);
    }
    public static void sTarPattern(int NoOfRows) {

        for(int i = 1;i <= NoOfRows; i++){

            for(int j = 1; j <= i; j++){

                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
