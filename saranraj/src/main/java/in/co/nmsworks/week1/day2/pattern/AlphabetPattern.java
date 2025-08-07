package in.co.nmsworks.week1.day2.pattern;

/*

A
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G

 */

public class AlphabetPattern {

    public static void main(String[] args) {
        int n = 7;
        printAlphabetPattern(n);
    }
    public static void printAlphabetPattern(int n) {

        int ascii=65;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {

                System.out.print(" " + (char)ascii);

            }
            ascii++;
            System.out.println();
        }
    }
}
