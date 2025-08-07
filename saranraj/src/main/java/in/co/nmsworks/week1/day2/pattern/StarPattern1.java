package in.co.nmsworks.week1.day2.pattern;

/*

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *

 */


public class StarPattern1 {
    public static void main(String[] args) {
        printStarPattern();
    }

    private static void printStarPattern() {
        for(int i=1;i<=7;i++){
            for(int j=1;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
