package in.co.nmsworks.week1.day2.pattern;

/* Star Pattern 1 :
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * * */

public class StarPattern {

    static void printPattern ( int limit ){

        for(int i = 1; i <= limit; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int limit = 8;
        printPattern(limit);
    }
}
