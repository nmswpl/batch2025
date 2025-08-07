package in.co.nmsworks.week1.day2.pattern;

/*Numeric Pattern 2:
1 1 1 1 1 1 1
2 2 2 2 2 2
3 3 3 3 3
4 4 4 4
5 5 5
6 6
7 */

public class NumericPattern2 {

    static void printPattern (int num){

        int value = 1;
        for(int i = num; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(value + " ");
            }
            value++;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int num = 7;
        printPattern(num);
    }
}
