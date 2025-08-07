package in.co.nmsworks.week1.day2.patterns;

public class StarPattern {
    public static void main(String[] args) {
        starPattern(7);
            // *
            // * *
            // * * *
            // * * * *
            // * * * * *
            // * * * * * *
            // * * * * * * *
    }
    public static void starPattern(int n) {
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
