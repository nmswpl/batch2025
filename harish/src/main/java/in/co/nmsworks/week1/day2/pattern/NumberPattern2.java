/*
1111111
222222
33333
4444
555
66
7
 */
package in.co.nmsworks.week1.day2.pattern;

public class NumberPattern2 {
    public static void main(String[] args) {
        int NoOfRows = 5;
        nUmberPattern(NoOfRows);
    }
    public static void nUmberPattern(int NoOfRows){
        for(int i = 1; i <= 5; i++){
            for(int j = NoOfRows; j >= i;j--){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
