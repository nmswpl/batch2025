/*
1
12
123
1234
12345
123456
1234567

 */
package in.co.nmsworks.week1.day2.Pattern;

public class NumericPattern1 {

    public static void main(String[] args) {
        numericPattern1(7);
    }

    public static void numericPattern1(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
