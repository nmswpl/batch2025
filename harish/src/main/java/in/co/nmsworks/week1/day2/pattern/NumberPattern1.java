/*
1
12
123
1234
12345
123456
1234567
 */
package in.co.nmsworks.week1.day2.pattern;

public class NumberPattern1 {
    public static void main(String[] args) {
        int NoOfRows = 5;
        nUmberpattern(NoOfRows);
    }

    public static void nUmberpattern(int NoOfRows) {

        for(int i = 1;i <= NoOfRows; i++){

            for(int j = 1; j <= i; j++){

                System.out.print(j);
            }

            System.out.println("");
        }
    }
}
