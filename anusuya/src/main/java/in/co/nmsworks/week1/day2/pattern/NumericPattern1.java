package in.co.nmsworks.week1.day2.pattern;

/*Numeric Pattern 1 :
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7 */

public class NumericPattern1 {

    static void printPattern (int num){

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int num = 7;
        printPattern(num);
    }
}
