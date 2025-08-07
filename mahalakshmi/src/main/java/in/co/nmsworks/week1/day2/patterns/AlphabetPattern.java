package in.co.nmsworks.week1.day2.patterns;

public class AlphabetPattern {
    public static void main(String[] args) {
        printAlphabetPattern(7);
            //        A
            //        B B
            //        C C C
            //        D D D D
            //        E E E E E
            //        F F F F F F
            //        G G G G G G G
    }

    public static void printAlphabetPattern(int n) {
        for(int i = 1,c = 65 ; i <= n ; i++,c++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print((char)c + " ");
            }
            System.out.println();
        }
    }

}
